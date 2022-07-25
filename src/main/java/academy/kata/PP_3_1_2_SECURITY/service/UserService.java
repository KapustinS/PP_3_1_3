package academy.kata.PP_3_1_2_SECURITY.service;


import academy.kata.PP_3_1_2_SECURITY.dao.UserDao;
import academy.kata.PP_3_1_2_SECURITY.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    User showById(int id);

    void update(User user, int id);

    void delete(int id);

    Optional<User> showByUsername(String username);
}
