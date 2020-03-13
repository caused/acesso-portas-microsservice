package br.com.mastertech.porta.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CreatePortaRequestDTO {

	@NotNull(message = "Nome do andar não pode ser nulo")
	@NotBlank(message = "Andar não pode ser vazio")
	private String andar;
	
	@NotNull(message = "Nome da sala não pode ser nulo")
	@NotBlank(message="Favor informar nome da sala")
	private String sala;
	
	public String getAndar() {
		return andar;
	}
	public void setAndar(String andar) {
		this.andar = andar;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	
	
	
	
}
