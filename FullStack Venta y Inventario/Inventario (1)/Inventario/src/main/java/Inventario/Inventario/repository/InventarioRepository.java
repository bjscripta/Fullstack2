package Inventario.Inventario.repository;

import Inventario.Inventario.model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.lang.Long;
import java.util.List;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario,Long> {

    // Buscar inventarios por nombre (exacto)
    List<Inventario> findByNombre(String nombre);

    // Buscar inventarios por nombre que contenga una cadena (parcial, ignore case)
    List<Inventario> findByNombreContainingIgnoreCase(String nombre);

    // Buscar inventarios por estado
    List<Inventario> findByEstado(String estado);

    // Buscar inventarios con cantidad mayor a un valor
    List<Inventario> findByCantidadGreaterThan(int cantidad);

    // Buscar inventarios con cantidad entre dos valores
    List<Inventario> findByCantidadBetween(int min, int max);

    // Buscar inventarios por nombre y estado
    List<Inventario> findByNombreAndEstado(String nombre, String estado);
}
