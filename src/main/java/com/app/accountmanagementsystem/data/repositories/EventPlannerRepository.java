package com.app.accountmanagementsystem.data.repositories;

import com.app.accountmanagementsystem.data.models.EventPlanner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventPlannerRepository extends JpaRepository<EventPlanner, Long> {
}