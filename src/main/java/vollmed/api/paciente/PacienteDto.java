package vollmed.api.paciente;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import vollmed.api.endereco.EnderecoDto;

public record PacienteDto(
		@NotBlank	
		String nome,
		
		@NotBlank
		@Email
		String email,
		
		@NotBlank
		String telefone,
		
		@NotBlank
		@CPF
		String cpf, 
		
		@NotNull
		@Valid
		EnderecoDto endereco
		) {

}
