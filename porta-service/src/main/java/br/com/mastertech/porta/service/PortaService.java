package br.com.mastertech.porta.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.mastertech.porta.entity.PortaEntity;
import br.com.mastertech.porta.exception.PortaNaoExisteException;
import br.com.mastertech.porta.repository.PortaRepository;

@Service
public class PortaService {

	private PortaRepository repository;

	public PortaService(PortaRepository repository) {
		this.repository = repository;
	}
	
	public PortaEntity criar(PortaEntity entity) {
		return this.repository.save(entity);
	}
	
	public PortaEntity obter(Long id) {
		Optional<PortaEntity> optional = this.repository.findById(id);
		
		if(!optional.isPresent()) {
			throw new PortaNaoExisteException();
		}
		
		return optional.get();
	}
}
