/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.distribuidos.core.services;

import co.edu.unicauca.distribuidos.core.models.Hamburguesa;
import java.util.List;

/**
 *
 * @author davinchi
 */
public interface IHamburguesaService {
    public List<Hamburguesa> findAll();
    public Hamburguesa findById(Integer id);
    public Hamburguesa save(Hamburguesa hamburguesa);
    public Hamburguesa update(Integer id, Hamburguesa hamburguesa);
    public Boolean delete(Integer id);
}
