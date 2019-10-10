package br.padroes.strategy;

public class LoggerDatabase implements Logger{

	@Override
	public void definirLog(Cliente cliente) {
		System.out.println("Registrando eventos em um banco de dados");
	}

}
