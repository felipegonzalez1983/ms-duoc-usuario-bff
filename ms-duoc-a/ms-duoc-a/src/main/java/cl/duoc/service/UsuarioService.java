package cl.duoc.service;
import cl.duoc.client.UsuarioClient;
import cl.duoc.dto.UsuarioDTO;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UsuarioService {
    private final UsuarioClient usuarioClient;
    public UsuarioService(UsuarioClient usuarioClient) {
        this.usuarioClient = usuarioClient;
    }
    public List<UsuarioDTO> obtenerUsuarios() {
        return usuarioClient.obtenerUsuarios();
    }
    public UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO) {
        return usuarioClient.crearUsuario(usuarioDTO);
    }
}
