package venta.venta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import venta.venta.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Buscar inventarios por nombre (exacto)
    List<Producto> findByNombre(String nombre);

    // Buscar inventarios por nombre que contenga una cadena (parcial, ignore case)
    List<Producto> findByNombreContainingIgnoreCase(String nombre);

    // Buscar inventarios por estado
    List<Producto> findByEstado(String estado);

    // Buscar inventarios con cantidad mayor a un valor
    List<Producto> findByCantidadGreaterThan(int cantidad);

    // Buscar inventarios con cantidad entre dos valores
    List<Producto> findByCantidadBetween(int min, int max);

    // Buscar inventarios por nombre y estado
    List<Producto> findByNombreAndEstado(String nombre, String estado);
}