/*
 * Передавать в качестве параметров два целочисленных числа. Вывести на экран, 
 * как сами значения, так и их сумму. Если количество параметров не равно 2, 
 * вывести сообщение “Неверное количество параметров”.
 */
public class Ex_3 {
	public static void main(String args[]) {
		if (args.length ==  2) {
			int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			System.out.println(args[0] + " + " + args[1] + " = " + sum);
		}
		else
			System.out.println("Неверное количество параметров");
	}
}
