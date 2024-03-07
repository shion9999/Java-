package com.example.demo.repository;

import com.example.demo.entity.Category;
import com.example.demo.entity.EventUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventUserRepository extends JpaRepository<EventUser, Integer> {
}
