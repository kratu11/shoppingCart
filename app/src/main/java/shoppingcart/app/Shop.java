package shoppingcart.app;

import java.util.ArrayList;

public class Shop {

    private String shopName;

    public void shopTransaction(Customer customer, boolean eWallet){
        double amount = 0;
        int  milkQuantity = 0;
        ShoppingCart cart = new ShoppingCart();
        ArrayList<Items> items = new ArrayList<>();
        cart = customer.getCart();
        items = cart .getItems();

        for(Items item: items){
            amount += item.getItemPrice() * item.getQuantity();
            if(item.getItemName().compareTo("milk") == 0){
                milkQuantity = item.getQuantity();
                milkQuantity += milkQuantity/2;
                item.setQuantity(milkQuantity);
            }
        }

        if( eWallet == true && amount >= 100){
            amount = 0.95*amount;
        }

        System.out.println("Total amount payable: "+amount);
        printItemList(items);

    }


    public void printItemList(ArrayList<Items> items){
        for(Items item:items){
            System.out.println(item.getItemName()+" : "+item.getItemPrice()+" : "+item.getQuantity());
        }
    }


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

}
