import java.util.*;
class Triangle
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value for side1");
        int first = scn.nextInt();
        System.out.println("Enter the value for side2");
        int second= scn.nextInt();
        System.out.println("Enter the value for side3");
        int third= scn.nextInt();
        
        if(first>0 && second>0 && third>0)
        {
            if(((first+second)>third) && ((first+third)>second) && ((second+third)>first))
            {
                System.out.println("Sides form a triangle");
            }
            else
            {
                System.out.println("Sides does not form a Triangle");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}