package com.example.service;

import java.util.List;

import com.example.entity.Curso;

public interface CursoService {

	public abstract Curso agregarCurso(Curso obj);
	
	public abstract List<Curso> listaCurso();
}
