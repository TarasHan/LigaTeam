package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.TeamDao;
import ua.lviv.lgs.entity.Team;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
@Repository
public class TeamDaoImplem implements TeamDao {
    @PersistenceContext(name = "Main")
    private EntityManager entityManager;

    @Transactional
    public void addTeam(Team team) {
entityManager.persist(team);
    }
    @Transactional
    public void editTeam(Team team) {
        entityManager.merge(team);
    }
    @Transactional
    public void deleteTeam(Team team) {
entityManager.remove(team);
    }

    @Transactional
    public List<Team> findAllTeam() {
return entityManager.createQuery("from Team ").getResultList();
    }

    @Transactional
    public List<Team> findAllTeamByNationId(int id) {
return entityManager.createNamedQuery("Team.findAllTeamByNationId",Team.class).setParameter("id",id).getResultList();
    }

    @Transactional
   public Team findByName(String name){
        return entityManager.find(Team.class,name);
    }

    @Transactional
    public Team findById(int id){
        return  entityManager.find(Team.class,id);
    }

}
