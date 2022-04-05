package pkg;

//public class ClaseGenerica4 extends ClaseGenerica3{
public class ClaseGenerica4{
	
	
	int atributoGenerico;
	
	public ClaseGenerica4() {
		
	
	}
	
	public static void main(String[] args) {
		ClaseGenerica3 cg3= new ClaseGenerica3();
		
		//Este atributo es protected en su clase origen
		//Aqui se comporta como privado, no es alcanzable
		//cg3.numHabitaciones=5;
	}

}
