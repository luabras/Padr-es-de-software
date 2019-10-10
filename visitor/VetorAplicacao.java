package luana.visitor;

import java.util.Random;

public class VetorAplicacao implements ElementoVisitado {

	private Integer[] mVetor; 
	
	public Integer[] getmVetor() {
		return mVetor;
	}

	public void setmVetor(Integer[] mVetor) {
		this.mVetor = mVetor;
	}

	public VetorAplicacao() {
		mVetor = new Integer[100];
		for (int i = 0; i < 100; i++) {
			Random gerador = new Random();
			mVetor[i] = gerador.nextInt(100);
		}
	}
	
	public VetorAplicacao(VetorAplicacao va) {
		mVetor = new Integer[100];
		for (int i = 0; i < 100; i++) {
			mVetor[i] = va.getmVetor()[i];
		}
	}
	
	@Override
	public void aceitarVisitante(SortVisitor sortVisitor) {
		sortVisitor.ordenar(mVetor);;
		
	}
	
	public void imprimirVetor() {
		for (int i = 0; i < 100; i++) {
			System.out.print(mVetor[i]+" ");
		}
		System.out.println();
	}

}
