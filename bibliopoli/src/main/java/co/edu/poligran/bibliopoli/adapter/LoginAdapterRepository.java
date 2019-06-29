package co.edu.poligran.bibliopoli.adapter;

import co.edu.poligran.bibliopoli.common.ReactiveCrud;
import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import co.edu.poligran.bibliopoli.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class LoginAdapterRepository implements ReactiveCrud<Usuario> {

    @Autowired
    private LoginRepository repository;

    public LoginAdapterRepository(LoginRepository repository) {
        this.repository = repository;
    }

    public Mono<Usuario> findById(String cedula) {
        return Mono.just(repository.getUsuarioByCedula(cedula));
    }

    @Override
    public Flux<Usuario> all() {
        return null;
    }

    @Override
    public Mono<Usuario> byId(long var1) {
        return null;
    }

    @Override
    public Mono<Usuario> save(Usuario var1) {
        return null;
    }

    @Override
    public Mono<Usuario> update(Usuario var1) {
        return null;
    }

    @Override
    public Mono<Void> delete(long var1) {
        return null;
    }
}
