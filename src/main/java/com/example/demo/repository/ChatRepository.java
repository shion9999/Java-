package com.example.demo.repository;

import com.example.demo.entity.Category;
import com.example.demo.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Integer> {
}
