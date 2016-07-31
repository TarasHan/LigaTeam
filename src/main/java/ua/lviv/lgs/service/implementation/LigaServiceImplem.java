package ua.lviv.lgs.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.LigaDao;
import ua.lviv.lgs.entity.Liga;
import ua.lviv.lgs.service.LigaService;

import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
@Service
public class LigaServiceImplem  implements LigaService{
@Autowired
private LigaDao ligaDao;
    @Transactional
    public void addLiga(String ligaName){
Liga liga = new Liga(ligaName);
        ligaDao.addLiga(liga);
    }
@Transactional
    public void editLiga(int id,String ligaName){
Liga liga = ligaDao.findLigaById(id);
    if(ligaName!=null){
        liga.setLiga(ligaName);
    }
}
@Transactional
    public void deleteLiga(int   id){
Liga liga= ligaDao.findLigaById(id);
    ligaDao.deleteLiga(liga);
}
@Transactional
    public Liga findLigaById(int id){
return ligaDao.findLigaById(id);
}
@Transactional
    public List<Liga> findAllLiges(){
return ligaDao.findAllLiges();
}
}
