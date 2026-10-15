package massane.fatimazahra.jwtspringg.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;






import massane.fatimazahra.jwtspringg.entity.AppUser;
import massane.fatimazahra.jwtspringg.repository.UserRepository;

@Service
public class CustomerUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    // Injection de dépendance via le constructeur
    public CustomerUserDetailsService(UserRepository repository) {
        this.userRepository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Récupération de l'utilisateur depuis la base de données
        AppUser utilisateur = userRepository
                .findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur introuvable"));

        // Construction de l'objet UserDetails requis par Spring Security
        return User.builder()
                .username(utilisateur.getEmail())
                .password(utilisateur.getPassword())
                .roles(utilisateur.getRole())
                .build();
    }
}
