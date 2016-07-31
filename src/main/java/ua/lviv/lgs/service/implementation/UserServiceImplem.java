package ua.lviv.lgs.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.UserDao;
import ua.lviv.lgs.entity.Users;
import ua.lviv.lgs.service.UserService;

import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
@Service
public class UserServiceImplem  implements UserService{

    @Autowired
    private UserDao userDao;

    @Transactional

    public void addUser (Users users){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        userDao.addUser(users);
    }

    @Transactional
    public void editUser( int id,String name,String lastName,String nickName,String password,String email ){
        Users users = userDao.findById(id);
        if (name!=null){
            users.setName(name);
        }
        if (lastName!=null){
            users.setLastName(lastName);
        }
        if(nickName!=null){
            users.setNickName(nickName);
        }
        if(password!=null){
            users.setPassword(password);
        }
        if (email!=null){
            users.setEmail(email);
        }
    }

    @Transactional
    public Users findById (int id){
        return userDao.findById(id);
    }

    @Transactional
    public void deleteUser( int id){
        Users users = userDao.findById(id);
        userDao.deleteUser(users);
    }

    @Transactional
    public List<Users> findAllUser(){
        return userDao.findAllUser();
    }

    public Users findByNick(String nickName){
        return userDao.findByNick(nickName);
    }
}
