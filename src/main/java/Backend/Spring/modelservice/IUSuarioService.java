package Backend.Spring.modelservice;

import java.util.List;

import Backend.Spring.modelEntity.Usuario;

public interface IUSuarioService {
	public List<Usuario> findAll();
	public Usuario findById(Long id);
	public void deleteById(Long id);
	public Usuario save(Usuario usuario);
}
