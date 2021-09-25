package Backend.Spring.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Spring.modelEntity.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {
	public List<Usuario> findByNombre(String nombre);

}
