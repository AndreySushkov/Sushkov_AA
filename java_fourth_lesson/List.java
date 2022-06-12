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

public class List {
    private ArrayList<Supermarket> list;

    public List(ArrayList<Supermarket> list) {
        this.list = list;
    }

    public void addProduct(Supermarket product) {
        list.add(product);
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
