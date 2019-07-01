package co.edu.poligran.bibliopoli.resource;

import co.edu.poligran.bibliopoli.persistent.dto.ReservaDto;
import co.edu.poligran.bibliopoli.persistent.model.Reserva;
import co.edu.poligran.bibliopoli.service.ReservaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ReservaController {

    @Autowired
    private ReservaServiceImp service;

    @PostMapping("/saveReserva")
    public Mono<Reserva> saveReservabyUser(@RequestBody ReservaDto reserva) {
        return service.save(reserva);
    }
}
