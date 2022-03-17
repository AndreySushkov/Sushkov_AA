/*
 * Дана квадартная матрица A (n). Найти среденее арифметическое положительных элементов параллели
 * главной диагонали, расположенных выще над диагональю.
 */
public class Ex4 {
	public static void main(String[] args) {
		int[][] mat = new int[][] {{1, -2, 3, -4, 5},
								   {-6, 7, -8, -9, 10},
								   {6, -3, -1, 7, 8},
								   {1, 5, 7, -8, 5},
								   {5, -3, -8, 3, -2}};
		
		float average = Ex4.setAverage(mat);
		System.out.println(average);
	}
	
	public static float setAverage(int[][] matrix) {
		float  sum = 0, k = 0;
		for (int i = 0; i < matrix.length; i++) {
			int j = i + 1;
			if (j < matrix.length && matrix[i][j] > 0) {
				sum += matrix[i][j];
				k++;
			}
		}
		
		return sum/k;
	}
}
