package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.MatchesDao;
import ua.lviv.lgs.entity.Matches;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Kerol on 27.05.2016.
 */
@Repository
public class MatchesDaoImplem implements MatchesDao{
    @PersistenceContext(name = "Main")
    private EntityManager entityManager;
    @Transactional
    public void addMatches(Matches matches){
      entityManager.persist(matches);
    }
    @Transactional
    public void deleteMatches(Matches matches){
        entityManager.remove(matches);
    }
    @Transactional
    public Matches findMatchesById(int id){
        return entityManager.find(Matches.class,id);
    }
}
