package luana.memento;

import java.util.ArrayList;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculadora {

	private CalculadoraCareTaker caretaker;
	private String expressao;


	public Calculadora() {
		caretaker = new CalculadoraCareTaker();
		expressao = "";
	}

	public void inserirNaExpressao() {
		caretaker.adicionarMemento(new CalculadoraMemento(expressao));
		Scanner scanner = new Scanner(System.in);
		System.out.print(mostrarExpressao() + " ");
		expressao += scanner.nextLine();
	}

	public void desfazerInsercao() {
		String ultimoCalculadoraSalva = caretaker.getUltimoEstadoSalvo().getCalculadoraSalva();
		expressao = ultimoCalculadoraSalva;

	}

	public String mostrarExpressao() {
		return expressao;
	}

	public Object calcularExpressao() {
		Object resultado = new Object();

		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");

		String expressao = mostrarExpressao();
		try {
			resultado = engine.eval(expressao);
		} catch (ScriptException e) {
			System.out.println("Expressao invalida!");
			e.printStackTrace();
		}
		return resultado;
	}

}
