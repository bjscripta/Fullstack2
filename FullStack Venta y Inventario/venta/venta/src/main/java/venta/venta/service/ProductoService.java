package venta.venta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import venta.venta.model.Producto;
import venta.venta.repository.ProductoRepository;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }

    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto obtenerPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    public Producto actualizar(Long id, Producto productoActualizado) {
        Producto existente = productoRepository.findById(id).orElse(null);
        if (existente != null) {
            existente.setNombre(productoActualizado.getNombre());
            existente.setPrecio(productoActualizado.getPrecio());
            return productoRepository.save(existente);
        } else {
            return null;
        }
    }

    public boolean eliminar(Long id) {
        Producto producto = productoRepository.findById(id).orElse(null);
        if (producto != null) {
            productoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}