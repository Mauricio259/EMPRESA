import java.util.*;
import java.util.Map.Entry;

public class MainEmpresa {
	
	public static void main (String[] args) {
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Directivo> directivos = new ArrayList<Directivo>();
		ArrayList<Vehiculo> coche = new ArrayList<Vehiculo>();
		SortedMap<Integer, String> asignar = new TreeMap<Integer, String>();
		Scanner leer;
		String nombre, telefono, categoria, matricula, kilometraje, opcion;
		int edad, item;
		double sueldo;
		boolean control = true;
		
		while(control) {
			leer = new Scanner(System.in);
			System.out.println("\n***************** MENU *****************\n");
			System.out.println("1. Ingresar empleado");
			System.out.println("2. Ingresar cliente");
			System.out.println("3. Mostrar los datos");
			System.out.println("4. Asignar vehículo");
			System.out.println("5. Mostrar vehículos asignados");
			System.out.println("6. Salir\n");
			
			System.out.print("Escoja una opción: ");
			item = leer.nextInt();
			
			if(item == 1) {
				leer = new Scanner(System.in);
				System.out.print("\nIngrese el nombre: ");
				nombre = leer.nextLine();
				System.out.print("Ingrese la edad: ");
				edad = leer.nextInt();
				System.out.print("Ingrese el sueldo bruto: ");
				sueldo = leer.nextDouble();
				
				Empleado empleado = new Empleado(nombre, edad, sueldo);
				
				System.out.println("\n¿El empleado es directivo?");
				leer = new Scanner(System.in);
				System.out.print("Escoja una opcion [si / no]: ");
				opcion = leer.nextLine();

				if(opcion.toLowerCase().equals("si")) {	
					leer = new Scanner(System.in);
					System.out.print("\nCategoria: ");
					categoria = leer.nextLine();
					Directivo directivo = new Directivo(empleado, categoria);
					directivos.add(directivo);
				}
				else {
					empleados.add(empleado);
				}
			}

			if(item == 2) {
				leer = new Scanner(System.in);
				System.out.print("\nIngrese el nombre: ");
				nombre = leer.nextLine();
				System.out.print("Ingrese la edad: ");
				edad = leer.nextInt();
				leer = new Scanner(System.in);
				System.out.print("Ingrese el telefono: ");
				telefono = leer.nextLine();
				
				Cliente cliente = new Cliente(nombre, edad, telefono);
				clientes.add(cliente);
				
			}
			
			if(item == 3) {
				leer = new Scanner(System.in);
				System.out.println("\n¿A qué datos desea acceder?");
				System.out.print("Escoja una opción [directivos | empleados | clientes]: ");
				opcion = leer.nextLine();
				System.out.println(" ");
				if(opcion.toLowerCase().equals("directivos")) {
					for(int i = 0; i < directivos.size(); i++) {
						System.out.println(directivos.get(i));
					}
				}
				if(opcion.toLowerCase().equals("empleados")) {
					for(int i = 0; i < empleados.size(); i++) {
						System.out.println(empleados.get(i));
					}
				}
				
				if(opcion.toLowerCase().equals("clientes")) {
					for(int i = 0; i < clientes.size(); i++) {
						System.out.println(clientes.get(i));
					}
				}
				
			}
			
			if(item == 4) {
				System.out.println(" ");
				for(int i = 0; i < directivos.size(); i++) {
					asignar.put((i+1), directivos.get(i).getDirectivo().getNombre()+" <> "+directivos.get(i).getCategoria());
				}
				for(Entry<Integer, String> dir : asignar.entrySet()) {
					System.out.println("Cod: "+dir.getKey()+" <> Directivo: "+dir.getValue());
				}
				leer = new Scanner(System.in);
				System.out.print("\nAsignar [directivo] o [vehículo]: ");
				opcion = leer.nextLine();
				if(opcion.toLowerCase().equals("directivo")) {
					leer = new Scanner(System.in);
					System.out.print("\nIngresar matricula de vehiculo: ");
					matricula = leer.nextLine();
					System.out.print("Ingresar kilometraje: ");
					kilometraje = leer.nextLine();
					System.out.print("Ingresar codigo directivo: ");
					item = leer.nextInt();
					Vehiculo vehiculo = new Vehiculo(matricula, kilometraje);
					coche.add(vehiculo);
					directivos.get(item-1).setVehiculo(vehiculo);
					System.out.println("\n"+directivos.get(item-1));
					System.out.println(directivos.get(item-1).getVehiculo());
				}
				else
					if(opcion.toLowerCase().equals("vehiculo") || opcion.toLowerCase().equals("vehículo")) {
						leer = new Scanner(System.in);
						System.out.print("\nIngresar matricula de vehiculo: ");
						matricula = leer.nextLine();
						System.out.print("Ingresar kilometraje: ");
						kilometraje = leer.nextLine();
						System.out.print("Ingresar codigo directivo: ");
						item = leer.nextInt();
						Vehiculo vehiculo = new Vehiculo(matricula, kilometraje);
						coche.add(vehiculo);
						vehiculo.setDirectivo(directivos.get(item-1));
						System.out.println("\n"+vehiculo);
						System.out.println(vehiculo.getDirectivo());
					}
		
			}
			
			if(item == 5) {
				System.out.println(" ");
				for(int i = 0; i < coche.size(); i++) {
					System.out.println(coche.get(i));
				}
			}
			
			if(item == 6) {
				System.out.print("\nSalió del menú");
				control = false;
			}
				
		}
		
	}

}