package chapter_8;

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;
    private int totalItemPrice;

    public ItemToPurchase(){
        itemName  ="none";
        itemPrice = 0;
        itemQuantity = 0;
        itemDescription = "none";

    }
    public ItemToPurchase(String userName, int userPrice, int userQuantity, String userDescription){
        itemName  = userName;
        itemPrice = userPrice;
        itemQuantity = userQuantity;
        itemDescription = userDescription;
    }

    public void setName(String userInput){
        itemName = userInput;
    }
    public void setPrice(int userInput){
        itemPrice = userInput;
    }public void setQuantity(int userInput){
        itemQuantity = userInput;
    }
    public void setDescription(String userDescription){
        itemDescription = userDescription;
    }

    public String getName(){
        return itemName;
    }
    public int getPrice(){
        return itemPrice;
    }
    public int getQuantity(){
        return itemQuantity;
    }
    public String getDescription(){
        return itemDescription;
    }
    public int getTotalItemPrice(){
        totalItemPrice = itemPrice * itemQuantity;
        return totalItemPrice;
    }

    public void printItemCost(){
        System.out.println(itemName+ " "+ itemQuantity+ " @ $"+ itemPrice + "= $" +getTotalItemPrice());
    }

    public void printItemDescription(){
        System.out.println(itemName+": "+ itemDescription);
    }


    
}
