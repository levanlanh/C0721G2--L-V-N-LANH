package service.impl;

import model.User;
import repository.IUserRepository;
import repository.impl.UserRepository;
import service.IUserService;

import java.util.List;

public class UserSevice implements IUserService {
    IUserRepository iUserRepository = new UserRepository();
    @Override
    public List<User> selectAllUser() {
        return this.iUserRepository.selectAllUser();
    }

    @Override
    public User selectUser(int id) {
        return iUserRepository.selectUser(id);
    }

    @Override
    public void insertUser(User user) {
     iUserRepository.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
    iUserRepository.updateUser(user);

    }

    @Override
    public void deleteUser(int id) {
     iUserRepository.deleteUser(id);
    }

    @Override
    public List<User> orderByName() {
        return null;
    }

    @Override
    public List<User> selectByCountry(String countryName) {
        return null;
    }
}
