package Set.Product;

import Set.Product.model.Product;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Products {
    private Set<Product> products;

    public Products() {
        this.products = new HashSet<Product>();
    }

    public void addProduct(final String name, final long code, final double price,  final int quantity) {
        products.add(new Product(name, code, price, quantity));
    }

    public Set<Product> showProductsByName() {
        Set<Product> productsByName = new TreeSet<>(products);
        return productsByName;
    }

    public Set<Product> showProductByPrice() {
        Set<Product> productsByPrice = new TreeSet<>(new Product.ComparatorByPrice());
        productsByPrice.addAll(products);
        return productsByPrice;
    }

    public static void main(String[] args) {
        final Products products = new Products();

        System.out.println(products.products);

        products.addProduct("Product 4", 656L, 14d, 3);
        products.addProduct("Product 5", 6L, 114d, 2);
        products.addProduct("Product 1", 63L, 11413d, 22);
        products.addProduct("Product 5", 6112L, 4d, 21);

        System.out.println(products.products);

        System.out.println("Products by price: " + products.showProductByPrice());

        System.out.println("Products by name: " + products.showProductsByName());

    }
}
