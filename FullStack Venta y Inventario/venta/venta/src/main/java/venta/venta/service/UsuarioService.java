package venta.venta.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import venta.venta.model.Usuario;
import venta.venta.repository.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario obtenerPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario actualizar(Long id, Usuario actualizado) {
        Usuario usuario = obtenerPorId(id);
        if (usuario != null) {
            usuario.setNombre(actualizado.getNombre());
            usuario.setCorreo(actualizado.getCorreo());
            usuario.setContrasena(actualizado.getContrasena());
            return usuarioRepository.save(usuario);
        }
        return null;
    }

    public boolean eliminar(Long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
