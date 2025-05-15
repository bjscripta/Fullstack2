package venta.venta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import venta.venta.model.Inventario;
import venta.venta.service.InventarioService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    public List<Inventario> getAll() {
        return inventarioService.mostrarInventarios();
    }

    @GetMapping("/{id}")
    public Optional<Inventario> getById(@PathVariable Long id) {
        return inventarioService.buscarInventarioPorId(id);
    }

    @PostMapping
    public Inventario create(@RequestBody Inventario inventario) {
        return inventarioService.agregarInventario(inventario);
    }

    @PutMapping
    public Inventario update(@RequestBody Inventario inventario) {
        return inventarioService.actualizarInventario(inventario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        inventarioService.eliminarInventario(id);
    }
}