package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente(1L,"raul", "raul@teste.com", "(84) 99999-9999");
		Cliente cliente2 = new Cliente(2L,"kelavi", "kelavi@teste.com", "(84) 92424-2424");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
