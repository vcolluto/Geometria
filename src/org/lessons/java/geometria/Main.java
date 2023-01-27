package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rettangolo r;
		int base, altezza;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Inserisci la base del rettangolo: ");
		base=Integer.parseInt(s.nextLine());
		
		System.out.print("Inserisci l'altezza del rettangolo: ");
		altezza=Integer.parseInt(s.nextLine());
		
		r=new Rettangolo(base,altezza);  	//costruttore parametrico 
		r.disegna();  //asterisco
		
		System.out.println("L'area è: "+r.calcolaArea());
		System.out.println("Il perimetro è: "+r.calcolaPerimetro());
		
		
		Rettangolo r1=new Rettangolo();		//costruttore non parametrico => base 20 e altezza 10 (valori predefiniti)
		Rettangolo r2=new Rettangolo(30,40);//costruttore  parametrico
		Rettangolo r3=new Rettangolo("lungo");
		Rettangolo r4=new Rettangolo("largo");
		System.out.println("RETTANGOLO LUNGO: ");
		r3.disegna('o');
		System.out.println("RETTANGOLO LARGO: ");
		r4.disegna('+');
		s.close();
		

	}

}
