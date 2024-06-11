package POOPackage;

import java.util.Date;

public class EjemploAutomovil {

	public static void main(String[] args) {

		Motor motorSubaru = new  Motor(2.2, TipoMotor.NAFTA);
		Automovil subaru = new Automovil("subaru", "impresa");
		subaru.setMotor(motorSubaru);
		subaru.setTanque(new Tanque());
		subaru.color = Color.BLANCO;
		
		Automovil mazda = new Automovil("mazda", "rx7", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
		mazda.setTanque(new Tanque());
		
		Automovil nissan = new Automovil("nissan", "navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL));
		Automovil nissan2 = new Automovil("nissan", "navara", Color.GRIS, new Motor(3.5, TipoMotor.NAFTA));
		
		Automovil auto = new Automovil();
		
		Date fecha = new Date();
		
		System.out.println(nissan.equals(nissan2)); //antes era false, lo sobreescribi y ahora es true
		
		System.out.println("\n" + subaru.detalle());
		System.out.println("\n" + mazda.detalle());
		System.out.println("\n" + nissan.detalle());
		System.out.println("\n" + subaru.acelerar(3000));
		System.out.println("\n" + subaru.frenar());
		System.out.println("\n" + auto.equals(fecha));
		
		System.out.println("\n" + nissan);
		System.out.println("\n" + nissan.toString());
		
		System.out.println("\n" + mazda.acelerarFrenar(4000));
		
		System.out.println("\n" + "kilometreos por litro subaru = " + subaru.calcularConsumo(300, 0.75f));
		System.out.println("\n" + "kilometreos por litro mazda = " + mazda.calcularConsumo(300, 0.6f));
		System.out.println("\n" + "kilometreos por litro nissan = " + nissan.calcularConsumo(300, 0.5f));
	}

}
