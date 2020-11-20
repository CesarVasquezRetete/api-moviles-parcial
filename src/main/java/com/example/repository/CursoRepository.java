package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>  {

}
