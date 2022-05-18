public class Pr3 {
    public static void main(String[] attr) {
        Literature Dune = new Literature(123, "science fictian", "Dune", 1965, "NoName publish house",
                554, "Frank Herbert");

        System.out.println(Dune.toString());
        Dune.setType("science fiction");
        System.out.println(Dune.getType());
    }
}
