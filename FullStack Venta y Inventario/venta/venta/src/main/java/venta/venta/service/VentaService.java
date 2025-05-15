package venta.venta.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import venta.venta.model.Venta;
import venta.venta.repository.VentaRepository;

import java.util.List;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> listar() {
        return ventaRepository.findAll();
    }

    public Venta guardar(Venta venta) {
        return ventaRepository.save(venta);
    }

    public Venta obtenerPorId(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }

    public Venta actualizar(Long id, Venta actualizada) {
        Venta venta = obtenerPorId(id);
        if (venta != null) {
            venta.setDescripcion(actualizada.getDescripcion());
            venta.setFechaVenta(actualizada.getFechaVenta());
            venta.setIdVenta(id);
            return ventaRepository.saveAndFlush(venta);
        }
        return null;
    }

    public boolean eliminar(Long id) {
        if (ventaRepository.existsById(id)) {
            ventaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}