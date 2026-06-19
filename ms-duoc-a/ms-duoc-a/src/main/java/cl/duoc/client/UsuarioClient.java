package cl.duoc.client;

import cl.duoc.dto.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@FeignClient(name = "ms-duoc-b", url = "${ms-duoc-b.url}")
public interface UsuarioClient {
    @GetMapping("/usuarios")
    List<UsuarioDTO> obtenerUsuarios();
    @PostMapping("/usuarios")
    UsuarioDTO crearUsuario(@RequestBody UsuarioDTO usuarioDTO);
}
