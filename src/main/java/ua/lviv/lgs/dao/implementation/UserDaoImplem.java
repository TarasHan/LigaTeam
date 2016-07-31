package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.UserDao;
import ua.lviv.lgs.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
@Repository
public class UserDaoImplem implements UserDao {
    @PersistenceContext(name = "Main")
    private EntityManager entityManager;

    @Transactional
    public void addUser(Users users){
        entityManager.persist(users);
    }
    @Transactional
    public void deleteUser(Users users){
        entityManager.remove(users);
    }
    @Transactional
    public void editUser(Users users){
        entityManager.merge(users);
    }
    @Transactional
    public Users findById(int id){
        return entityManager.find(Users.class,id);
    }
    @Transactional
    public List<Users> findAllUser(){
        return entityManager.createQuery("from Users ").getResultList();
    }
    @Transactional
    public Users findByNick(String nickName){
        return entityManager.find(Users.class,nickName);
    }


}
