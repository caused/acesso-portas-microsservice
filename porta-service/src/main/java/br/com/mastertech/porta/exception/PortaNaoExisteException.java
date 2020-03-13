package br.com.mastertech.porta.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Porta não existe")
public class PortaNaoExisteException extends RuntimeException {

}
