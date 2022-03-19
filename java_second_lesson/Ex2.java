/*
 * Дан массив b (n). Переписать в массив c(n) все отрицательные элементы b(n) (с сжатием, без пустых
 * элементов внутри). Затем упорядочить методом "выбора и перестановки" по возрастанию новый массив.
 */
public class Ex2 {
	public static void main(String[] args) {
		int[] b = new int[] {3, 7, 3, -6, 0, -9, 8, -8, -1, 2};
		int[] c = Ex2.createNegativeVector(b);
		Ex2.sortVector(c);
		Ex2.printVector(c);
	}
	
	public static int[] createNegativeVector(int[] vector) {
		int new_size = 0;
		for (int i: vector) {
			if (i < 0)
				new_size++;
		}
		
		int[] new_vector = new int[new_size];
		int k = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < 0) {
				new_vector[k] = vector[i];
				k++;
			}
		}
		return new_vector;
	}
	
	public static void sortVector(int[] vector) {
		int tmp;
		for (int i = 0; i < vector.length; i++) {
			for (int j = i; j < vector.length; j++) {
				if (vector[i] > vector[j]) {
					tmp = vector[i];
					vector[i] = vector[j];
					vector[j] = tmp;
				}
			}
		}
	}
	
	public static void printVector(int[] vector) {
		for (int i: vector) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
