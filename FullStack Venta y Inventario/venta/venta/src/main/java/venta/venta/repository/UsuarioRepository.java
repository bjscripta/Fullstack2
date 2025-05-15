package venta.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import venta.venta.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
