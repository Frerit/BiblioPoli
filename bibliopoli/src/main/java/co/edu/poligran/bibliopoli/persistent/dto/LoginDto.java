package co.edu.poligran.bibliopoli.persistent.dto;

import co.edu.poligran.bibliopoli.persistent.model.Estados;
import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LoginDto {

    private String cedula;
    private Date timestamp;
    private Estados estado;
    private Usuario usuario;

    public LoginDto() {
    }

    public LoginDto(String cedula, Date timestamp, Estados estado, Usuario usuario) {
        this.cedula = cedula;
        this.timestamp = timestamp;
        this.estado = estado;
        this.usuario = usuario;
    }
}
