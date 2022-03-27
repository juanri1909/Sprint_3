import java.util.ArrayList;

public class Principal{
    public static void main(String args[]){
        ArrayList <AgenciaBolsa> Clientes = new ArrayList<AgenciaBolsa>();
        
        Acciones a1 = new Acciones(1,"Accion_1");
        Acciones a2 = new Acciones(2, "Accion_2");
        Acciones a3 = new Acciones(3, "Accion_3");
        Acciones a4 = new Acciones(4, "Accion_4");
        Acciones a5 = new Acciones(5, "Accion_5");
        Acciones a6 = new Acciones(6, "Accion_6");
        
        AgenciaBolsa ab1 = new AgenciaBolsa(1,"Agencia_Bolsa_1");
        ab1.AnyadirAcciones(a1);
        ab1.AnyadirAcciones(a3);
        ab1.AnyadirAcciones(a6);
        
        AgenciaBolsa ab2 = new AgenciaBolsa(2,"Agencia_Bolsa_2");
        ab2.AnyadirAcciones(a2);
        
        a1.setActualizacion(true);
        a2.setActualizacion(true);
        a6.setActualizacion(true);
        
        Clientes.add(ab1);
        Clientes.add(ab2);
        
        
        for(int i=0; i<Clientes.size(); i++) {
        	for (Acciones ac: Clientes.get(i).getTipoAcciones()) {
        		if (ac.isActualizacion()) {
        			System.out.println("NOMBRE: "+ Clientes.get(i).getNombre() + " " +
        								ac.getNombre_accion() + " HA SUBIDO SU VALOR " +
        								"MANDANDO MENSAJE.....");
        		}
        		
        	}
        }
        a1.setActualizacion(false);
        a3.setActualizacion(false);
   
        
        
      
    }
}