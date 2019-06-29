package co.edu.poligran.bibliopoli.persistent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Reserva implements Serializable {

  @Id
  private long idReserva;
  private java.sql.Date fecha;
  private long libro;
  private String usuario;
  private String tipoDeUsuario;
  private String estado;

}
