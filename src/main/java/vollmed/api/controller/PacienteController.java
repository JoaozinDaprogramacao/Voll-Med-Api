package vollmed.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vollmed.api.paciente.Paciente;
import vollmed.api.paciente.PacienteDto;
import vollmed.api.paciente.PacienteRepository;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	private PacienteRepository repository;
	
	@PostMapping
	public void cadastra(@RequestBody PacienteDto dto) {

		repository.save(new Paciente(dto));
		
	}

}
