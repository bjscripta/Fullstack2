package venta.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import venta.venta.model.Venta;

public interface VentaRepository extends JpaRepository<Venta,Long> {

}
