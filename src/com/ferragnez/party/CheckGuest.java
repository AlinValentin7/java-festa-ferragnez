package com.ferragnez.party;

import java.util.Scanner;
/*

Nel programma bisogna:
creare e inizializzare l’array contenente i nomi degli invitati (Fatto)
chiedere all’utente come si chiama (fatto)
verificare che il nome sia presente nella lista lasciarlo entrare
 o rispedirlo cortesemente da dove è venuto
*/
public class CheckGuest {
	public static void main(String[] args) {
		String [] guest = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", 
				 "Francesco Totti", "Ilary Blasi", "Bebe Vio", 
				 "Luis","Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		Scanner scan = new Scanner(System.in);
		System.out.println("Come ti chiami?");
		String name = scan.nextLine();
		boolean presente = false;
		/*for(int i = 0; i < guest.length; i++) {
			if(guest[i].equalsIgnoreCase(name)) {
				presente = true;
				break;
			}
		}
		if(presente) {
			System.out.println("Sei il/la Beveneuto/a " + name + " prenditi qulacosa da bere");
		}else {
			System.out.println ("Non sei il/la Benvenuto/a " + name + " torna tra i poveri");
		}	*/
		int i = 0;
		while(i < guest.length) {
			if(guest[i].equalsIgnoreCase(name)) {
				presente = true;
				System.out.println("Sei il/la Benvenuto/a " + name + " prenditi qulacosa da bere");
				break;
			}
			i++;
			}
		if(!presente) {
			System.out.println ("Non sei il/la Benvenuto/a " + name + " torna tra i poveri");
		}
		
			
			
											}
		}
	
