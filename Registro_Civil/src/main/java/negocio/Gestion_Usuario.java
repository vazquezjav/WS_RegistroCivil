package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.Usuario_DAO;
import modelo.Usuario;

@Stateless
public class Gestion_Usuario {

	@Inject
	private Usuario_DAO usuarioDAO;
	
	public Usuario obtenerUsuario(String cedula) {
		return usuarioDAO.obtenerUsuario(cedula);
	}
}
