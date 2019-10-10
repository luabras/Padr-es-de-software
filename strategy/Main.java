package br.padroes.strategy;

public class Main {
	public static void main(String[] args) {
		
		Cliente eventViewerClient = new Cliente(Cliente.EVENTVIEWER);
		Cliente fileClient = new Cliente(Cliente.FILE);
		Cliente databaseClient = new Cliente(Cliente.DATABASE);
		
		eventViewerClient.logComEstrategia();
		fileClient.logComEstrategia();
		databaseClient.logComEstrategia();
		
/*		Cliente umFuncionario = new Cliente(Cliente.DESENVOLVEDOR,
				2100);
		System.out.println(umFuncionario.calcularSalarioComImposto());
		
		Cliente outroFuncionario = new Cliente(Cliente.DESENVOLVEDOR,
				1700);
		System.out.println(outroFuncionario.calcularSalarioComImposto());*/
		
		
	}
}
