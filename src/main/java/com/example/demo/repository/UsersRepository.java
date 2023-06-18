package com.example.demo.repository;

import com.example.demo.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UsersRepository extends CrudRepository<UserModel, UUID> {
}
