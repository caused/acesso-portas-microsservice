package br.com.mastertech.porta.mapper;

import org.springframework.stereotype.Component;

import br.com.mastertech.porta.dto.request.CreatePortaRequestDTO;
import br.com.mastertech.porta.dto.response.CreatePortaResponseDTO;
import br.com.mastertech.porta.entity.PortaEntity;

@Component
public class PortaMapper {

	public PortaEntity convertFromDtoToEntity(CreatePortaRequestDTO dto) {
		PortaEntity entity = new PortaEntity();
		
		entity.setAndar(dto.getAndar());
		entity.setSala(dto.getSala());
		
		return entity;
	}
	
	public CreatePortaResponseDTO convertFromEntityToDto (PortaEntity entity) {
		CreatePortaResponseDTO dto = new CreatePortaResponseDTO();
		
		dto.setId(entity.getId());
		dto.setSala(entity.getSala());
		dto.setAndar(entity.getAndar());
		
		return dto;
	}
}
