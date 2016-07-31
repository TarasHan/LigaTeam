package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.LigaDao;
import ua.lviv.lgs.entity.Liga;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
@Repository
public class LigaDaoImplem implements LigaDao{

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void addLiga(Liga liga){
        entityManager.persist(liga);
    }
    @Transactional
    public void editLiga(Liga liga){
        entityManager.merge(liga);
    }

    @Transactional
    public void deleteLiga(Liga liga){
        entityManager.remove(liga);
    }
    @Transactional
    public Liga findLigaById(int id){
        return entityManager.find(Liga.class,id);
    }
    @Transactional
    public List<Liga> findAllLiges(){
        return  entityManager.createQuery("from Liga ").getResultList();
    }
 //   @Transactional
  //  public void findLigaByName(Liga liga){
  //      entityManager.find(Liga.class,liga);
   // }
}
