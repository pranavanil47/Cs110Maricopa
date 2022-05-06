package chapter_8;
import java.util.Scanner;
public class ShoppingCartPrinter {
    public static void main(String[] args){
        int TotalCost;
        int TotalCostItem1 ;
        int TotalCostItem2 ;

        Scanner scnr = new Scanner(System.in);
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        String userName1 = scnr.nextLine();
        item1.setName(userName1);
        System.out.println("Enter the item price:");
        int userPrice1 = scnr.nextInt();
        item1.setPrice(userPrice1);
        System.out.println("Enter the item quantity:");
        int userQuantitity1 = scnr.nextInt();
        item1.setQuantity(userQuantitity1);
        TotalCostItem1 = item1.getPrice() * item1.getQuantity();

        System.out.println("");
        String enter = scnr.nextLine();

        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        String userName2 = scnr.nextLine();
        item2.setName(userName2);
        System.out.println("Enter the item price:");
        int userPrice2 = scnr.nextInt();
        item2.setPrice(userPrice2);
        System.out.println("Enter the item quantity:");
        int userQuantitity2 = scnr.nextInt();
        item2.setQuantity(userQuantitity2);
        TotalCostItem2 = item2.getPrice() * item2.getQuantity();

        System.out.println("");
        System.out.println("TOTAL COST");
        System.out.println(item1.getName()+ " "+ item1.getQuantity()+ " @ $"+item1.getPrice()+ " = "+ TotalCostItem1);
        System.out.println(item2.getName()+ " "+ item2.getQuantity()+ " @ $"+ item2.getPrice()+ " = "+ TotalCostItem2);
        System.out.println("");
        TotalCost = TotalCostItem1 + TotalCostItem2;
        System.out.println("Total: "+ TotalCost);

        

        
        
    }
}
