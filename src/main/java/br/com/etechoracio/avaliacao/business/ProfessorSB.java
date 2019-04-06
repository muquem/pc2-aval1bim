package br.com.etechoracio.avaliacao.business;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.avaliacao.dao.ProfessorDAO;
import br.com.etechoracio.avaliacao.model.Professor;
import br.com.etechoracio.common.business.BaseSB;

@Service
public class ProfessorSB extends BaseSB{

	
	private ProfessorDAO ProfessorDAO;
	
	@Override
	protected void postConstructImpl() {
		ProfessorDAO = getDAO(ProfessorDAO.class);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Professor> findALL(){
		return ProfessorDAO.findAll();
	}


	
}
