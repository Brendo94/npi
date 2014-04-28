package br.ufc.quixada.npi.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Disciplina;
import br.ufc.quixada.npi.repository.DisciplinaRepository;

@Named
public class DisciplinaServiceImpl implements DisciplinaService {

	@Inject
	private DisciplinaRepository disciplinaRepository;

	public DisciplinaServiceImpl() {
	}


	@Transactional
	public List<Disciplina> findAll() {
		List<Disciplina> d = disciplinaRepository.findAll();
		return d;
	}

}
