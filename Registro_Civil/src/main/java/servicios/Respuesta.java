package servicios;

import modelo.Usuario;

public class Respuesta {

	private int codigo;
	private String mensaje;
	private Usuario usuario;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "Respuesta [codigo=" + codigo + ", mensaje=" + mensaje + ", usuario=" + usuario + "]";
	}
	
	
}
