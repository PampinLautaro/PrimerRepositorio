package POOPackage;

public enum TipoAutomovil {
	SEDAN("sedan", "auto mediano", 4),
	STATION_WAGON("station wagon", "auto grande", 5),
	HATCHBACK("hatchback", "auto compacto", 5),
	PICKUP("pickup", "camioneta", 4),
	COUPE("coupe", "auto pequeño", 2),
	CONVERTIBLE("convertible", "deportivo", 2),
	FURGON("furgon", "auto utilitario", 4);
	
	private final String nombre; 
	private final String descripcion;
	private final int numeroPuertas;

	private TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.numeroPuertas = numeroPuertas;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}
}
