import java.io.*;

class Customer
{
    public static void main(String args[])
    {
        DataInputStream dis = new DataInputStream(System.in);
        try
        {
            System.out.print("Enter your name: ");
            String name = dis.readLine();
            System.out.print("Enter age: ");
            String age = dis.readLine();
            System.out.print("Enter gender: ");
            String gender = dis.readLine();
            System.out.print("Hailing from: ");
            String loc = dis.readLine();
            System.out.println("Welcome,"+ name + "\n Age: " + age + "\n Gender:" + gender + "\n City:" + loc);
        }
        catch(Exception e)
        {}
    }
}