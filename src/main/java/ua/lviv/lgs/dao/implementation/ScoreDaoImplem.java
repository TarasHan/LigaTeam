package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.ScoreDao;
import ua.lviv.lgs.entity.Score;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Kerol on 27.05.2016.
 */
@Repository
public class ScoreDaoImplem implements ScoreDao {
    @PersistenceContext(name = "Main")
    private EntityManager entityManager;

    @Transactional
    public void addScore(Score score) {
        entityManager.persist(score);
    }

    @Transactional
    public void editScore(Score score) {
        entityManager.merge(score);
    }

    @Transactional
    public void deleteScore(Score score) {
        entityManager.remove(score);
    }

    @Transactional
    public  Score findScoreById (int id){
        return entityManager.find(Score.class,id);
    }
}
