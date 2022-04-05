package pkg;

import com.Casa;

public class ClaseGenerica2 {
	
	public static void main(String[] args) {
		//Constructor visible desde aqui, puesto que es public
		Casa c = new Casa();
		c.metodoCasa();
		
		ClaseGenerica3 cg = new ClaseGenerica3();
		cg.metodoCasa();
		
		
		//atributos no visibles desde esta clase que está en otro paquete
		//c.color="verde";
		//c.numHabitaciones=3;
		
		//Atributo visible desde donde sea puesto que es public
		c.ubicacion = "Acatzingo 18";
		
		System.out.println(c.ubicacion);
		
		
	}

}
