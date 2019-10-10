package luana.memento;

import java.util.ArrayList;

public class CalculadoraCareTaker {

	protected ArrayList<CalculadoraMemento> estados;

	public CalculadoraCareTaker() {
		estados = new ArrayList<CalculadoraMemento>();
	}

	public void adicionarMemento(CalculadoraMemento memento) {
		estados.add(memento);
	}

	public CalculadoraMemento getUltimoEstadoSalvo() {
		if (estados.size() <= 0) {
			return new CalculadoraMemento("");
		}
		CalculadoraMemento estadoSalvo = estados.get(estados.size() - 1);
		estados.remove(estados.size() - 1);
		return estadoSalvo;
	}


}
