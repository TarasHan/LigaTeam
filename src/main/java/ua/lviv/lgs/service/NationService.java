package ua.lviv.lgs.service;

import org.springframework.stereotype.Service;
import ua.lviv.lgs.entity.Nation;

import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */

public interface NationService {

    public void addNation(String nameNation );

    public void editNation(int id,String nameNation);

    public void deleteNation( int id);

    public Nation findNationById(int id);

    public List<Nation> findAllNation();

    public  List<Nation> findNationByName(String nameNation);

}
