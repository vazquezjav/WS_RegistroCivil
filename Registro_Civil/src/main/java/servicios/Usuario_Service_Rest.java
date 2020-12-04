package servicios;

import javax.ws.rs.Produces;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import modelo.Usuario;
import negocio.Gestion_Usuario;

@Path("/usuario")
public class Usuario_Service_Rest {

	@Inject
	private Gestion_Usuario gu;
	
	@GET
	@Path("/datos")
	@Produces("application/json")
	public Usuario getUsuario(@QueryParam("f") String filtro) {
		Usuario u = gu.obtenerUsuario(filtro);
		return u;
	}
}
