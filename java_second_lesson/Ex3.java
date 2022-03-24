/*
 * Определить матрицу и ее заполнить случайными значениями. Построить вектор B, который возвращает
 * количество четных чисел в i-й строке.
 */
public class Ex3 {
	public static int rows = 4;		//количество строк в матрице
	public static int columns = 4;	//количество столбцов в матрице
	public static int min = 1;		//минимальное значение элементов матрицы
	public static int max = 9;		//максимальное значение элементов матрицы
	public static int i = 3;		//заданное значение i (не должно быть больше rows)
	
	 public static void main(String[] args) {
		 i--;	//перевод номера в индекс
		 int[][] mat = Ex3.createMatrix(Ex3.rows, Ex3.columns, Ex3.min, Ex3.max);
		 int[] B = Ex3.createVector(mat, Ex3.i);
		 Ex3.printVector(B);
		 System.out.println("Количество четных числе в i-й строке: " + B.length);
	 }
	 
	 public static int[][] createMatrix(int rows, int columns, int min, int max) {
		 int[][] matrix = new int[rows][columns];
		 
		 for (int i = 0; i < rows; i++) {
			 for (int j = 0; j < columns; j++) {
				 matrix[i][j] = min + (int)Math.round(Math.random() * (max - min));
			 }
		 }
		 
		 return matrix;
	 }
	 
	 public static int[] createVector(int[][] matrix, int i) {
		 int length_vector = 0;
		 for (int c = 0; c < Ex3.columns; c++) {
			 if (matrix[i][c] % 2 == 0)
				 length_vector++;
		 }
		 
		 int[] vector = new int[length_vector];
		 
		 int k = 0;
		 for (int c = 0; c < Ex3.columns; c++) {
			 if (matrix[i][c] % 2 == 0) {
				 vector[k] = matrix[i][c];
				 k++;
			 }
		 }
		 
		 return vector;
	 }
	 
	public static void printVector(int[] vector) {
		for (int с: vector) {
			System.out.print(с + " ");
		}
		System.out.println();
	}
}
