/*
 * Реализовать предметную область: Продажа товаров супермаркета. Создать родительский класс "Супермаркет" (название
 * отдела, название товара, страна-производитель, розничная цена, поставщик) и дочерние классы:
 * -"Игрушки" (возрастная группв, тип)
 * -"Фрукты" (максимальное время хранения, температура хранения)
 * -"Габаритный товар" (высота, ширина, длина)
 * Реализовать класс для хранения списка товаров с методом добавления нового товара и методом печати списка товара.
 * */

package supermarket;

public class Toys extends Supermarket {
    private int years;
    private String type;

    public Toys(String nameOfDept, String nameOfProduct, String country, int retailPrice, String supplier, int years, String type) {
        super(nameOfDept, nameOfProduct, country, retailPrice, supplier);
        this.years = years;
        this.type = type;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "название отдела='" + nameOfDept + '\'' +
                ", название продукта='" + nameOfProduct + '\'' +
                ", страна-производитель='" + country + '\'' +
                ", розничная цена=" + retailPrice +
                ", поставщик='" + supplier + '\'' +
                ", возрастная группа=" + years +
                ", тип='" + type + '\'' +
                '}';
    }
}
