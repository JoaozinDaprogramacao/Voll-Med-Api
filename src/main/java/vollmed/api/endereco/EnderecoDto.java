package vollmed.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EnderecoDto(
		@NotBlank
		
		String logradouro, 
		@NotBlank

		String numero, 
		
		String complemento,
		@NotBlank

		String bairro, 
		@NotBlank

		String cidade, 
		@NotBlank
		String uf,
		@NotBlank
		@Pattern(regexp = "\\d{8}")
		String cep) {

}
