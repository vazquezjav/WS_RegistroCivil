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
	public Respuesta getUsuario(@QueryParam("f") String filtro) {
		Usuario u = gu.obtenerUsuario(filtro);
		
		Respuesta res= new Respuesta();
		if(u!=null) {
			res.setCodigo(1);
			res.setMensaje("Ok");
			res.setUsuario(u);
			
		}else {
			res.setCodigo(0);
			res.setMensaje("No se encuentra el usuario");
			res.setUsuario(u);
		}
		System.out.println(res);
		return res;
	}
	@GET
	@Path("/ejemplo")
	@Produces("application/json")
	public Respuesta ejemplo() {
		Respuesta res= new Respuesta();
			res.setCodigo(1);
			res.setMensaje("Ok");
		System.out.println(res);
		return res;
	}
}
