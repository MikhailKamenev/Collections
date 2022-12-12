package Products;

public class ProductAlreadyExists extends Exception {
    public ProductAlreadyExists() {
    }

    public ProductAlreadyExists(String message) {
        super(message);
    }
}
