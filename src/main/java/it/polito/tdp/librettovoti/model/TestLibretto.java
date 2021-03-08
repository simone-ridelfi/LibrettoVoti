package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		
		System.out.println("Nuovo Libretto");
		
		Libretto libretto = new Libretto();
		
		Voto v1 = new Voto("Analisi I", 24, LocalDate.of(2019, 01, 25));
		
		libretto.add(v1);
		libretto.add(new Voto("Informatica", 27, LocalDate.of(2019, 01, 28)));
		libretto.add(new Voto("Algebra lineare e Geometria", 30, LocalDate.of(2019, 07, 02)));
		
		System.out.println(libretto.elencoVoti());
		
	}

}
