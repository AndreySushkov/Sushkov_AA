/*
 * �������� ���������, ����������� ������������� ������ ���������� ���������� � ��������� �� 100 �� 200.
 * ������ ������� 30 ���������. ������� ������������ ����� �� �����. ��������� ���������� ������� ��
 * �����������. ������� ��������� ���������� �� �����.
 */
public class ControlStructures {
	public static int SIZE = 30;
	public static int MIN = 100;
	public static int MAX = 200;
	
	public static void main(String[] args) {
		int[] values = ControlStructures.fillRandomIntVector(ControlStructures.SIZE, ControlStructures.MIN, ControlStructures.MAX);
		ControlStructures.printVector(values, "Initial vector:");
		
		int[] result = ControlStructures.sortVector(values);
		ControlStructures.printVector(result, "Sorted Vector:");
	}
	
	public static int[] fillRandomIntVector(int size, int min, int max) {
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = min + (int)Math.round(Math.random() * (max - min));
		}
		
		return result;
	}
	
	public static int[] sortVector(int[] vector) {
		boolean flag;
		int tmp;
		do {
			flag = false;
			for (int i = 0; i < vector.length - 1; i++) {
				if (vector[i] > vector[i+1]) {
					tmp = vector[i];
					vector[i] = vector[i+1];
					vector[i+1] = tmp;
					flag = true;
				}
			}
		} while(flag);
		
		return vector;
	}
	
	public static void printVector(int[] vector, String message) {
		System.out.println(message);
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + "\t");
		}
		System.out.println();
	}
}
