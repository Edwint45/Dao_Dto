package com.app.dao_dto.persistence.dao.interfaces;

import com.app.dao_dto.persistence.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserDAO {

    List<UserEntity> findAll();

    Optional<UserEntity> findById(Long id);

    void  saveUser(UserEntity userEntity);

    void updateUser(UserEntity userEntity);

    void deleteUser(UserEntity userEntity);
}
