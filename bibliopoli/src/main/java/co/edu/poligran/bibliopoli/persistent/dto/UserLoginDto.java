package co.edu.poligran.bibliopoli.persistent.dto;

import co.edu.poligran.bibliopoli.persistent.model.Estados;
import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserLoginDto {

    private String cedula;
    private Date timestamp;
    private Estados estado;
    private Usuario usuario;

    public UserLoginDto() {
    }

}
