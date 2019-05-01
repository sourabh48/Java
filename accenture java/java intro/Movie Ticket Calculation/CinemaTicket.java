import java.util.*;

class CinemaTicket
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        int ticket = scn.nextInt();
        if(ticket>=5 && ticket<=40)
        {
            System.out.println("Do you want refreshment:");
            String refreshment = scn.next();
            System.out.println("Do you have coupon code:");
            String code = scn.next();
            System.out.println("Enter the circle:");
            String circle = scn.next();
            
            double cost = 0;
            switch(circle)
            {
                case "k":
                    {
                        int value = 75;
                        cost = (ticket*value);
                        if(ticket>20)
                        {
                            cost = cost - (cost*.1);
                        }
                        if(code.equals("y"))
                        {
                            cost = cost - (cost*.02);
                        }
                        if(refreshment.equals("y"))
                        {
                            cost = cost + (50*ticket);
                        }
                        
                        System.out.println("Ticket cost:"+ String.format("%.2f",cost));
                        
                        break;
                    }
                case "q":
                    {
                        int value = 150;
                        cost = ticket*value;
                        if(ticket>20)
                        {
                            cost = cost- (cost*.1);
                        }
                        if(code.equals("y"))
                        {
                            cost = cost-(cost*.02);
                        }
                        if(refreshment.equals("y"))
                        {
                            cost = cost+(50*ticket);
                        }
                        
                        System.out.println("Ticket cost:"+ String.format("%.2f",cost));
                        break;
                    }
                default:
                    System.out.println("Invalid Input");
            }
        }
        else
        {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }
    }
}