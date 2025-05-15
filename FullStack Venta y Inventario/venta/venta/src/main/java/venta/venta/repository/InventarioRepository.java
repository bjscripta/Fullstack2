package venta.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import venta.venta.model.Inventario;

import java.lang.Long;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario,Long> {
}