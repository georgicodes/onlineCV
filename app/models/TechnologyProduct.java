package models;

import java.util.*;

public class TechnologyProduct {

    private static Set<TechnologyProduct> products;

    public String id;
    public String name;

    public TechnologyProduct(String id, String name) {
        this.id = id;
        this.name = name;
    }

    static {
        products = new HashSet<TechnologyProduct>();
        products.add(new TechnologyProduct("scala", "Scala"));
        products.add(new TechnologyProduct("play", "Play Framework"));
        products.add(new TechnologyProduct("heroku", "Heroku"));
        products.add(new TechnologyProduct("jquery", "JQuery & HTML5"));
        products.add(new TechnologyProduct("java", "Java"));
    }

    public static Set<TechnologyProduct> findAll() {
        return new HashSet<TechnologyProduct>(products);
    }

    public static TechnologyProduct findById(String id) {
        for (TechnologyProduct product : products) {
            if (product.id.equals(id)) {
                return product;
            }
        }
        return null;
    }
}
