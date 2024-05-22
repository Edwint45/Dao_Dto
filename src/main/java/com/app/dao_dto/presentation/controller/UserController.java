package com.app.dao_dto.presentation.controller;

import com.app.dao_dto.presentation.dto.UserDTO;
import com.app.dao_dto.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    //Crear un usuario
    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
        return null;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id){
        return null;
    }

    @GetMapping("/find")
    public ResponseEntity<List<UserDTO>> findAll(){
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<UserDTO> updateUser (@PathVariable Long id, @RequestBody UserDTO userDTO){
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        return null;
    }
}
