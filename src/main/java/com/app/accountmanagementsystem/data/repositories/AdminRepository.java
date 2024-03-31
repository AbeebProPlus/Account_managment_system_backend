package com.app.accountmanagementsystem.data.repositories;

import com.app.accountmanagementsystem.data.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
