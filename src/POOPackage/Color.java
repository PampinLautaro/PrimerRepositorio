package POOPackage;

public enum Color {
	ROJO("rojo"), 
	AMARILLO("amarillo"), 
	AZUL("azul"),
	BLANCO("blanco"),
	GRIS("gris"),
	NARANJA("naranja");
	
	private final String color;

	private Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	
}
