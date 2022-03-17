/*
 * ќпределить одномерный массив и заполнить его случайными значени€ми. ќпределить допонительный массив,
 * состо€щий из неповтор€ющихс€ элементов исходного массива и вывести его на экран.
 */
public class Ex1 {
	public static int size = 10;	//размер вектора
	public static int min = 1;		//минимальное значение элементов вектора
	public static int max = 10;		//максимальное значение элементов вектора
	
	public static void main(String[] args) {
		int[] vector_1 = createVector(Ex1.size, Ex1.min, Ex1.max);
		Ex1.printVector(vector_1, "Vector:");
		
		int[] vector_2 = Ex1.nonRepeatingVector(vector_1);
		Ex1.printVector(vector_2, "New vector:");
		
	}
	
	public static int[] createVector(int size, int min, int max) {
		int[] vector = new int[size];
		for (int i = 0; i < size; i++) {
			vector[i] = min + (int)Math.round(Math.random() * (max - min));
		}
		
		return vector;
	}
	
	public static int[] nonRepeatingVector(int[] vector) {
		int[] new_vector = new int[vector.length];
		int k = 0;
		for (int i = 0; i < vector.length; i++) {
			boolean flag = false;
			for (int j = i; j < vector.length; j++) {
				if (vector[i] == vector[j] && i != j)
					flag = true;
			}
			if (!flag) {
				new_vector[k] = vector[i];
				k++;
			}
		}
		
		return new_vector;
	}
	
	public static void printVector(int[] vector, String message) {
		System.out.println(message);
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != 0)
				System.out.print(vector[i] + "\t");
		}
		System.out.println();
	}
}
