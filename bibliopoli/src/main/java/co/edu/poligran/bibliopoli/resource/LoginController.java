package co.edu.poligran.bibliopoli.resource;

import co.edu.poligran.bibliopoli.persistent.dto.LoginDto;
import co.edu.poligran.bibliopoli.persistent.model.Estados;
import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import co.edu.poligran.bibliopoli.repository.EstadoRepository;
import co.edu.poligran.bibliopoli.servive.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Base64;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;

@RestController
public class LoginController {

    @Autowired
    private LoginService service;

    @Autowired
    private EstadoRepository estadoRepository;

    @GetMapping("/login")
    public Mono<LoginDto> validarLogin(@RequestHeader HttpHeaders headers) {
        String userbyLog = headers.get("userLog").get(0);

        Usuario usuario = service.getUser(userbyLog).block();

        if (Objects.isNull(usuario))
            return Mono.error(new Throwable("Usuario Invalido"));

        Estados estado = estadoRepository.findById(usuario.getEstadoUsuario()).get();
        return Mono.just(loginMapper(usuario, estado));
    }

    private LoginDto loginMapper(Usuario user, Estados estado) {
        LoginDto transfer = new LoginDto();
        user.setPassword(Base64.getEncoder().encodeToString(user.getPassword().getBytes()));
        transfer.setUsuario(user);
        transfer.setCedula(user.getCedula());
        transfer.setEstado(estado);
        transfer.setTimestamp(new Date());
        return transfer;
    }

}
