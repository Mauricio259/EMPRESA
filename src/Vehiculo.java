
public class Vehiculo {
	
	private Directivo directivo;
	private String matricula;
	private String kilometraje;
	
	public Vehiculo(String matricula, String kilometraje) {
		this.matricula = matricula;
		this.kilometraje = kilometraje;
	}
	
	public void setDirectivo(Directivo directivo) {
		this.directivo = directivo;
	}
	
	public Directivo getDirectivo() {
		return directivo;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public String getKilometraje() {
		return kilometraje;
	}
	
	@Override
	public String toString() {
		return "Matricula: "+matricula+" <> Kilometraje: "+kilometraje; 
	}

}