package vollmed.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import vollmed.api.medico.Medico;
import vollmed.api.medico.MedicoDto;
import vollmed.api.medico.MedicoRepository;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

	@Autowired
	private MedicoRepository repository;

	@PostMapping
	public void cadastrar(@RequestBody @Valid MedicoDto dto) {

		repository.save(new Medico(dto));

	}

}
