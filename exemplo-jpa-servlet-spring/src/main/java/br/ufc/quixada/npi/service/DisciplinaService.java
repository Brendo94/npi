package br.ufc.quixada.npi.service;

import java.util.List;

import br.ufc.quixada.npi.model.Disciplina;

public interface DisciplinaService {

	public abstract List<Disciplina> findAll();
	
	public abstract List<Disciplina> findByCod(String cod);

}