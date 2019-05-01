import java.util.*;
public class Main
{
    public static Candidate getCandidateDetails() throws InvalidSalaryException
    {
        System.out.println("Enter the candidate Details");
        Scanner scn = new Scanner(System.in);
        
        
        Candidate cand = new Candidate();

        System.out.println("Name");
        String name = scn.nextLine();
        cand.setName(name);
            
        
        System.out.println("Gender");
        String gender = scn.nextLine();
        cand.setGender(gender);
        
        
        System.out.println("Expected Salary");
        double sal = scn.nextDouble();
        
        if(sal<10000)
        {
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        }
        else
        {
            cand.setExpectedSalary(sal);
            return cand;
        }
    }
    
    public static void main(String args[])
    {
        Main exp = new Main();
        Candidate exp2;
        try
        {
            exp2 = exp.getCandidateDetails();
            System.out.println("Registration Successful");
        }
        catch(InvalidSalaryException e)
        {
            System.out.println(e.getMessage());
        }
    }
}