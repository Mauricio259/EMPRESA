
public class Cliente extends Empresa {
	
	private String telefono;
	
	public Cliente(String nombre, int edad, String telefono) {
		super(nombre, edad);
		this.telefono = telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	@Override
	public String toString() {
		return super.toString() + " <> " + telefono;
	}
	
}