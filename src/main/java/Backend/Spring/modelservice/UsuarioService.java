package Backend.Spring.modelservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.Spring.DAO.IUsuarioDAO;
import Backend.Spring.modelEntity.Usuario;

@Service
public class UsuarioService implements IUSuarioService {

	@Autowired
	private IUsuarioDAO usuarioDAO;
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return usuarioDAO.findAll();
	}
	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return usuarioDAO.findById(id).orElse(null);
	}
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		usuarioDAO.deleteById(id);		
	}
	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDAO.save(usuario);
	}
	

}
