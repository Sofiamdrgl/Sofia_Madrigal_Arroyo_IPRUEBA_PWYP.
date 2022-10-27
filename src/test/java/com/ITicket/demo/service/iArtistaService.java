
package com.ITicket.demo.service;


import com.ITicket.demo.entity.Artista;
import java.util.List;


public interface iArtistaService {
       public List<Artista> getALLArtista();
    public Artista getDetalleBylId(long id);
    public void saveArtista(Artista artista);
    public void delete(long id); 
}
