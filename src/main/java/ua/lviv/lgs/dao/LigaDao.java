package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Liga;

import java.util.List;

/**
 * Created by Kerol on 22.05.2016.
 */
public interface LigaDao {
    public void addLiga(Liga liga);

    public void editLiga(Liga liga);

    public void deleteLiga(Liga liga);

    public Liga findLigaById(int id);

    public List<Liga> findAllLiges();

  //  public void  findLigaByName( Liga liga);


}
