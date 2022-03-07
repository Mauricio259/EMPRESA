
public class Empresa {
	
	private String nombre;
	private int edad;
	
	public Empresa(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	@Override
	public String toString() {
		return nombre + " <> " + edad;
	}

}