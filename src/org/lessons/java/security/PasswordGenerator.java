package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		/* String name = "Jennifer";
		String surname = "Lawrence";
		String favorite_color = "blue";
		
		int day_of_birth = 19;
		int month_of_birth = 2;
		int year_of_birth = 1997;
		
		String password = name + "-" + surname + "-" + favorite_color + "-" + (day_of_birth + month_of_birth + year_of_birth);
		
		System.out.println("Hi " + name + "! Your auto generated password is " + password);
		*/
		
		
		System.out.println("Ciao! Come ti chiami?");
		
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		System.out.println("Ciao " + name + "! Qual è il tuo cognome?");
		
		scan = new Scanner(System.in);
		String surname = scan.nextLine();
		
		System.out.println("E il tuo colore preferito?");
		
		scan = new Scanner(System.in);
		String favorite_color = scan.nextLine();
		
		System.out.println("Inserisci di seguito il tuo giorno di nascita");
		
		scan = new Scanner(System.in);
		int day_of_birth  = scan.nextInt();
		
		System.out.println("Inserisci di seguito il tuo mese di nascita");
		scan = new Scanner(System.in);
		int month_of_birth  = scan.nextInt();
		
		System.out.println("Inserisci di seguito il tuo anno di nascita");
		scan = new Scanner(System.in);
		int year_of_birth  = scan.nextInt();
		
		System.out.println("Benvenuta " + name + "! La tua password auto generata è: " + name + "-" + surname + "-" + favorite_color + "-" + (day_of_birth + month_of_birth + year_of_birth));
	};

}
