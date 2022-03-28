package com.abiha.springboot.hibernateassignment3.manytomany.repos;

import com.abiha.springboot.hibernateassignment3.manytomany.entities.Author2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Author2Repo extends JpaRepository<Author2, Integer> {
}