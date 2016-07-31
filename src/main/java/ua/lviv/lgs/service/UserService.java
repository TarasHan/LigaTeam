package ua.lviv.lgs.service;

import ua.lviv.lgs.entity.Users;

import java.util.List;

/**
 * Created by Kerol on 27.05.2016.
 */
public interface UserService {

    public void addUser (Users users);

    public void editUser( int id,String name,String lastName,String nickName,String password,String email );

    public Users findById (int id);

    public void deleteUser( int id);

    public List<Users> findAllUser();

    public Users findByNick(String nickName);
}
