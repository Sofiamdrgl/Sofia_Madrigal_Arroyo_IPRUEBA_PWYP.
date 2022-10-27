
package com.ITicket.demo.service;

import com.ITicket.demo.entity.Evento;
import java.util.List;


public interface iEventoService {
     public List<Evento> getALLEvento();
    public Evento getEventoBylId(long id);
    public void saveEvento(Evento evento);
    public void delete(long id);
}
