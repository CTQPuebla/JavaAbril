package pkg;

import com.Casa;

public class ClaseGenerica3 extends Casa{
	
	public String materiales;
	
	public ClaseGenerica3() {
		
		//Aqui los atributos si son alcanzables mediante la herencia
		/*
		 * Si esta clase (ClaseGenerica3) se hereda en otra (ClaseGenerica4)
		 * los atributos se comportan como private
		 */
		this.color="Rosa";
		this.numHabitaciones=4;
		
	}

	public String getMateriales() {
			
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}
	
	@Override
	public void metodoCasa() {
		System.out.println("Este metodo es nativo de la clase ClaseGenerica3");
	}
	

}
