package com.ITicket.demo.service;

import com.ITicket.demo.entity.Artista;
import com.ITicket.demo.entity.Detalle;
import com.ITicket.demo.repository.IArtistaRepository;
import com.ITicket.demo.repository.IDetalleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ArtistaService implements iArtistaService {

    @Autowired
    private IArtistaRepository artistaRepo;

    @Override
    public List<Artista> getALLArtista() {
        return (List<Artista>) artistaRepo.findAll();
    }

    @Override
    public Artista getDetalleBylId(long id) {
        return artistaRepo.findById(id).orElse(null);
    }

    @Override
    public void saveArtista(Artista artista) {
        artistaRepo.save(artista);
    }

    @Override
    public void delete(long id) {
        artistaRepo.deleteById(id);
    }

}
