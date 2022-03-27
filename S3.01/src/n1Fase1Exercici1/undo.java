package n1Fase1Exercici1;

import java.util.ArrayList;

public class undo{
	//create an object of SingleObject
	private static undo miundo;
	private String[] comandos = new String[5];
	
	private ArrayList<Integer> miLista = new ArrayList<Integer>();
	private undo() {}
	
	public ArrayList<Integer> getMiLista() {
		return miLista;
	}

	public void setMiLista(ArrayList<Integer> miLista) {
		this.miLista = miLista;
	}

	public static undo getInstance(){
		if (miundo == null){
			return miundo = new undo();
		}
		return miundo;
	}
	
	public void anadidatos(int d) {
		miLista.add(d);
	}
	
	public void borrardatos() {
		miLista.clear();
	}
	
	public void imprimir() {
		comandos[0]="Copiado...";
		comandos[1]="Pegado...";
		comandos[2]="Listar...";
		comandos[3]="Borrar Lista...";
		comandos[4]="Salir";
		for(int i=0; i<miLista.size(); i++) {
			System.out.println(comandos[miLista.get(i)-1]);
		}
	}

}
