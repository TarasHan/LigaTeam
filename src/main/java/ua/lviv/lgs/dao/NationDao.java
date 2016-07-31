package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Nation;
import ua.lviv.lgs.entity.Users;

import java.util.List;

/**
 * Created by Kerol on 22.05.2016.
 */
public interface NationDao {
    public void addNation(Nation nameNation);

    public void editNation(Nation nameNation);

    public void deleteNation(Nation nation);

    public Nation findNationById(int id);

    public List<Nation> findAllNation();

    public  List<Nation> findNationByName(String nameNation);

}
