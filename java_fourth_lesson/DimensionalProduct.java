package supermarket;

public class DimensionalProduct extends Supermarket{
    private int height;
    private int width;
    private int length;

    public DimensionalProduct(String nameOfDept, String nameOfProduct, String country, int retailPrice, String supplier, int height, int width, int length) {
        super(nameOfDept, nameOfProduct, country, retailPrice, supplier);
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public String toString() {
        return "DimensionalProduct{" +

                "название отдела='" + nameOfDept + '\'' +
                ", название продукта='" + nameOfProduct + '\'' +
                ", страна-производитель='" + country + '\'' +
                ", розничная цена=" + retailPrice +
                ", поставщик='" + supplier + '\'' +
                ", высота=" + height +
                ", ширина=" + width +
                ", длина=" + length +
                '}';
    }
}
