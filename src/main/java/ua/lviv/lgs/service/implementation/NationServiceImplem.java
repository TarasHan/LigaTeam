package ua.lviv.lgs.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.NationDao;
import ua.lviv.lgs.entity.Nation;
import ua.lviv.lgs.service.NationService;

import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */@Service
public class NationServiceImplem implements NationService {
    @Autowired
    private NationDao nationDao;
    @Transactional
    public void addNation(String nameNation ){
        Nation nation = new Nation(nameNation);
        nationDao.addNation(nation);
    }
@Transactional
    public void editNation(int id,String nameNation){
    Nation nation = nationDao.findNationById(id);
    if(nameNation!=null){
        nation.setNameNation(nameNation);

    }

}
@Transactional
    public void deleteNation( int id){
    Nation nation= nationDao.findNationById(id);
    nationDao.deleteNation(nation);
}
@Transactional
    public Nation findNationById(int id){
    return nationDao.findNationById(id);
}
@Transactional
    public List<Nation> findAllNation(){
    return nationDao.findAllNation();
}
@Transactional
    public  List<Nation> findNationByName(String nameNation){
    return nationDao.findNationByName(nameNation);
}
}
