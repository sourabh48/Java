import java.util.*;

class FindLength
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String sentence = scn.nextLine();
        int length = sentence.length();
        
        int count = 0,i;
        
        for(i=0 ; i<length ; i++)
        {
            int ascii = sentence.charAt(i);
            if((ascii>=97 && ascii<=122) || (ascii>=65 && ascii<=90) || ascii==32)
            {
                count++;
            }
        }
        
        if(count == i)
        {
            System.out.println("No of characters is: "+length);
        }
        else
        {
            System.out.println("Invalid String");
        }
    }
}