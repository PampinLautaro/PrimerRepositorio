package POOPackage;



public class EjemploAutomovilEnum {

	public static void main(String[] args) {
		
		Automovil subaru = new Automovil("subaru", "impresa");
		subaru.setMotor(new  Motor(2.2, TipoMotor.NAFTA));
		subaru.setTanque(new Tanque());
		subaru.color = Color.BLANCO;
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		
		Automovil mazda = new Automovil("mazda", "rx7", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
		mazda.setTanque(new Tanque());
		mazda.setTipo(TipoAutomovil.PICKUP);
		
		TipoAutomovil tipoSubaru = subaru.getTipo();
		System.out.println("tipo subaru = " + tipoSubaru.getNombre());
		System.out.println("tipo descripcion subaru = " + tipoSubaru.getDescripcion());
		
		switch(tipoSubaru) { // en vez de ":" se puede usar una flecha y se saca el break;
			case CONVERTIBLE:
				System.out.println("el auto es un convertible y deportivo de 2 puertas");
				break;
			case COUPE:
				System.out.println("es un automovil pequeño de 2 puertas y tipicamente deportivo");
				break;
			case FURGON: 
				System.out.println("es un auto utilitario de transporte de empresa");
				break;
			case HATCHBACK: 
				System.out.println("es un auto mediano compacto");
				break;
			case PICKUP:
				System.out.println("es una camioneta de 4 puertas");
				break;
			case SEDAN: 
				System.out.println("es un automovil mediano");
				break;
			case STATION_WAGON:
				System.out.println("es un automovil grande y podria tener muchas cosas");
				break;
		}
		
		TipoAutomovil[] tipos = TipoAutomovil.values();
		for(TipoAutomovil ta: tipos) {
			System.out.print(ta + " => " +
			ta.name() + ", " + 
			ta.getNombre() + ", " +
			ta.getDescripcion() + ", " +
			ta.getNumeroPuertas());
			System.out.println();
		}
 	}
}
