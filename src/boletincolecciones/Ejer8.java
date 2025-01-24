package boletincolecciones;

import java.util.*;

public class Ejer8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Variable para guardar la opción que selecciona el usuario
		int userInput;
		
		// Variables para guardar temporalmente el usuario y la contraseña
		String user;
		String password;
		
		// Intentos para iniciar sesión
		int attempts = 3;
		
		// Valor booleano para indicar si el usuario ha entrado al sistema
		boolean loggedIn = false;
		
		// Declaramos el hashmap para guardar los usuarios con sus contraseñas
		HashMap<String, String>usersDatabase = new HashMap<>();
		
		do {
			// Mostramos por pantalla el mensaje con las distintas opciones
			System.out.println("1. Registro\n"
					+ "2. Login\n"
					+ "0. Salir");
			
			// Guardamos la opción que ha seleccionado el usuario
			userInput = reader.nextInt();
			
			// Switch case con las opciones
			switch (userInput) {
			case 1 -> { // Registro
				System.out.print("Introduce el nombre de usuario: ");
				user = reader.next();
				
				System.out.print("Introduce la contraseña: ");
				password = reader.next();
				
				// Guardamos en el hashmap los valores
				usersDatabase.put(user, password);
				
				System.out.println("El registro se ha actualizado correctamente.");
			}
			case 2 -> { // Login
				// Pedimos el nombre de usuario
				System.out.print("Introduce el nombre de usuario: ");
				user = reader.next();
				
				/* Bucle Do-while que se repetirá mientras no haya superado el
				 * límite de intentos y no haya acertado la contraseña */
				do {
					System.out.print("Introduce la contraseña: ");
					password = reader.next();
					
					/* Si la clave (usuario) y el valor (contraseña) son iguales,
					 * significa que el usuario ha introducido correctamente sus
					 * credenciales, por lo que iniciaremos sesión cambiando el
					 * booleano "loggedIn" a true e imprimiendo un mensaje para
					 * indicarle que ha realizado el inicio de sesión correctamente */
					if (usersDatabase.get(user).equals(password)) {
						loggedIn = true;
						System.out.println("Ha accedido al área restringida.");
					}
					
					// Restamos un intento
					--attempts;
				} while (attempts > 0 && !loggedIn);
				
				// Si se han acabado los intentos y todavía no ha iniciado sesión, se le bloquea el acceso
				if (attempts == 0 && !loggedIn)
					System.out.println("Lo siento, no tiene acceso al área restringida.");
			}
			case 0 -> { // Salir
				System.out.println("Saliendo del sistema...");
			}
			}
		} while (userInput != 0);
		
		reader.close();

	}

}
