package luana.memento;

import java.util.Scanner;

public class Cliente {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		while (true) {
			System.out.println("1. Inserir");
			System.out.println("2. Desfazer");
			System.out.println("3. Mostrar");
			System.out.println("4. Calcular");
			Scanner scanner = new Scanner (System.in);
			int opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				calc.inserirNaExpressao();
				break;
			case 2:
				calc.desfazerInsercao();
				break;
			case 3:
				System.out.println(calc.mostrarExpressao());
				break;
			case 4:
				System.out.println("Resultado = " + calc.calcularExpressao());
				break;
			default:
				System.out.println("Opcao invalida.");
				break;
			}
		}
		

	}

}
