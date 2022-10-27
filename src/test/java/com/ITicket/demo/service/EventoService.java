/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.demo.service;

import com.ITicket.demo.entity.Evento;
import com.ITicket.demo.repository.IEventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService implements iEventoService{

    @Autowired
    private IEventoRepository eventoRepo;
    
    @Override
    public List<Evento> getALLEvento() {
       return (List<Evento>) eventoRepo.findAll();
    }

    @Override
    public Evento getEventoBylId(long id) {
        return eventoRepo.findById(id).orElse(null);
    }

    @Override
    public void saveEvento(Evento evento) {
        eventoRepo.save(evento);
    }

    @Override
    public void delete(long id) {
        eventoRepo.deleteById(id);
    }
    
}
