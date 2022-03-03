/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.distribuidos.core.controllers;

import co.edu.unicauca.distribuidos.core.models.Hamburguesa;
import co.edu.unicauca.distribuidos.core.services.IHamburguesaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author davinchi
 */
@RestController
@RequestMapping("/api")
public class HamburguesaRestController {
    @Autowired
    private IHamburguesaService hamburguesaService;
    
    @GetMapping(value="/hamburguesas")
    public List<Hamburguesa> index() {
        return hamburguesaService.findAll();
    }
    
    @GetMapping(value="/hamburguesas/{id}")
    public Hamburguesa show(@PathVariable Integer id) {
        return hamburguesaService.findById(id);
    }
    
    @PostMapping(value="/hamburguesas")
    public Hamburguesa create(@RequestBody Hamburguesa hamburguesa) {
        return hamburguesaService.save(hamburguesa);
    }
    
    @PutMapping(value="/hamburguesas/{id}")
    public Hamburguesa update(
            @RequestBody Hamburguesa hamburguesa, 
            @PathVariable Integer id) {
        Hamburguesa buscada = hamburguesaService.findById(id);
        if(buscada != null) {
            return hamburguesaService.update(id, hamburguesa);
        }
        return null;
    }
    
    @DeleteMapping(value="/hamburguesas/{id}")
    public Boolean delete(@PathVariable Integer id) {
        Hamburguesa buscada = hamburguesaService.findById(id);
        Boolean eliminada = false;
        if(buscada != null) {
            eliminada = this.hamburguesaService.delete(id);
        }
        return eliminada;
    }
}
