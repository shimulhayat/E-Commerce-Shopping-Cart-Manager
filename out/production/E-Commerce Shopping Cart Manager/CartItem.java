public class CartItem {

    private String name;
    private int unitPrice;
    private int quantity;

    public CartItem(String name, int unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void incrementQuantity() {
        quantity = quantity + 1;
    }

    public void decrementQuantity() {
        if (quantity > 0) {
            quantity = quantity - 1;
        }
    }

    public int getLineTotal() {
        return unitPrice * quantity;
    }
}
