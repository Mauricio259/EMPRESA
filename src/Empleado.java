
public class Empleado extends Empresa {

	private double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		super(nombre,edad);
		this.sueldo = sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	@Override
	public String toString() {
		return super.toString() + " <> $ " + sueldo;
	}

}