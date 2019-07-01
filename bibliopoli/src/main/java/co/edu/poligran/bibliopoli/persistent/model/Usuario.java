package co.edu.poligran.bibliopoli.persistent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Usuario implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long codUsuario;
  private String cedula;
  private String nombre;
  private String primerApellido;
  private String segundoApellido;
  private String password;
  private String telefono;
  private String celular;
  private String direccion;
  private String paisNacimiento;
  private java.sql.Date fechaNacimiento;
  private String tiposUsuario;
  private long estadoUsuario;


}
