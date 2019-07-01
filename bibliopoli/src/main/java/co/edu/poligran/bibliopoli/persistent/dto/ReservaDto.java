package co.edu.poligran.bibliopoli.persistent.dto;

import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservaDto {

    private String title;
    private String subtitle;
    private String authors;
    private String pages;
    private String categoria;
    private String estado;
    private Usuario user;
}
