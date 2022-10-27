package editorTextual;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		mainMenu();
	}
	
	public static void mainMenu() {
		/* 
		Data to send to functions
		
		name 		 -> In this case name file or folder as name and route
		textToAdd	 -> Users text
		confirmation -> This variable contain si or no
		menuOption 	 -> Save menu option integer
		*/
		String name = "";
		String textToAdd = "";
		String confirmation = "";
		int menuOption;
		
		// class scanner to get data
		Scanner getData = new Scanner(System.in);
		
		System.out.println("\n*********************");
		System.out.println("** EDITOR DE TEXTO **");
		System.out.println("*********************\n");
		
		System.out.println("Seleccione una opción:\n");
		
		System.out.println("1) Crear un fichero");
		System.out.println("2) Editar un fichero");
		System.out.println("3) Borrar un fichero");
		System.out.println("4) Crear una carpeta");
		System.out.println("5) Borrar una carpeta");
		System.out.println("6) Salir");
		System.out.println("\nOpcion:");
		
		// Get menu option
		menuOption = getData.nextInt();
		
		if (menuOption == 1) {
			createFile(name, confirmation);
		}
		else if (menuOption == 2) {
			editFile(name, textToAdd);
		}
		else if (menuOption == 3) {
			deleteFile(name, confirmation);
		}
		else if (menuOption == 4) {
			createFolder(name);
		}
		else if (menuOption == 5) {
			deleteFolder(name, confirmation);
		}
		else if (menuOption == 6) {
			System.out.println("Programa finalizado");
			return;
		}
		else {
			System.out.println("Opción no válida");
			mainMenu();
		}
	}
	
	public static void createFile(String name, String confirmation) {
		// class scanner to get data
		Scanner getData = new Scanner(System.in);
		// Variables to create file
		File file = null;
		FileWriter fileWriter = null;
		
		// Get name to file
		System.out.println("Introduzca el nombre del nuevo fichero:");
		name = getData.nextLine() + ".txt";
		file = new File(name);
		
		// Check if user want to replace file or create new file
		if (file.exists()) {
			System.out.println("Fichero existente ¿Desea sobrescribirlo? ");
			confirmation = getData.nextLine().toLowerCase();
			
			if (confirmation.equals("no")) {
				// Return to main menu because the user don't want replace file
				System.out.println("No se creó el archivo, volviendo al menú inicial.");
				mainMenu();
			}
			else if (!confirmation.equals("si")) {
				// Return to main menu because the user was send wrong response 
				System.out.println("Opción no válida\n");
				mainMenu();
			}
		}
		
		// Create file or replace
		try {
			fileWriter = new FileWriter(name);
			System.out.println("Archivo " + name + " nuevo creado con éxito.");
			fileWriter.close();
			mainMenu();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void editFile(String name, String textToAdd) {
		// class scanner to get data
		Scanner getData = new Scanner(System.in);
		// Variables to create file
		File file = null;
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		// Get name to file
		System.out.println("Introduzca el nombre del nuevo fichero a editar:");
		name = getData.nextLine() + ".txt";
		file = new File(name);
		
		// Check if file exist
		if (!file.exists()) {
			System.out.println("Fichero inexistente.");
			mainMenu();
		}
		
		// Getting text and adding
		System.out.println("Introduzca el texto que desea añadir al fichero:");
		textToAdd = getData.nextLine();
		
		// Write new text
		try {
			fileWriter = new FileWriter(name, true);
			printWriter = new PrintWriter(fileWriter);
			printWriter.println(textToAdd);
			
			System.out.println("Documento editado correctamente");
			fileWriter.close();
			mainMenu();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteFile(String name, String confirmation) {
		// class scanner to get data
		Scanner getData = new Scanner(System.in);
		// Variables to create file
		File file = null;
		
		// Get name to file
		System.out.println("Introduzca el nombre del fichero a borrar:");
		name = getData.nextLine() + ".txt";
		file = new File(name);
		
		// Check if file exist
		if (!file.exists()) {
			System.out.println("Fichero inexistente.");
			mainMenu();
		}
		
		// Check if user want to delete file
		System.out.println("¿Está seguro de que desea borrarlo (Afirmación S)?");
		confirmation = getData.nextLine().toLowerCase();
		
		// Delete file if is necessary
		if (confirmation.equals("s")) {
			file.delete();
			System.out.println("Fichero eliminado correctamente");
		}else {
			System.out.println("El fichero no se borró del sistema");
		}
		
		// Return main menu
		mainMenu();
	}
	
	public static void createFolder(String name) {
		// class scanner to get data
		Scanner getData = new Scanner(System.in);
		// Variables to create file
		File folder = null;
		
		// Get name to file
		System.out.println("Introduzca el nombre de la carpeta a crear:");
		name = getData.nextLine();
		folder = new File(name);
		
		// Check if exists the folder and return main menu
		if (folder.exists()) {
			System.out.println("Carpeta ya existente");
			mainMenu();
		}
		
		// Create new folder
		folder.mkdir();
		System.out.println("Carpeta creada correctamente");
		mainMenu();
	}
	
	public static void deleteFolder(String name, String confirmation) {
		// class scanner to get data
		Scanner getData = new Scanner(System.in);
		// Variables to create file
		File folder = null;
		
		// Get name to file
		System.out.println("Introduzca el nombre de la carpeta a borrar:");
		name = getData.nextLine();
		folder = new File(name);
		
		// Check if NOT exists the folder and return main menu
		if (!folder.exists()) {
			System.out.println("La carpeta no existe");
			mainMenu();
		}
		
		// Check if user want to delete file
		System.out.println("¿Está seguro de que desea borrar la carpeta (Afirmación S)?");
		confirmation = getData.nextLine().toLowerCase();
		
		// Delete folder if is necessary
		if (confirmation.equals("s")) {
			folder.delete();
			System.out.println("Carpeta borrada correctamente");
		}else {
			System.out.println("La carpeta no se borró del sistema");
		}
		
		// Return main menu
		mainMenu();
		
	}

}
