/*
 * Определить матрицу и ее заполнить случайными значениями. Построить вектор B, который возвращает
 * значение элемента матрицы, не равное заданному значению.
 */
public class Ex3 {
	public static int rows = 4;		//количество строк в матрице
	public static int columns = 4;	//количество столбцов в матрице
	public static int min = 1;		//минимальное значение элементов матрицы
	public static int max = 9;		//максимальное значение элементов матрицы
	public static int a = 5;		//заданное значение
	
	 public static void main(String[] args) {
		 int[][] mat = Ex3.createMatrix(Ex3.rows, Ex3.columns, Ex3.min, Ex3.max);
		 int[] B = Ex3.createVector(mat, Ex3.a);
		 Ex3.printVector(B);
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
	 
	 public static int[] createVector(int[][] matrix, int a) {
		 int length_vector = 0;
		 for (int i = 0; i < Ex3.rows; i++) {
			 for (int j = 0; j < Ex3.columns; j++) {
				 if (matrix[i][j] != a)
					 length_vector++;
			 }
		 }
		 
		 int[] vector = new int[length_vector];
		 
		 int k = 0;
		 for (int i = 0; i < Ex3.rows; i++) {
			 for (int j = 0; j < Ex3.columns; j++) {
				 if (matrix[i][j] != a) {
					 vector[k] = matrix[i][j];
					 k++;
				 }
			 }
		 }
		 
		 return vector;
	 }
	 
	 public static void printVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
	}
}
