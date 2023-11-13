package AlaaElmeleh.U2W2D5.services;

import AlaaElmeleh.U2W2D5.security.JWTTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UtenteService utenteService;
    @Autowired
    private JWTTools jwtTools;
}
