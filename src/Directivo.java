
public class Directivo {
	
	private Empleado directivo;
	private Vehiculo vehiculo;
	private String categoria;
	
	public Directivo(Empleado directivo, String categoria) {
		this.directivo = directivo;
		this.categoria = categoria;
	}
	
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	
	public Empleado getDirectivo() {
		return directivo;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	@Override
	public String toString() {
		return directivo + " <> " + categoria;
	}
	
}