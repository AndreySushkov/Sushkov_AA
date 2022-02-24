/*
 * –еализовать программу, получающую на вход в качестве аргумента 
 * им€ человека и вывод€щую УHello Ф + им€, в противном случае, 
 * если параметр не передавалс€, УHello worldФ.
 */
public class Ex_1 {
	public static void main(String args[]) {
		if (args.length > 0)
			System.out.println("Hello " + args[0]);
		else
			System.out.println("Hello world");
	}
}
