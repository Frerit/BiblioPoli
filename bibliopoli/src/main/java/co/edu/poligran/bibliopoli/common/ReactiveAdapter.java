package co.edu.poligran.bibliopoli.common;

import org.springframework.data.jpa.repository.JpaRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public abstract class ReactiveAdapter<T> implements ReactiveCrud<T> {
    private JpaRepository<T, Long> repository;

    public ReactiveAdapter(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    public Flux<T> all() {
        return Flux.fromStream(this.repository.findAll().stream());
    }

    public Mono<T> byId(long id) {
        return Mono.just(this.repository.getOne(id));
    }

    public Mono<T> save(T task) {
        return Mono.just(this.repository.save(task));
    }

    public Mono<T> update(T task) {
        return Mono.just(this.repository.save(task));
    }

    public Mono<Void> delete(long thingId) {
        this.repository.deleteById(thingId);
        return Mono.empty();
    }
}
