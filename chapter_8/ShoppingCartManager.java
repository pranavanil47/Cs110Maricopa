package chapter_8;
import java.util.Scanner;
public class ShoppingCartManager {
    public static void printMenu(){
        System.out.println("MENU\na - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println("Choose an option: ");
    }

    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter Customer's Name:");
        cart.setCustomerName(input.nextLine());
        System.out.println("Enter Today's Date:");
        cart.setDate(input.nextLine());
        System.out.println("");
        System.out.println("Customer Name: " + cart.getCustomerName());
        System.out.println("Today's Date: " + cart.getDate());

    }
    
}
