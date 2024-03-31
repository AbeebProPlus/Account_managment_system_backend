package com.app.accountmanagementsystem.data.repositories;

import com.app.accountmanagementsystem.data.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
