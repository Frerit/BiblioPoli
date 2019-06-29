package co.edu.poligran.bibliopoli.repository;

import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoginRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u " +
            "WHERE u.cedula = :cedula")
    Usuario getUsuarioByCedula(@Param("cedula") String cedula);

}