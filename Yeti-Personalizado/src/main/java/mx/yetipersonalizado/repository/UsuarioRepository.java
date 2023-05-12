package mx.yetipersonalizado.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.yetipersonalizado.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
	Optional <Usuario> findByMail (String email);
}
