/*
* Реализовать предметную область: Продажа товаров супермаркета. Создать родительский класс "Супермаркет" (название
* отдела, название товара, страна-производитель, розничная цена, поставщик) и дочерние классы:
* -"Игрушки" (возрастная группв, тип)
* -"Фрукты" (максимальное время хранения, температура хранения)
* -"Габаритный товар" (высота, ширина, длина)
* Реализовать класс для хранения списка товаров с методом добавления нового товара и методом печати списка товара.
* */

package supermarket;

import java.util.ArrayList;

public class Pr4 {
    public static void main(String[] args) {
        ArrayList<Supermarket> listn = new ArrayList<>();
        List list = new List(listn);

        Toys ball = new Toys("ToysDept", "ball", "Japan", 100, "Balls Inc.", 3, "balls");
        list.addProduct(ball);

        Fruits apple = new Fruits("FruitsDept", "apple", "German", 20, "Apple Inc.", 15, 20);
        list.addProduct(apple);

        DimensionalProduct wardrobe = new DimensionalProduct("FurnitureDept", "wardrobe", "Poland", 999, "SweetHome", 210, 25, 50);
        list.addProduct(wardrobe);

        System.out.println(ball.getRetailPrice());
        System.out.println(apple.getCountry());
        System.out.println(wardrobe.getHeight());
        System.out.println(wardrobe.toString());

        list.print();
    }
}
