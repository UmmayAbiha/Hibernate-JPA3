package com.abiha.springboot.hibernateassignment3.onetomany.repos;

import com.abiha.springboot.hibernateassignment3.onetomany.entities.Author1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author1, Integer> {
}