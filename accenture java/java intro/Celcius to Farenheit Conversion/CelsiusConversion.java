import java.util.*;
class CelsiusConversion
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        float celsius= scn.nextFloat();
        
        float farenheit = (((9*celsius)/5)+32);
        
        System.out.println(String.format("%.2f",farenheit));
        
    }
}