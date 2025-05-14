package Inventario.Inventario.service;

import Inventario.Inventario.model.Inventario;
import Inventario.Inventario.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public List<Inventario> mostrarInventarios() {
        return inventarioRepository.findAll();
    }

    public Optional<Inventario> buscarInventarioPorId(Long id) {
        return inventarioRepository.findById(id);
    }

    public Inventario agregarInventario(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    public void eliminarInventario(Long id) {
        inventarioRepository.deleteById(id);
    }

    public Inventario actualizarInventario(Inventario inventario) {
        return inventarioRepository.save(inventario); 
    }
}
