import java.util.*;

class SnacksDetails
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        int pizza = scn.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int puffs = scn.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int drinks = scn.nextInt();
        
        System.out.println("Bill Details");
        System.out.println("No of pizzas:" + pizza);
        System.out.println("No of puffs:"+ puffs);
        System.out.println("No of cooldrinks:" + drinks);
        
        int total = (pizza*100)+(puffs*20)+(drinks*10);
        
        System.out.println("Total Price:"+total);
        
        System.out.println("Enjoy the Show!!!");
        
    }
}