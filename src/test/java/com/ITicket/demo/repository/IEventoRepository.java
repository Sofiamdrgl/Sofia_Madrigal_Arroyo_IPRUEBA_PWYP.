/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ITicket.demo.repository;

import com.ITicket.demo.entity.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author 50670
 */
public interface IEventoRepository extends CrudRepository<Evento,Long>{
    
}
