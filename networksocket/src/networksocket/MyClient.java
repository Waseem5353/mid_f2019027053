
package networksocket;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try{
            
            Socket s = new Socket("localhost", 786);
            
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            dout.writeUTF("Hello waseem");
            dout.writeUTF("mid paper");
            
            dout.flush();
            dout.close();
            s.close();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
