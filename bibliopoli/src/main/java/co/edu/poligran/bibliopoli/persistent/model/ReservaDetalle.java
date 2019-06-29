package co.edu.poligran.bibliopoli.persistent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class ReservaDetalle implements Serializable {

  @Id
  private String idReservaDetalle;
  private String fechaSalida;
  private String fechaIngreso;
  private String estado;
  private String idReserva;


}
