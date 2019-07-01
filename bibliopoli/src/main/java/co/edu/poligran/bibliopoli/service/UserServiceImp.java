package co.edu.poligran.bibliopoli.service;

import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import co.edu.poligran.bibliopoli.repository.UserAdapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserAdapterRepository repository;

    @Override
    public Mono<Usuario> getUser(String user) {
        return repository.findById(user);
    }

    @Override
    public void saveUser(Usuario usuario) {
        repository.save(usuario);
    }
}
