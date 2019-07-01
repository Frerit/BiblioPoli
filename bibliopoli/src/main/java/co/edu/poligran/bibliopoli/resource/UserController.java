package co.edu.poligran.bibliopoli.resource;

import co.edu.poligran.bibliopoli.persistent.dto.UserLoginDto;
import co.edu.poligran.bibliopoli.persistent.model.Estados;
import co.edu.poligran.bibliopoli.persistent.model.Usuario;
import co.edu.poligran.bibliopoli.repository.EstadoRepository;
import co.edu.poligran.bibliopoli.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


import java.util.Base64;
import java.util.Date;
import java.util.Objects;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private EstadoRepository estadoRepository;


    @GetMapping("/login")
    public Mono<UserLoginDto> validarLogin(@RequestHeader HttpHeaders headers) {
        String userbyLog = headers.get("userLog").get(0);

        Usuario usuario = service.getUser(userbyLog).block();

        if (Objects.isNull(usuario))
            return Mono.error(new Throwable("Usuario Invalido"));

        Estados estado = estadoRepository.findById(usuario.getEstadoUsuario()).get();
        return Mono.just(loginMapper(usuario, estado));
    }

    @GetMapping("/consulta")
    public Mono<Usuario> gerDataEstudiante(@RequestHeader HttpHeaders headers) {
        String idEstudiante = headers.get("user").get(0);
        return service.getUser(idEstudiante)
                .doOnError( e ->
                        Mono.error(new Throwable("Erro")));
    }

    @PostMapping(value = "/saveUser", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Usuario> saveEstudy(@RequestBody Usuario usuario){
        service.saveUser(usuario);
        return Mono.just(usuario);
    }

    private UserLoginDto loginMapper(Usuario user, Estados estado) {
        UserLoginDto transfer = new UserLoginDto();
        user.setPassword(Base64.getEncoder().encodeToString(user.getPassword().getBytes()));
        transfer.setUsuario(user);
        transfer.setCedula(user.getCedula());
        transfer.setEstado(estado);
        transfer.setTimestamp(new Date());
        return transfer;
    }

}
