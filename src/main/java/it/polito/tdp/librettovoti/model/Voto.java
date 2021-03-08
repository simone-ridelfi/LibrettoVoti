package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

// POJO - Plain Old Java Object
// Java Bean (semplice contenitore di dati, nessuna "logica")

public class Voto {
	
	private String nomeCorso;
	private int voto; //30L ??
	private LocalDate data;  //String data; 
	
	/**
	 * 
	 * @param nomeCorso Nome del corso superato
	 * @param voto Voto ottenuto
	 * @param data Data superamento esame
	 */
	public Voto(String nomeCorso, int voto, LocalDate data) {
		
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.data = data;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public int getVoto() {
		return voto;
	}

	public LocalDate getData() {
		return data;
	}
	
	public String toString() {
		return nomeCorso +" " + voto +" "+ data;
	}
	
	
	
	

}
