package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.UserRole;

@Repository
public interface UserRoleReository extends JpaRepository<UserRole, Long>{

}
