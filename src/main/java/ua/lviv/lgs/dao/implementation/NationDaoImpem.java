package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.NationDao;
import ua.lviv.lgs.entity.Liga;
import ua.lviv.lgs.entity.Nation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
@Repository
public class NationDaoImpem implements NationDao{
    @PersistenceContext(name = "Main")
    private EntityManager entityManager;

    @Transactional
    public void addNation(Nation nation){
        entityManager.persist(nation);
    }

    public void editNation(Nation nation){
        entityManager.merge(nation);
    }

    public void deleteNation(Nation nation){
        entityManager.remove(nation);
    }

    public Nation findNationById(int id){
       return entityManager.find(Nation.class,id);
    }

    public List<Nation> findAllNation(){
        return entityManager.createQuery("from Nation ").getResultList();
    }

    public  List<Nation> findNationByName(String nation){
        return entityManager.createNamedQuery("Nation.findNationByName", Nation.class).setParameter("nation",nation).getResultList();
    }
}
