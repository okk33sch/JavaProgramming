package enginDemirog;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Blue");
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("Asus Laptop");
//        product.setPrice(5000);
//        product.setStockAmount(3);
//        product color = "";
//        product code = "";

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getCode());



    }
}
