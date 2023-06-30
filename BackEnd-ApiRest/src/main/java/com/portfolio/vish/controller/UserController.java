
package com.portfolio.vish.controller;

import com.portfolio.vish.dto.UserDto;
import com.portfolio.vish.model.User;
import com.portfolio.vish.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author Vish
 */

@RestController
@RequestMapping("api/user")
@CrossOrigin(origins = {"", "http://localhost:4200"})
public class UserController {

    @Autowired
    private UserService userService;

    //Lista Usuarios
    @GetMapping("/list")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    //Traer Usuario
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        Optional<User> user = userService.getUserById(id);
        return user.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Crear usuario
    @PostMapping("/create")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    //Borrar Usuario
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
    // Usuario Credenciales Log
 @PostMapping("/login")
 @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserDto login (@RequestBody User user){
        return userService.login(user.getNombreuser(), user.getPassworduser());
    }

}