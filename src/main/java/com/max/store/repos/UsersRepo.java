package com.max.store.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.store.models.Users;

public interface UsersRepo extends JpaRepository<Users, Long> {

}
