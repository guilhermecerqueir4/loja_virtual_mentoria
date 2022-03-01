package cerqueir4.lojavirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cerqueir4.lojavirtual.model.Acesso;
import cerqueir4.lojavirtual.repository.AcessoRepository;

@Service
public class AcessoService {
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	public Acesso save(Acesso acesso) {
		/*Qualquer tipo de validacao antes de salvar*/
		
		return acessoRepository.save(acesso);
	}

}
