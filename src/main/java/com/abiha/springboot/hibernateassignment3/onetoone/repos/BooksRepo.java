package com.abiha.springboot.hibernateassignment3.onetoone.repos;

import com.abiha.springboot.hibernateassignment3.onetoone.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BooksRepo extends JpaRepository<Book, Integer> {

}