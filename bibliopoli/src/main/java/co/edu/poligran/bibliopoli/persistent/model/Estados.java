package co.edu.poligran.bibliopoli.persistent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Estados implements Serializable {

  @Id
  private long id;
  private String nombre;

}
