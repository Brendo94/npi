package br.ufc.quixada.npi.repository.jpa;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufc.quixada.npi.model.Disciplina;
import br.ufc.quixada.npi.repository.DisciplinaRepository;

@Named
public class JpaDisciplinaRepositoryImpl implements DisciplinaRepository {

	@PersistenceContext
	private EntityManager em;


	public List<Disciplina> findAll() {
		return em.createQuery("from Disciplina", Disciplina.class).getResultList();
	}
	
	public List<Disciplina> findByCod(String cod) {
		return em.createQuery("from Disciplina where cod_d =:cod", Disciplina.class).setParameter("cod", cod).getResultList();
	}
	
	
}
