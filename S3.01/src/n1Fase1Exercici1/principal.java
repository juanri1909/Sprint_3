package n1Fase1Exercici1;
import java.util.Scanner;


public class principal {
	
	public static void menu() {
		System.out.println("1.- COPIAR: ");
		System.out.println("2.- PEGAR: ");
		System.out.println("3.- LISTAR: ");
		System.out.println("4.- BORRAR: ");
		System.out.println("5.- SALIR: ");
		System.out.println("Selecciona una opcion: ------> ");
		
	}
	

	public static void main(String[] args) {
		
		int d=0;
		while(d!=5) {
			menu();	
			Scanner dato = new Scanner (System.in);
			d=dato.nextInt(); 			
			if (d==1) {
				undo copiar = undo.getInstance();
				copiar.anadidatos(d);
			}
			else if (d==2) {
				undo pegar = undo.getInstance();
				pegar.anadidatos(d);
			}
			else if (d==3) {
				undo listar = undo.getInstance();
				listar.anadidatos(d);
				listar.imprimir();
			}
			else if (d==4) {
				undo borrar = undo.getInstance();
				borrar.borrardatos();
			}
			
		}
		
	}

}
