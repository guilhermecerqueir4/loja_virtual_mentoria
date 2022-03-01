package cerqueir4.lojavirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cerqueir4.lojavirtual.controller.AcessoController;
import cerqueir4.lojavirtual.model.Acesso;
import cerqueir4.lojavirtual.repository.AcessoRepository;
import cerqueir4.lojavirtual.service.AcessoService;

@SpringBootTest(classes = LojaVirtualMentoriaApplication.class)
class LojaVirtualMentoriaApplicationTests {
	
	@Autowired
	private AcessoController acessoController;

	@Test
	public void testaCadastraAcesso() {
		
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ROLE_ADMIN");
		
		acessoController.salvarAcesso(acesso);
		
	}

}
