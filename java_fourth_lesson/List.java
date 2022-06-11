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
