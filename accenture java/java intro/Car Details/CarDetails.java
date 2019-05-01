import java.util.Scanner;

class CarDetails
{

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the car name:");
        String name = scn.nextLine(); 
        System.out.println("Enter the car no:");
        int number = scn.nextInt();
        System.out.println("Enter the price:");
        double price = scn.nextDouble();
              
        System.out.println("Carname:"+name);
        System.out.println("Carno:"+number);
        System.out.println("Price:"+String.format("%.2f",price)+" rs only");
    }
}