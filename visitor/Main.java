package luana.visitor;

public class Main {

	public static void main(String[] args) {
		
		// Criando vetores de 100 espacos
		VetorAplicacao v1 = new VetorAplicacao();
		VetorAplicacao v2 = new VetorAplicacao(v1);
		VetorAplicacao v3 = new VetorAplicacao(v1);
		
		// TODO tempos
		
		
		System.out.println("Vetor inicial desordenado:");
		v1.imprimirVetor();
		System.out.println();	
		
		long tempoInicial1 = System.currentTimeMillis();
		v1.aceitarVisitante(new BubbleSortVisitor());
		long tempoFinal1 = System.currentTimeMillis() - tempoInicial1; 

		v1.imprimirVetor();
		System.out.println("Tempo da primeira ordenacao: " + tempoFinal1 + "ms");
		
		long tempoInicial2 = System.currentTimeMillis();
		v2.aceitarVisitante(new QuickSortVisitor());
		long tempoFinal2 = System.currentTimeMillis() - tempoInicial2;
		
		v2.imprimirVetor();
		System.out.println("Tempo da segunda ordenacao: " + tempoFinal2 + "ms");

		long tempoInicial3 = System.currentTimeMillis();
		v3.aceitarVisitante(new MergeSortVisitor());
		long tempoFinal3 = System.currentTimeMillis() - tempoInicial3;
		
		v3.imprimirVetor();
		System.out.println("Tempo da terceira ordenacao: " + tempoFinal3 + "ms");

	}

}
