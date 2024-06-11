package POOPackage;

public class Automovil implements Comparable<Automovil>{
	
	// orden: atributos + constructor + get set + operaciones + sobreescribir
	
	private int id;
	private String fabricante;
	private String modelo;
	Color color = Color.GRIS;
	private Motor motor;
	private Tanque tanque;
	private Persona conductor;
	private Rueda[] ruedas;
	private int indiceRuedas;
	
	private TipoAutomovil tipo;
	
	private static Color colorPatente = Color.NARANJA;
	private static int capacidadNaftaEstatico = 30;
	private static int ultimoId;
	
	public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
	public static final int VELOCIDAD_MAXIMA_CIUDAD = 60;
	
	public static final String COLOR_ROJO = "rojo";
	public static final String COLOR_AMARILLO = "amarillo";
	public static final String COLOR_AZUL = "azul";
	public static final String COLOR_BLANCO = "blanco";
	public static final String COLOR_GRIS = "gris";
	
	public Automovil() {
		this.id = ++ultimoId;
	}
	
	public Automovil(String fabricante, String modelo) {
		this();
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	
	public Automovil(String fabricante, String modelo, Color color) {
		this(fabricante, modelo);
		this.color = color;
	}
	
	
	
	public Automovil(String fabricante, String modelo, Color color, Motor motor) {
		this(fabricante, modelo, color);
		this.motor = motor;
	}
	
	

	public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
		this(fabricante, modelo, color, motor);
		this.tanque = tanque;
	}
	
	
	public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor,
			Rueda[] ruedas) {
		this(fabricante, modelo, color, motor, tanque);
		this.conductor = conductor;
		this.ruedas = ruedas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFabricante() {
		return this.fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}//esto lo hice con getter and setter: click derecho + source + getter and setter
	
	public static Color getcolorPatente() {
		return colorPatente;
	}
	public static void setcolorPatente(Color getcolorPatente) {
		Automovil.colorPatente = colorPatente;
	}
	
	public TipoAutomovil getTipo() {
		return tipo;
	}

	public void setTipo(TipoAutomovil tipo) {
		this.tipo = tipo;
	}
	
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Tanque getTanque() {
		return tanque;
	}

	public void setTanque(Tanque tanque) {
		this.tanque = tanque;
	}

	public Persona getConductor() {
		return conductor;
	}

	public void setConductor(Persona conductor) {
		this.conductor = conductor;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}
	
	public String detalle() {
		StringBuilder sb = new StringBuilder();
		sb.append("auto.id = " + this.id);
		sb.append("\nauto.fabricante = " + this.getFabricante());
		sb.append("\nauto.modelo = " + this.getModelo());
		sb.append("\nauto.tipo = " + this.getTipo().getDescripcion());
		sb.append("\nauto.color = " + this.color.getColor());
		sb.append("\nauto.motor = " + this.motor.getCilindrada());
		sb.append("\nconductor subaru: " + this.getConductor());
		sb.append("\nruedas: " + this.getRuedas());
		sb.append("\nauto.patenteColor = " + colorPatente.getColor()); // porque es una clase estatica (sin this.)
		return sb.toString();
	}
	
	public String acelerar(int rpm) {
		return "el auto " + getFabricante() + " esta acelerando a " + rpm + "rpm";
	}
	
	public String frenar() {
		return this.getFabricante() + " " + this.getModelo() + " esta frenando";
	}
	
	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		return acelerar + "\n" + frenar;
	}
	
	public float calcularConsumo(int km, float porcentajeNafta) {
		return km/(porcentajeNafta*tanque.getCapacidad());
	}
	
	public static float calcularConsumoEstatico(int km, float porcentajeNafta) {
		return km/(porcentajeNafta*capacidadNaftaEstatico);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Automovil)) {
			return false;
		}
		Automovil a = (Automovil)obj;
		return (this.fabricante != null && this.modelo != null
				&&this.getFabricante().equals(a.getFabricante())
				&& this.getModelo().equals(a.getModelo()));
	}

	@Override
	public String toString() {
		return this.id + " : " + "Automovil [fabricante=" + fabricante
				+ ", modelo=" + modelo
				+ ", color=" + color
				/*+ ", cilindrada=" + motor.getCilindrada()*/
				/*+ ", capacidadNafta=" + tanque.getCapacidad()*/ + "]";
	}
	
	//@Override
	public int compareTo(Automovil a) {
		return fabricante.compareTo(a.fabricante);
	}
	
	
}
