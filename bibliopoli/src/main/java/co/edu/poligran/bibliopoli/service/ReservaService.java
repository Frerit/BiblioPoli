package co.edu.poligran.bibliopoli.service;

import co.edu.poligran.bibliopoli.persistent.dto.ReservaDto;
import co.edu.poligran.bibliopoli.persistent.model.Reserva;
import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import reactor.core.publisher.Mono;

public interface ReservaService {

    Mono<Reserva> save(ReservaDto reservaDto);

    Mono<Reserva> getReserva(Usuario user);
}
