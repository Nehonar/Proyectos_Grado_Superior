package calculadora_textual;
import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		// Menu option
		int menuOption;
		
		// print head
		System.out.println("***********************************");
		System.out.println("**                               **");
		System.out.println("**  CALCULADORA CALCULATOR S.A   **");
		System.out.println("**                               **");
		System.out.println("***********************************\n");
		
		while (true) {
			// get menu option
			menuOption = (int) printMenu();
			
			// select option
			if (menuOption == 1) {
				sum();
			}
			else if (menuOption == 2) {
				rest();
			}
			else if (menuOption == 3) {
				multiply();
			}
			else if (menuOption == 4) {
				division();
			}
			else if (menuOption == 5) {
				numberGreaterThan();
			}
			else if (menuOption == 6) {
				headTail();
			}
			else if (menuOption == 0){
				System.out.println("El programa ha finalizado");
				return;
			}
			else {
				System.out.println("Opción errónea");
			}
		}
	}
	
	public static Number printMenu() {
		// Here the options menu is printed
		
		// variables
		int menuOption = 0;
		
		// class scanner to get data
		Scanner data = new Scanner(System.in);
		
		// print menu
		System.out.println("Introduzca una opción del menú:");
		System.out.println("	1. Sumar");
		System.out.println("	2. Restar");
		System.out.println("	3. Multiplicar");
		System.out.println("	4. Dividir");
		System.out.println("	5. Número mayor de 3 números");
		System.out.println("	6. Capicúa");
		System.out.println("	0. Salir");
		System.out.println("\nIntroduzca una opción:");
		
		// get option and return to main
		menuOption = data.nextInt();
		return menuOption;
	}
	
	public static void sum() {
		/* 
		This function asks the user for two float values 
		​​and returns them added.
		*/
		
		// variables
		float num1;
		float num2;
		float result;
		
		// class scanner to get data
		Scanner data = new Scanner(System.in);
		
		// get numbers
		try {
			System.out.println("Introduzca el primer número flotante a sumar:");
			num1 = data.nextFloat();
			System.out.println("Introduzca el segundo número flotante a sumar:");
			num2 = data.nextFloat();
			
			// add numbers
			result = num1 + num2;
			
			// print result
			System.out.println("\nLa suma de " + num1 + " y " + num2 + " es " + result);
			System.out.println("***********************************\n\n");
		}
		catch (Exception err) {
			System.err.println("\nNo ha introducido numero flotante correctamente");
			System.err.println("***********************************************\n\n");
		}
	}
	
	public static void rest() {
		/* 
		This function asks the user for two float values 
		​​and returns them subtracted.
		*/
		
		// variables
		float num1;
		float num2;
		float result;
		
		// class scanner to get data
		Scanner data = new Scanner(System.in);
		
		// get numbers
		try {
			System.out.println("Introduzca el primer número flotante a restar:");
			num1 = data.nextFloat();
			System.out.println("Introduzca el segundo número flotante a restar:");
			num2 = data.nextFloat();
			
			// subtract numbers
			result = num1 - num2;
			
			// print result
			System.out.println("\nLa resta de " + num1 + " y " + num2 + " es " + result);
			System.out.println("***********************************\n\n");
		}
		catch (Exception err) {
			System.err.println("\nNo ha introducido numero flotante correctamente");
			System.err.println("***********************************************\n\n");
		}
	}
	
	public static void multiply() {
		/* 
		This function asks the user for two float values 
		​​and returns them multiplied.
		*/
		
		// variables
		float num1;
		float num2;
		float result;
		
		// class scanner to get data
		Scanner data = new Scanner(System.in);
		
		// get numbers
		try {
			System.out.println("Introduzca el primer número flotante a multiplicar:");
			num1 = data.nextFloat();
			System.out.println("Introduzca el segundo número flotante a multiplicar:");
			num2 = data.nextFloat();
			
			// multiply numbers
			result = num1 * num2;
			
			// print result
			System.out.println("\nLa multiplicación de " + num1 + " y " + num2 + " es " + result);
			System.out.println("***********************************\n\n");
		}
		catch (Exception err) {
			System.err.println("\nNo ha introducido numero flotante correctamente");
			System.err.println("***********************************************\n\n");
		}
	}
	
	public static void division() {
		/* 
		This function asks the user for two float values 
		​​and returns them divided.
		*/
		
		// variables
		float num1;
		float num2;
		float result;
		
		// class scanner to get data
		Scanner data = new Scanner(System.in);
		
		// get numbers
		try {
			System.out.println("Introduzca el primer número flotante a dividir:");
			num1 = data.nextFloat();
			System.out.println("Introduzca el segundo número flotante a dividir:");
			num2 = data.nextFloat();
			
			// check if second number is not 0
			if (num2 == 0.0f) {
				System.err.println("\nError division por 0");
				System.err.println("***********************************\n\n");
				return;
			}
			// division numbers
			result = num1 / num2;
			
			// print result
			System.out.println("\nLa división de " + num1 + " y " + num2 + " es " + result);
			System.out.println("***********************************\n\n");
		}
		catch (Exception err) {
			System.err.println("\nNo ha introducido numero flotante correctamente");
			System.err.println("***********************************************\n\n");
		}
	}
	
	public static void numberGreaterThan() {
		/*
		this function will ask the user for three numbers 
		and it will check them and return the greater value.
		*/
		
		// variables
		float num1;
		float num2;
		float num3;
		float result;
		
		// class scanner to get data
		Scanner data = new Scanner(System.in);
		
		// get numbers
		try {
			System.out.println("Introduzca el primer número flotante de los 3:");
			num1 = data.nextFloat();
			System.out.println("Introduzca el segundo número flotante de los 3:");
			num2 = data.nextFloat();
			System.out.println("Introduzca el tercer número flotante de los 3:");
			num3 = data.nextFloat();
			
			// compare numbers and get greater
			result = Math.max(num1, num2);
			result = Math.max(result, num3);
			
			// print result
			System.out.println("\nEL número " + result + " es el mayor de los 3 números");
			System.out.println("***********************************\n\n");
		}
		catch (Exception err) {
			System.err.println("\nNo ha introducido numero flotante correctamente");
			System.err.println("***********************************************\n\n");
		}
	}
	
	public static void headTail() {
		/*
		This function checks if a number is 'capicua' 
		*/
		
		// variables
		String number;
		
		// class scanner to get data
		Scanner data = new Scanner(System.in);
		// class stringBuilder to revert a string 
		StringBuilder numberReverse = new StringBuilder();
		
		// get number
		System.out.println("Introduzca un número para saber si es capicúa:");
		number = data.nextLine();
		
		// add in StringBuilder and compare with reverse
		numberReverse.append(number);
		numberReverse.reverse();

		if (number.equals(numberReverse.toString())) {
			System.out.println("\nSI es capicúa");
			System.out.println("*************\n\n");
		}
		else {
			System.out.println("\nNO es capicúa");
			System.out.println("*************\n\n");
		}
	}	
}
