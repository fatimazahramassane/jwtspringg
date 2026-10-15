package massane.fatimazahra.jwtspringg.controllers;



import massane.fatimazahra.jwtspringg.repository.UserRepository;
import massane.fatimazahra.jwtspringg.repository.UserRepository;
import massane.fatimazahra.jwtspringg.service.CustomerUserDetailsService;
import massane.fatimazahra.jwtspringg.service.JwtService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    private AuthenticationManager authenticationManager;
    private JwtService jwtService;
    private CustomerUserDetailsService customerUserDetailsService;




}
