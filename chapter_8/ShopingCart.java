package chapter_8;
import java.util.ArrayList;
public class ShopingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<>();

    public ShopingCart(){
        customerName = "none";
        currentDate = "January 1, 2016";

    }
    public ShopingCart(String userName, String date){
        customerName = userName;
        currentDate = date;

    }
    public void setCustomerName(String userInput){
        customerName = userInput;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setDate(String userInput){
        currentDate = userInput;
    }
    public String getDate(){
        return currentDate;
    }

    public void additem(ItemToPurchase item ){
        cartItems.add(item);


    }
    public void removeItem(String itemName)
    {
 
        for (int i = 0; i < cartItems.size(); i++)
        {
            ItemToPurchase item = cartItems.get(i);
            if (itemName.equals(item.getName()))
            {
                cartItems.remove(i);
            } else
            {
                System.out.println("Item not found in cart. Nothing modified.");
            }
        }
 
    }
 
    public void modifyItem(ItemToPurchase item, String itemName) 
    {
        for (int i = 0; i < cartItems.size(); i++)
        {
            item = cartItems.get(i);
            if (itemName.equals(item.getName()))
            {
                cartItems.get(i).setName("");
                cartItems.get(i).setDescription("");
                cartItems.get(i).setPrice(20);
                cartItems.get(i).setQuantity(5);
            } else
            {
                System.out.println("Item not found in cart. Nothing modified.");
            }
        }
    }
    public int getNumItemsInCart(){
        int quantity = 0;
        for (int i = 0; i < cartItems.size(); i++)
        {
            quantity += cartItems.get(i).getQuantity();
        }
        return quantity;

    }

    public int getCostOfCart(){

        int costOfCart = 0;
        for (int i = 0; i < cartItems.size(); ++i)
        {
            costOfCart += cartItems.get(i).getPrice();
        }
        return costOfCart;
    }
    public void printTotal() { 
    
        for(int i = 0; i < cartItems.size(); i++)
        {
            cartItems.get(i).printItemCost();
        }
        System.out.println("Total: $" + getCostOfCart());
    }
    public void printDescription()
    {
        for (int i = 0; i < cartItems.size(); ++i)
        {
            cartItems.get(i).printItemDescription();
        }
    }


}
