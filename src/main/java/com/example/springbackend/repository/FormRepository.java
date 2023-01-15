package com.example.springbackend.repository;

import com.example.springbackend.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FormRepository extends JpaRepository<Form, Integer> {
}
