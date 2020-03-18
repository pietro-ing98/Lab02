package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {

	List<Parole> listaTraduzioni = new LinkedList<>();

	public void aggiungiParola(String aliena, String tradotta) {

		for (Parole p : listaTraduzioni) {
			if (p.equals(aliena)) {
				p.setTradotta(tradotta);
				return;
			}
		}
		Parole p = new Parole(aliena, tradotta);
		listaTraduzioni.add(p);
	}

	public String getTraduzione(String parolaAliena) {

		for (Parole s : listaTraduzioni)
			if (s.equals(parolaAliena)) {
				return s.getTradotta();
			}
		return null;

	}
}
