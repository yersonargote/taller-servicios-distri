    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.distribuidos.core.services;

import co.edu.unicauca.distribuidos.core.models.Hamburguesa;
import co.edu.unicauca.distribuidos.core.repositories.HamburguesaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author davinchi
 */
@Service
public class HamburguesaServiceImpl implements IHamburguesaService {
    
    @Autowired
    private HamburguesaRepository hamburguesaRepository;

    @Override
    public List<Hamburguesa> findAll() {
        return this.hamburguesaRepository.findAll();
    }

    @Override
    public Hamburguesa findById(Integer id) {
        return this.hamburguesaRepository.findById(id);
    }

    @Override
    public Hamburguesa save(Hamburguesa hamburguesa) {
        return this.hamburguesaRepository.save(hamburguesa);
    }

    @Override
    public Hamburguesa update(Integer id, Hamburguesa hamburguesa) {
        return this.hamburguesaRepository.update(id, hamburguesa);
    }

    @Override
    public Boolean delete(Integer id) {
        return this.hamburguesaRepository.delete(id);
    }

    
}
