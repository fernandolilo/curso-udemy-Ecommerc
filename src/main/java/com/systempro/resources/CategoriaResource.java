package com.systempro.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.systempro.domain.Categoria;
import com.systempro.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;

	@RequestMapping(value ="/{id}",method = RequestMethod.GET)
	//pathvariable é um tratamento para informa que a busca esta sendo feira por meio do ID.
	public ResponseEntity<Categoria> find (@PathVariable Integer id){
		
		// fazendo a chamada do serviço com o metodo criado de busca
		Categoria obj = service.find(id);
		
		// retorna um response entity com o metodo ok, caso tudo ocorra bem!
		return ResponseEntity.ok().body(obj);
	
	}
}
