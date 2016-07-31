package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.BetDao;
import ua.lviv.lgs.entity.Bet;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
@Repository
public class BetDaoImplem implements BetDao{
    @PersistenceContext(unitName = "Main")
private EntityManager entityManager;
    @Transactional
    public  Bet findById(int id){
        return entityManager.find(Bet.class,id);
    }
    @Transactional
    public void addBet(Bet bet){
        entityManager.persist(bet);
    }
    @Transactional
    public void deleteBet(Bet bet){
        entityManager.remove(bet);
    }
    @Transactional
    public List<Bet>findAllBet(){
        return entityManager.createQuery("from Bet ").getResultList();
    }
  //  @Transactional
  //  public List<Bet>findAllBetByUserId(int id){
  //      return entityManager.createNamedQuery("Bet.findAllBetByUserId",Bet.class).setParameter("id",id).getResultList();
  //  }
}
