package com.example.springbackend.repository;

import com.example.springbackend.assets.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<Form, Integer> {
}
