package POOPackage;



public class EjemploAutomovilStatic {

	public static void main(String[] args) {
		
		Automovil subaru = new Automovil("subaru", "impresa");
		subaru.setMotor(new  Motor(2.2, TipoMotor.NAFTA));
		subaru.setTanque(new Tanque());
		subaru.color = Color.BLANCO;
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		
		Automovil mazda = new Automovil("mazda", "rx7", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
		mazda.setTipo(TipoAutomovil.PICKUP);
		
		Automovil nissan = new Automovil("nissan", "navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL));
		nissan.setTipo(TipoAutomovil.PICKUP);
		Automovil nissan2 = new Automovil("nissan", "navara", Color.GRIS, new Motor(3.5, TipoMotor.NAFTA));
		Automovil.setcolorPatente(Color.AZUL);
		nissan2.setTipo(TipoAutomovil.PICKUP);
		
		Automovil auto = new Automovil();
		
		System.out.println(nissan.equals(nissan2)); //antes era false, lo sobreescribi y ahora es true
		
		System.out.println("\n" + subaru.detalle());
		System.out.println("\n" + mazda.detalle());
		System.out.println("\n" + nissan.detalle());
		System.out.println("\n" + nissan2.detalle());
		System.out.println("\n" + Automovil.getcolorPatente().getColor());
		
		System.out.println("kilometros por litro : " + Automovil.calcularConsumoEstatico(300, 0.60f));
		
		System.out.println("velocidad maxima carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
		System.out.println("velocidad maxima ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD);
		
		TipoAutomovil tipoSubaru = subaru.getTipo();
		System.out.println("tipo subaru = " + tipoSubaru.getNombre());
		System.out.println("tipo descripcion subaru = " + tipoSubaru.getDescripcion());
 	}
}
