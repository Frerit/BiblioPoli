package co.edu.poligran.bibliopoli.servive;

import co.edu.poligran.bibliopoli.persistent.model.Estados;
import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import co.edu.poligran.bibliopoli.adapter.LoginAdapterRepository;
import co.edu.poligran.bibliopoli.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    private LoginAdapterRepository repository;

    @Override
    public Mono<Usuario> getUser(String user) {
        return repository.findById(user);
    }

}
