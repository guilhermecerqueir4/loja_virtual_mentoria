package cerqueir4.lojavirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "cerqueir4.lojavirtual.model")
@ComponentScan(basePackages = {"cerqueir4.*"})
@EnableJpaRepositories(basePackages = {"cerqueir4.lojavirtual.repository"})
@EnableTransactionManagement
public class LojaVirtualMentoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualMentoriaApplication.class, args);
	}

}
