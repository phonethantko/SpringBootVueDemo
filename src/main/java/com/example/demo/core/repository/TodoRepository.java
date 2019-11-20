package com.example.demo.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.core.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
