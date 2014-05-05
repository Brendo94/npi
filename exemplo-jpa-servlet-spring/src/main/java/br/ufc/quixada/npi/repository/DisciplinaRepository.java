package br.ufc.quixada.npi.repository;

import java.util.List;

import br.ufc.quixada.npi.model.Disciplina;

public interface DisciplinaRepository {

	public abstract List<Disciplina> findAll();
	
	public abstract List<Disciplina> findByCod(String cod);
	
}