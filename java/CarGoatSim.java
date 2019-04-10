import java.io.*;

public class CarGoatSim
{
    public static void main(String[] Args) throws IOException
        {
            int change=0;
            
            int Wins=0;
            int Lose=0;
            
            int Counter=0;
            int CarDoor=0;

            int [] Door = new int[3];
            
            int Guess=0;
            int OpenedDoor=0;

                boolean CHANGE_DOOR=false;

            for (int p=0; p<2; p++){
                if (change==1){
                    System.out.println("Changing Door Results Below");
                    CHANGE_DOOR=true;
                    Wins=0;
                    Lose=0;
                    
                }
                change++;
            

                for (int i=0; i<10000; i++)
                {
 
                    Door[0]=0;
                    Door[1]=0;
                    Door[2]=0;


                    CarDoor = (int)((Math.random()*9)%3);
                    Door[CarDoor]=1;
                    Guess = (int)((Math.random()*9)%3);


                    OpenedDoor = FindGoat(Door,Guess);
                    Door[OpenedDoor]=-1;
                
                    
                    if (CHANGE_DOOR){
                        for (int j=0; j<3; j++){
                            if (Door[j] != -1 && Door[j] != Guess){
                                Guess=j;
                            }
                        }
                    }
                
                    if (Door[Guess]==1){
                        Wins++;
                    }
                    else{
                        Lose++;
                    }
                }
                System.out.println(Wins + " Wins and " + Lose + " Loses ");
            }
        }


    public static int FindGoat(int[] Door,int Guess)
        {
            int GoatDoor=0;
            int TryDoor=0;
            boolean Found=false;
            
            while(!Found)
                {
                    TryDoor = (int)((Math.random()*9)%3);
                    if (Door[TryDoor]==0){
                        GoatDoor=TryDoor;
                        Found=true;
                    }
                }
            return GoatDoor;
        }
}

            
