package co.edu.poligran.bibliopoli.service;

import co.edu.poligran.bibliopoli.persistent.dto.ReservaDto;
import co.edu.poligran.bibliopoli.persistent.model.Reserva;
import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import co.edu.poligran.bibliopoli.repository.ReservaAdapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ReservaServiceImp implements ReservaService {

    @Autowired
    private ReservaAdapterRepository repository;

    @Override
    public Mono<Reserva> save(ReservaDto reservaDto) {
        return repository.save(new Reserva());
    }

    @Override
    public Mono<Reserva> getReserva(Usuario user) {
        return repository.byId(1L);
    }
}
