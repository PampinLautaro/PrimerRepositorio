package POOPackage;



public class EjemploAutomovilRelacionesObjetos {

	public static void main(String[] args) {
		
		Rueda[] ruedasSub = new Rueda[5];
		ruedasSub[0] = new Rueda("yokohama", 16, 7.5);
		ruedasSub[1] = new Rueda("yokohama", 16, 7.5);
		ruedasSub[2] = new Rueda("yokohama", 16, 7.5);
		ruedasSub[3] = new Rueda("yokohama", 16, 7.5);
		ruedasSub[4] = new Rueda("yokohama", 16, 7.5);
		
		Persona conductorSubaru = new Persona("luci", "martinez");
		Automovil subaru = new Automovil("subaru", "impresa");
		subaru.setMotor(new  Motor(2.2, TipoMotor.NAFTA));
		subaru.setTanque(new Tanque());
		subaru.color = Color.BLANCO;
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		subaru.setConductor(conductorSubaru);
		subaru.setRuedas(ruedasSub);
		
		Rueda[] ruedasMaz = new Rueda[5];
		ruedasMaz[0] = new Rueda("michelin", 18, 10.5);
		ruedasMaz[1] = new Rueda("michelin", 18, 10.5);
		ruedasMaz[2] = new Rueda("michelin", 18, 10.5);
		ruedasMaz[3] = new Rueda("michelin", 18, 10.5);
		ruedasMaz[4] = new Rueda("michelin", 18, 10.5);
		
		Persona pato = new Persona("pato", "rodiguez");
		Automovil mazda = new Automovil("mazda", "rx7", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
		mazda.setTipo(TipoAutomovil.PICKUP);
		mazda.setConductor(pato);
		mazda.setRuedas(ruedasMaz);
		
		Rueda[] ruedasNis = new Rueda[5];
		ruedasNis[0] = new Rueda("pirelli", 20, 11.5);
		ruedasNis[1] = new Rueda("pirelli", 20, 11.5);
		ruedasNis[2] = new Rueda("pirelli", 20, 11.5);
		ruedasNis[3] = new Rueda("pirelli", 20, 11.5);
		ruedasNis[4] = new Rueda("pirelli", 20, 11.5);
		
		Persona bea = new Persona("bea", "gonzales");
		Automovil nissan = new Automovil("nissan", "navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL));
		nissan.setTipo(TipoAutomovil.PICKUP);
		nissan.setRuedas(ruedasNis);
		
		Rueda[] ruedasNis2 = new Rueda[5];
		ruedasNis2[0] = new Rueda("pirelli", 20, 11.5);
		ruedasNis2[1] = new Rueda("pirelli", 20, 11.5);
		ruedasNis2[2] = new Rueda("pirelli", 20, 11.5);
		ruedasNis2[3] = new Rueda("pirelli", 20, 11.5);
		ruedasNis2[4] = new Rueda("pirelli", 20, 11.5);
		
		Persona lalo = new Persona("lalo", "mena");
		Automovil nissan2 = new Automovil("nissan", "navara", Color.GRIS, new Motor(3.5, TipoMotor.NAFTA));
		Automovil.setcolorPatente(Color.AZUL);
		nissan2.setTipo(TipoAutomovil.PICKUP);
		nissan2.setRuedas(ruedasNis2);
		
		Automovil auto = new Automovil();
		
		System.out.println(nissan.equals(nissan2)); //antes era false, lo sobreescribi y ahora es true
		
		System.out.println("\n" + subaru.detalle());
		System.out.println("\n" + mazda.detalle());
		System.out.println("\n" + nissan.detalle());
		System.out.println("\n" + nissan2.detalle());
		
		System.out.println("conductos subaru: " + subaru.getConductor());
		System.out.println("ruedas subaru: ");
		for(Rueda r: subaru.getRuedas()) {
			System.out.println("aro: " + r.getAro() + ", ancho: " + r.getAncho());
		}
 	}
}
