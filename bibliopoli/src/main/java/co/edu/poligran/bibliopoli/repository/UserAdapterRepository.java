package co.edu.poligran.bibliopoli.repository;

import co.edu.poligran.bibliopoli.common.ReactiveCrud;
import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import co.edu.poligran.bibliopoli.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class UserAdapterRepository implements ReactiveCrud<Usuario> {

    @Autowired
    private UserRepository repository;

    public UserAdapterRepository(UserRepository repository) {
        this.repository = repository;
    }

    public Mono<Usuario> findById(String cedula) {
        try {
            return Mono.just(repository.getUsuarioByCedula(cedula));
        } catch (Exception e) {
            return Mono.error(new Exception("No se encontro Usuario"));
        }
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
    public Mono<Usuario> save(Usuario u) {
        repository.save(u);
        return Mono.empty();
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
