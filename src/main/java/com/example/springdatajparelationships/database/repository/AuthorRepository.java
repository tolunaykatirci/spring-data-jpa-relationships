package com.example.springdatajparelationships.database.repository;

import com.example.springdatajparelationships.database.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
