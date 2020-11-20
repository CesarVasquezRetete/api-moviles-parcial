package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Curso;
import com.example.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository repository;
	
	@Override
	public Curso agregarCurso(Curso obj) {
		return repository.save(obj);
	}

	@Override
	public List<Curso> listaCurso() {
		return repository.findAll();
	}

}
