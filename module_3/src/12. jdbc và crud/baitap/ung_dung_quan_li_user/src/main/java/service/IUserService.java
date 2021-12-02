package service;

import model.User;

import java.util.List;

public interface IUserService {
    public List<User> selectAllUser();
    public User selectUser(int id);
    public void insertUser(User user);
    public void updateUser(User user) ;
    public void deleteUser( int id) ;
    public List<User> orderByName();
    public List<User> selectByCountry(String countryName);
}
