
public class Acciones {
	private int id_accion;
	private String nombre_accion;
	private boolean actualizacion;
	
	public Acciones(int id, String nom) {
		this.id_accion = id;
		this.nombre_accion = nom;
		this.actualizacion = false;
	}

	public int getId_accion() {
		return id_accion;
	}

	public void setId_accion(int id_accion) {
		this.id_accion = id_accion;
	}

	public String getNombre_accion() {
		return nombre_accion;
	}

	public void setNombre_accion(String nombre_accion) {
		this.nombre_accion = nombre_accion;
	}

	public boolean isActualizacion() {
		return actualizacion;
	}

	public void setActualizacion(boolean actualizacion) {
		this.actualizacion = actualizacion;
	}

}
