package co.edu.poligran.bibliopoli.persistent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Libro implements Serializable {

  @Id
  private long idLibro;
  private String nombre;
  private long paginas;
  private String autor;
  private String tipoUsuarioAutor;
  private long categoria;
  private long estado;


}
