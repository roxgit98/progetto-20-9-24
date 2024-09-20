package davidegiliberti.progetto_20_9_24.security;

import davidegiliberti.progetto_20_9_24.entities.Utente;
import davidegiliberti.progetto_20_9_24.exceptions.UnauthorizedEx;
import davidegiliberti.progetto_20_9_24.services.UtenteService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.UUID;

public class JWTCheckFilter extends OncePerRequestFilter {
    @Autowired
    private JWTTools jwtTools;
    @Autowired
    private UtenteService utenteService;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer "))
            throw new UnauthorizedEx("inserisci il token correttamente");

        String accessToken = authHeader.substring(7);
        jwtTools.verifyToken(accessToken);
        String id = jwtTools.extractIdFromToken(accessToken);
        Utente current = this.utenteService.findById(UUID.fromString(id));
        Authentication authentication = new UsernamePasswordAuthenticationToken(current, null, current.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        filterChain.doFilter(request, response);
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        return new AntPathMatcher().match("/auth/**", request.getServletPath());
    }
}
