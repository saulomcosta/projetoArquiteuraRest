package saulo.io.projetoArquiteturaRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import saulo.io.projetoArquiteturaRest.entity.Perfil;
import saulo.io.projetoArquiteturaRest.enun.StatusPerfil;
import saulo.io.projetoArquiteturaRest.repository.PerfilRepository;
import saulo.io.projetoArquiteturaRest.service.PerfilServices;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private PerfilServices perfilServices;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		this.perfilServices.savePerfil();

	}

}
