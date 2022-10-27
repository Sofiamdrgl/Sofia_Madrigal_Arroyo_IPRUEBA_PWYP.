
package com.ITicket.demo.service;


import com.ITicket.demo.entity.Detalle;
import java.util.List;


public interface iDetalleService {
    public List<Detalle> getALLDetalle();
    public Detalle getDetalleBylId(long id);
    public void saveDetalle(Detalle detalle);
    public void delete(long id);
}
