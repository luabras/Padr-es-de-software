package luana.memento;

public class CalculadoraMemento {
	
	protected String expressao;
	
	public CalculadoraMemento(String expressao) {
		this.expressao = expressao;
	}
	
	public String getCalculadoraSalva() {
		return this.expressao;
	}
}
