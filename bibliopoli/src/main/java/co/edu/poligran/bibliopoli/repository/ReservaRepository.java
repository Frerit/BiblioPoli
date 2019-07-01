package co.edu.poligran.bibliopoli.repository;

import co.edu.poligran.bibliopoli.persistent.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
