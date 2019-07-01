package co.edu.poligran.bibliopoli.service;

import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<Usuario> getUser(String user);

    void saveUser(Usuario usuario);
}
