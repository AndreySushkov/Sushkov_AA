/*
 * Реализовать предметную область: Продажа товаров супермаркета. Создать родительский класс "Супермаркет" (название
 * отдела, название товара, страна-производитель, розничная цена, поставщик) и дочерние классы:
 * -"Игрушки" (возрастная группв, тип)
 * -"Фрукты" (максимальное время хранения, температура хранения)
 * -"Габаритный товар" (высота, ширина, длина)
 * Реализовать класс для хранения списка товаров с методом добавления нового товара и методом печати списка товара.
 * */

package supermarket;

public class Fruits extends Supermarket{
    private int storageTime;
    private int temperature;

    public Fruits(String nameOfDept, String nameOfProduct, String country, int retailPrice, String supplier, int storageTime, int temprature) {
        super(nameOfDept, nameOfProduct, country, retailPrice, supplier);
        this.storageTime = storageTime;
        this.temperature = temprature;
    }

    public void setStorageTime(int storageTime) {
        this.storageTime = storageTime;
    }

    public int getStorageTime() {
        return storageTime;
    }

    public void setTemprature(int temprature) {
        this.temperature = temprature;
    }

    public int getTemprature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Fruits{" +

                "название отдела='" + nameOfDept + '\'' +
                ", название продукта='" + nameOfProduct + '\'' +
                ", страна-производитель='" + country + '\'' +
                ", розничная цена=" + retailPrice +
                ", поставщик='" + supplier + '\'' +
                ", максимальное время хранения=" + storageTime +
                ", температура хранения=" + temperature +
                '}';
    }
}
