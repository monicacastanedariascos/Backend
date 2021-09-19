package Backend.Spring.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Spring.modelEntity.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {
	
}
