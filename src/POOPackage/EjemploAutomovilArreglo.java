package POOPackage;

import java.util.Arrays;

public class EjemploAutomovilArreglo {

	public static void main(String[] args) {
		
		Persona conductorSubaru = new Persona("luci", "martinez");
		Automovil subaru = new Automovil("subaru", "impresa");
		subaru.setMotor(new  Motor(2.2, TipoMotor.NAFTA));
		subaru.setTanque(new Tanque());
		subaru.color = Color.BLANCO;
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		subaru.setConductor(conductorSubaru);
		
		
		
		
		Persona pato = new Persona("pato", "rodiguez");
		Automovil mazda = new Automovil("mazda", "rx7", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
		mazda.setTipo(TipoAutomovil.PICKUP);
		mazda.setConductor(pato);
		
		
		
		
		Persona bea = new Persona("bea", "gonzales");
		Automovil nissan = new Automovil("nissan", "navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL));
		nissan.setTipo(TipoAutomovil.PICKUP);
		
		
		
		
		Persona lalo = new Persona("lalo", "mena");
		Automovil suzuki = new Automovil("suzuki", "vitara", Color.GRIS, new Motor(1.6, TipoMotor.NAFTA));
		suzuki.setConductor(lalo);
		Automovil.setcolorPatente(Color.AZUL);
		suzuki.setTipo(TipoAutomovil.PICKUP);
		
		
		Automovil audi = new Automovil("audi", "a3");
		audi.setConductor(new Persona("jano", "perez"));
		
		Automovil[] autos = new Automovil[5];
		autos[0] = subaru;
		autos[1] = mazda;
		autos[2] = nissan;
		autos[3] = suzuki;
		autos[4] = audi;
		
		Arrays.sort(autos);
		for(int i = 0; i < autos.length; i++) {
			System.out.println(autos[i]);
		}
	}
 	}

