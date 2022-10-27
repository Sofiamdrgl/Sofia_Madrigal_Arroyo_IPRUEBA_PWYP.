
package com.ITicket.demo.service;

import com.ITicket.demo.entity.Detalle;
import com.ITicket.demo.entity.Evento;
import com.ITicket.demo.repository.IDetalleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


public class DetalleService  implements iDetalleService{
    @Autowired
    private IDetalleRepository detalleRepo;
    @Override
    public List<Detalle> getALLDetalle() {
         return (List<Detalle>) detalleRepo.findAll();
    }

    @Override
    public Detalle getDetalleBylId(long id) {
        return detalleRepo.findById(id).orElse(null);
    }

    @Override
    public void saveDetalle(Detalle detalle) {
        detalleRepo.save(detalle);
    }

    @Override
    public void delete(long id) {
        detalleRepo.deleteById(id);
    }
    
}
