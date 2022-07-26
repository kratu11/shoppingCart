package shoppingcart.app;

public class Customer {

    private String customerName;
    private ShoppingCart shoppingCart;


    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Customer(String name){
        this.customerName = name;
        this.shoppingCart = new ShoppingCart();
    }

    private ShoppingCart cart;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }


}
