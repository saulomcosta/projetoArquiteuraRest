package saulo.io.projetoArquiteturaRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import saulo.io.projetoArquiteturaRest.entity.Perfil;
import saulo.io.projetoArquiteturaRest.service.PerfilServices;

@RestController
@RequestMapping("/user")
public class PerfilController {

	@Autowired
	private PerfilServices perfilServices;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Perfil> getAll() {
		return this.perfilServices.getAll();
	}
}
