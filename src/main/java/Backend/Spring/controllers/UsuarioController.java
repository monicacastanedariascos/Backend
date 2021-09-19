package Backend.Spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import Backend.Spring.modelEntity.Usuario;
import Backend.Spring.modelservice.IUSuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	private IUSuarioService usuarioservice;
	
	@GetMapping("/usuarios")
	public List<Usuario> index(){
		return usuarioservice.findAll();
	}
	@GetMapping("/usuarios/{id}")
	public Usuario show(@PathVariable Long id) {
		return usuarioservice.findById(id);
	}
	@DeleteMapping("/usuarios/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioservice.deleteById(id);
	}
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario guardar(@RequestBody Usuario usuario) {
		return usuarioservice.save(usuario);
	}
	
	@PutMapping("/usuarios/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
		Usuario actual=usuarioservice.findById(id);
		actual.setFecha_fin(usuario.getFecha_fin());
		actual.setFecha_nacimiento(usuario.getFecha_nacimiento());
		return usuarioservice.save(actual);
	}
	
}
