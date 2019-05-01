import java.util.*;

class NumberRepetition
{
    public  static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        String number = scn.nextLine();
        System.out.println("Enter the key digit");
        String key = scn.nextLine();
        
        int count = 0, i;
        
        String[] arrnum = number.split("");
        
        for(i=0;i<number.length();i++)
        {
            if(arrnum[i].equals(key))
            {
                count++;
            }
        }
        System.out.println(key + " appears " +count+" times in " +number);
    }
}