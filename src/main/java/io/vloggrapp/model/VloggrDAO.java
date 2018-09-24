package io.vloggrapp.model;

import io.vloggrapp.dao.Vloggr;



public interface VloggrDAO {

    public Vloggr getVloggr(String id);
    public Vloggr createVloggr(Vloggr v);
    public void deleteVloggr(Vloggr v);
    public Vloggr updateVloggr(Vloggr v);

}
