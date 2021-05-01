package networksocket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer{

    public static void main(String[] args)  {
        try {
            ServerSocket ss = new ServerSocket(786);
            
            System.out.println("Going to Establish connection \n\n\n");
            Socket s = ss.accept();//establishes connection   
            System.out.println(" Connection Established \n\n\n");
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            
            System.out.println("message= " + str);
            
            ss.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
