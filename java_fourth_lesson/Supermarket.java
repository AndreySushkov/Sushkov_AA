/*
 * Реализовать предметную область: Продажа товаров супермаркета. Создать родительский класс "Супермаркет" (название
 * отдела, название товара, страна-производитель, розничная цена, поставщик) и дочерние классы:
 * -"Игрушки" (возрастная группв, тип)
 * -"Фрукты" (максимальное время хранения, температура хранения)
 * -"Габаритный товар" (высота, ширина, длина)
 * Реализовать класс для хранения списка товаров с методом добавления нового товара и методом печати списка товара.
 * */

package supermarket;

public class Supermarket {
    String nameOfDept;
    String nameOfProduct;
    String country;
    int retailPrice;
    String supplier;

    public Supermarket(String nameOfDept, String nameOfProduct, String country, int retailPrice, String supplier) {
        this.nameOfDept = nameOfDept;
        this.nameOfProduct = nameOfProduct;
        this.country = country;
        this.retailPrice = retailPrice;
        this.supplier = supplier;
    }

    public void setNameOfDept(String nameOfDept) {
        this.nameOfDept = nameOfDept;
    }

    public String getNameOfDept() {
        return nameOfDept;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSupplier() {
        return supplier;
    }
}
