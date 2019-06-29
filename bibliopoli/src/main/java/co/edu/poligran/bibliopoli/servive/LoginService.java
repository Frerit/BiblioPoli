package co.edu.poligran.bibliopoli.servive;

import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import reactor.core.publisher.Mono;

public interface LoginService {

    Mono<Usuario> getUser(String user);
}
