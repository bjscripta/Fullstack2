package venta.venta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import venta.venta.model.Producto;
import venta.venta.model.Usuario;
import venta.venta.repository.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
     public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();}

    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    //Continuar aqui
}
