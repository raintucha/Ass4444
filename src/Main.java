
public class Main {
    public static void main(String[] args) {
        Product productA = ProductFactory.createProduct(ProductType.PRODUCT_A);
        productA.performAction();

        Product productB = ProductFactory.createProduct(ProductType.PRODUCT_B);
        productB.performAction();
    }
}
