package org.lessons.java.geometria;

public class Rettangolo {
	int base;
	int altezza;
	
	public Rettangolo() {
		super();
		this.base = 20;
		this.altezza = 10;
	}
	
	public Rettangolo(int base, int altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	
	public Rettangolo(String tipo) {
		if (tipo.equals("lungo")) {
			base=10;
			altezza=50;
		} else if (tipo.equals("largo"))
		{
			base=50;
			altezza=10;
		} else {		//rettangolo predefinito
			base=20;
			altezza=10;
		}
	}
	
	int calcolaArea() {
		return base*altezza;
	}
	
	int calcolaPerimetro() {
		return 2*(base+altezza);
	}
	
	void disegna(char simbolo) {
		//lato superiore
		for (int i=1;i<=base;i++)
			System.out.print(simbolo);
		System.out.println();
		
		//lati sinistro e destro
		for (int i=1;i<=altezza-2;i++) {
			System.out.print(simbolo);
			for (int j=1;j<=base-2;j++)
				System.out.print(" ");
			System.out.print(simbolo);
			System.out.println();
		}
		
		//lato inferiore
		for (int i=1;i<=base;i++)
			System.out.print(simbolo);
		System.out.println();
	}
	
	void disegna() {
		disegna('*');
	}
	
	
}
