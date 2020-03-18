package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Parole {

	private String aliena;
	private String tradotta;

	List<String> listaTraduzioni = new LinkedList<>();

	public Parole(String aliena, String tradotta) {
		super();
		this.aliena = aliena;
		this.tradotta = tradotta;
	}

	//public void aggiungiParola(String p) {
	//	listaTraduzioni.add(p);
	//}

	public boolean presente(String parolaAliena) {

	/*	for (String s : listaTraduzioni) {
			if (s.contains(parolaAliena.toLowerCase())) {
				s.replace(s, parolaAliena.toLowerCase() + " " + tradotta.toLowerCase());
				return true;
			} else {
				aggiungiParola(parolaAliena.toLowerCase() + " " + tradotta.toLowerCase());
				return false;
			}
		}
		return false; */ 
		
		for (String s : listaTraduzioni) {
			if(s.split(" ")[0].equals(parolaAliena))
				return true; 
		}
		return false; 
		
		
	}

//	public void reset() {
//		listaTraduzioni.clear();
//	}

	public String getAliena() {
		return aliena;
	}

	public void setAliena(String aliena) {
		this.aliena = aliena;
	}

	public String getTradotta() {
		return tradotta;
	}

	public void setTradotta(String tradotta) {
		this.tradotta = tradotta;
	}

	
}
