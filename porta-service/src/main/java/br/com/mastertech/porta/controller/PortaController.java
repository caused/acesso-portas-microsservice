package br.com.mastertech.porta.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mastertech.porta.dto.request.CreatePortaRequestDTO;
import br.com.mastertech.porta.dto.response.CreatePortaResponseDTO;
import br.com.mastertech.porta.entity.PortaEntity;
import br.com.mastertech.porta.mapper.PortaMapper;
import br.com.mastertech.porta.service.PortaService;

@RestController
@RequestMapping("/porta")
public class PortaController {

	private PortaMapper mapper;
	private PortaService service;

	public PortaController (PortaMapper mapper,PortaService service) {
		this.mapper = mapper;
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<CreatePortaResponseDTO> criarPorta (@Valid @RequestBody CreatePortaRequestDTO porta){
		PortaEntity entity = mapper.convertFromDtoToEntity(porta);
		
		entity = service.criar(entity);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(mapper.convertFromEntityToDto(entity));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CreatePortaResponseDTO> obterPorta(@PathVariable Long id){
		PortaEntity portaEntity = service.obter(id);
		
		return ResponseEntity.ok(mapper.convertFromEntityToDto(portaEntity));
	}
}
