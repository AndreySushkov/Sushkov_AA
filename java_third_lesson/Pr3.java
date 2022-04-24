public class Pr3 {
    public static void main(String[] attr) {
        Supermarket milk = new Supermarket("Qwerty", 12345, "milk", "Russia", 100, "Azerty");
        System.out.println(milk.toString());
        milk.setName("chocolate");
        System.out.println(milk.getName());
    }
}
