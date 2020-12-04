package datos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Usuario;

@Stateless
public class Usuario_DAO {

	@Inject
	private EntityManager em;

	public Usuario obtenerUsuario(String cedula) {
		try {
			String jpql = "SELECT u FROM Usuario u WHERE cedula_usuario = ?1";
			Query q = em.createQuery(jpql, Usuario.class);
			q.setParameter(1, cedula);
			Usuario u = (Usuario) q.getSingleResult();
			return u;
		} catch (Exception e) {
			return null;
		}
	}
}
