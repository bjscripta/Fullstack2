package venta.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import venta.venta.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}