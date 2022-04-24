public class Supermarket {
    private String nameotdela;
    private int productCode;
    private String name;
    private String country;
    private int retailPrice;
    private String namesource;

    public Supermarket(String nameotdela, int productCode, String name, String country, int retailPrice, String namesource) {
        this.nameotdela = nameotdela;
        this.productCode = productCode;
        this.name = name;
        this.country = country;
        this.retailPrice = retailPrice;
        this.namesource = namesource;
    }

    public String getNameotdela() {
        return nameotdela;
    }
    public void setNameotdela(String nameotdela) {
        this.nameotdela = nameotdela;
    }

    public int getProductCode() {
        return productCode;
    }
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public int getRetailPrice() {
        return retailPrice;
    }
    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getNamesource() {
        return namesource;
    }
    public void setNamesource(String namesource) {
        this.namesource = namesource;
    }

    public String toString() {
        return "Product is " + name + " from " + country;
    }
}
