/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.distribuidos.core.repositories;

import co.edu.unicauca.distribuidos.core.models.Hamburguesa;
import co.edu.unicauca.distribuidos.core.models.TipoHamburguesa;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;

/**
 *
 * @author davinchi
 */
@Service
public class HamburguesaRepository {
    private List<Hamburguesa> hamburguesas;
    
    public HamburguesaRepository() {
        this.hamburguesas = new ArrayList<>();
        this.charge();
    }
    
    public List<Hamburguesa> findAll() {
        System.out.println("Invocando a listar hamburguesas.");
        return this.hamburguesas;
    }
    
    public Hamburguesa findById(Integer id) {
        System.out.println("Invocando a consultar hamburguesa.");
        for (Hamburguesa hamburguesa : this.hamburguesas) {
            if(id.equals(hamburguesa.getId())) {
                return hamburguesa;
            }
        }
        return null;
    }
    
    public Hamburguesa save(Hamburguesa hamburguesa) {
        System.out.println("Invocando a guardar hamburguesa.");
        if(this.hamburguesas.add(hamburguesa)) {
            return hamburguesa;
        }
        return null;
    }
    
    public Hamburguesa update(Integer id, Hamburguesa hamburguesa) {
        System.out.println("Invocando a actualizar hamburguesa.");
        for (int i = 0; i < this.hamburguesas.size(); i++) {
            if(this.hamburguesas.get(i).getId().equals(id)) {
                this.hamburguesas.set(i, hamburguesa);
                return hamburguesa;
            }
        }
        return null;
    }
    
    public Boolean delete(Integer id) {
        System.out.println("Invocando a eliminar hamburguesa.");
        Boolean eliminado = false;
        for(int i = 0; i < this.hamburguesas.size(); i++) {
            if(this.hamburguesas.get(i).getId().equals(id)) {
                this.hamburguesas.remove(i);
                eliminado = true;
            }
        }
        return eliminado;
    }
    
    private void charge() {
        Hamburguesa clasica = new Hamburguesa(TipoHamburguesa.pequena,
                8000.0, 4, 1, "Clasica");
        Hamburguesa deLaCasa = new Hamburguesa(TipoHamburguesa.mediana,
                10000.0, 8 , 1, "De la casa");
        Hamburguesa doble = new Hamburguesa(TipoHamburguesa.mediana,
                15000.0, 10, 1, "Doble carne");
        this.hamburguesas.add(clasica);
        this.hamburguesas.add(deLaCasa);
        this.hamburguesas.add(doble);
    }
}
