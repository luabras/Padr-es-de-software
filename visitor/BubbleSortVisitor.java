package luana.visitor;

public class BubbleSortVisitor implements SortVisitor {

	@Override
	public void ordenar(Integer[] mVetor) {
        Integer n = mVetor.length;
        Integer k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (mVetor[i] > mVetor[k]) {
                    swapNumbers(i, k, mVetor);
                }
            }
        }		
	}
	
    private static void swapNumbers(Integer i, Integer j, Integer[] array) {
  
        Integer temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  
}
