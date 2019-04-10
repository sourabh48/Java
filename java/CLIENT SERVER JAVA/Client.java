
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.*;

import java.io.IOException;

/**
 * Trivial client for the date server.
 */
public class Client{
                         private static Socket s;
    public static void main(String[] args) throws IOException {
        String host = "localhost";
            int port = 5001;
            InetAddress address = InetAddress.getByName(host);
            s = new Socket(address, port);
        //BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //String answer = input.readLine();
            OutputStream os = s.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
 Scanner cin=new Scanner(System.in);
            //String msg = "Hi..";
 	String msg;
msg=cin.nextLine();
            String sendMessage = msg + "\n";
            bw.write(sendMessage);
            bw.flush();
		
            System.out.println("Message sent to the server : "+sendMessage);
              
        System.exit(0);
    }
}