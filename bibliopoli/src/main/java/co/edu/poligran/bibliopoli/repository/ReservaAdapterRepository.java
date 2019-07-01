package co.edu.poligran.bibliopoli.repository;

import co.edu.poligran.bibliopoli.common.ReactiveCrud;
import co.edu.poligran.bibliopoli.persistent.model.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class ReservaAdapterRepository implements ReactiveCrud<Reserva> {

    @Autowired
    private ReservaRepository repository;

    @Override
    public Flux<Reserva> all() {
        return null;
    }

    @Override
    public Mono<Reserva> byId(long var1) {
        return null;
    }

    @Override
    public Mono<Reserva> save(Reserva reserva) {
        return Mono.just(repository.save(reserva));
    }

    @Override
    public Mono<Reserva> update(Reserva var1) {
        return null;
    }

    @Override
    public Mono<Void> delete(long var1) {
        return null;
    }
}
