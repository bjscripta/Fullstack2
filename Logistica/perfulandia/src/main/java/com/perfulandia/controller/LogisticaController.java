package com.perfulandia.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.perfulandia.model.Envio;
import com.perfulandia.model.Proveedor;
import com.perfulandia.model.RutaEntrega;
import com.perfulandia.services.LogisticaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/logistica")
public class LogisticaController {
    
    @Autowired private LogisticaService logisticaService;

    //Envios
    @GetMapping("/envios")
    public List<Envio> listarEnvios() {return logisticaService.obtenerTodosLosEnvios();}

    @PostMapping("/envios")
    public Envio crearEnvio(@RequestBody Envio envio) {return logisticaService.guardarEnvio(envio);}

    @DeleteMapping("/envios/{id}")
    public void eliminarEnvio(@PathVariable int id) {logisticaService.eliminarEnvio(id);}

    //Proveedores
    @GetMapping("/proveedores")
    public List<Proveedor> listarProveedores() {return logisticaService.obtenerProveedores();}

    @PostMapping("/proveedores")
    public Proveedor creaProveedor(@RequestBody Proveedor proveedor) {
        return logisticaService.guardarProveedor(proveedor);
    }

    //Rutas
    @GetMapping("/rutas")
    public List<RutaEntrega> listarRutas() {return logisticaService.obtenerRutas();}

    @PostMapping("/rutas")
    public RutaEntrega crearRuta(@RequestBody RutaEntrega ruta) {
        return logisticaService.guardarRuta(ruta);
    }
}
