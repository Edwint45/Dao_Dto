package com.app.dao_dto.service.implementation;

import com.app.dao_dto.presentation.dto.UserDTO;
import com.app.dao_dto.service.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public List<UserDTO> findAll() {
        return List.of();
    }

    @Override
    public UserDTO findById(Long id) {
        return null;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO, Long id) {
        return null;
    }

    @Override
    public String deleteUser(Long id) {
        return "";
    }
}
