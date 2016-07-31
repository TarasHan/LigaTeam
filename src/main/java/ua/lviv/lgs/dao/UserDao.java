package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Users;

import java.util.List;

/**
 * Created by Kerol on 22.05.2016.
 */
public interface UserDao {
    public void addUser(Users users);

    public void editUser(Users users);

    public Users findById(int id);

    public void deleteUser(Users users);

    public List<Users> findAllUser();

    public Users findByNick(String nickName);

}
