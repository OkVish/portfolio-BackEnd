
package com.portfolio.vish.service;

import com.portfolio.vish.dto.UserDto;
import com.portfolio.vish.model.User;
import com.portfolio.vish.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Vish
 */

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public UserDto login(String nombreuser, String passworduser) {
    User user=userRepository.findByNombreuserAndPassworduser(nombreuser,passworduser);
        UserDto userDto= new UserDto(user.getNombreuser(),user.getEmailuser());
    return  userDto;
    }
}
