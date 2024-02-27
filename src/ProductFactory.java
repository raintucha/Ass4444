public class ProductFactory {
    public static Product createProduct(ProductType type) {
        switch (type) {
            case PRODUCT_A:
                return new ProductA();
            case PRODUCT_B:
                return new ProductB();
            default:
                throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}
