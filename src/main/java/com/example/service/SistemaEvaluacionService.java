package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.SistemaEvaluacion;

public interface SistemaEvaluacionService {


	@Autowired(required = true)
	public abstract List<SistemaEvaluacion> listaSistemaEvaluacion();
}
