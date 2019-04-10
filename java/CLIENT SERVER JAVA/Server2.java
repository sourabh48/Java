//WithoutCIP
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;


public class Server2 {

    public static void main(String[] args) throws IOException {
    	System.out.println("start");
        int c=0,i=5;
	ServerSocket ss=new ServerSocket(5001);
while(true){
	    System.out.println("Inside outer while");
            i=5;
	    Socket s=ss.accept();
            DataInputStream din=new DataInputStream(s.getInputStream());
            BufferedReader reader=new BufferedReader(new InputStreamReader(din));
            while(i>0)
            {
		System.out.println("Inside Inner while");           
             String msg=reader.readLine();
	     if(msg!=null)
              {
               c++;
			if(i==0)		
			{i=5;}
               System.out.println(c+"entire string "+msg);
	      }
	     else{
		i=0;
		//s.close();
		}
	    }
         }
     }
}
