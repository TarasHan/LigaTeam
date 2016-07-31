package ua.lviv.lgs.service;

import ua.lviv.lgs.entity.Liga;

import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
public interface LigaService {
    public void addLiga(String ligaName);

    public void editLiga(int id ,String ligaName);

    public void deleteLiga(int   id);

    public Liga findLigaById(int id);

    public List<Liga> findAllLiges();
}
