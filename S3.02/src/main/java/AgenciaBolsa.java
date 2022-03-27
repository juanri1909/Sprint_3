import java.util.ArrayList;

public class AgenciaBolsa {
	private int id_AgenciaBolsa;
	private String nombre;
	private ArrayList <Acciones> TipoAcciones = new ArrayList<Acciones>();
	
	public AgenciaBolsa(int id, String nom) {
		this.id_AgenciaBolsa= id;
		this.nombre = nom;
	}
	
	public void AnyadirAcciones(Acciones a) {
		this.TipoAcciones.add(a);
	}
	
	
	public int getId_AgenciaBolsa() {
		return id_AgenciaBolsa;
	}

	public void setId_AgenciaBolsa(int id_AgenciaBolsa) {
		this.id_AgenciaBolsa = id_AgenciaBolsa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Acciones> getTipoAcciones() {
		return TipoAcciones;
	}

	public void setTipoAcciones(ArrayList<Acciones> tipoAcciones) {
		TipoAcciones = tipoAcciones;
	}

	public void Imprimir() {
		System.out.println(id_AgenciaBolsa +" "+ nombre + " "+
						TipoAcciones.get(0).getNombre_accion()+" "+
						TipoAcciones.get(0).getId_accion() +" " +
						TipoAcciones.get(0).isActualizacion());
	}
	
	

}
