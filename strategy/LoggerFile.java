package br.padroes.strategy;

public class LoggerFile implements Logger {

	@Override
	public void definirLog(Cliente cliente) {
		System.out.println("Registrando eventos em um arquivo");
	}
	
	
/*	@Override
	public double calculaSalarioComImposto(Cliente umFuncionario) {
		if (umFuncionario.getSalarioBase() > 3500) {
			return umFuncionario.getSalarioBase() * 0.8;
		}
		return umFuncionario.getSalarioBase() * 0.85;
	}*/
}
