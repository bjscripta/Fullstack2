package Inventario.Inventario.repository;

import Inventario.Inventario.model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.lang.Long;
import java.util.List;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario,Long> {
}
