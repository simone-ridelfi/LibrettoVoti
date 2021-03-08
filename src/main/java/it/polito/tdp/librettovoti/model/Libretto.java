package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		voti = new LinkedList<Voto>();
	}
	
	public void add(Voto v) {
		//aggiungere i controlli 
		voti.add(v);
		
	}
	
	public String elencoVoti() {
		String s = "";
		for(Voto v : voti)
			s += v.toString() +"\n";
		
		return s;
	}
}
