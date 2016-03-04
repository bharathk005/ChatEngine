
package Linker;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sender extends Thread
{
    String message, host;
    int port;
    Writable w;
    public Sender(){}

    public Sender(String message, String host, int port) {
        this.message = message;
        this.host = host;
        this.port = port;
    }

    @Override
    public void run() 
    {
        try {
            Socket s = new Socket(host,port);
            s.getOutputStream().write(message.getBytes());
            s.close();
          //  if(message.contains("opener"))
           //     w.write("You: "+"%1#7yu//^6//" +message+" //6^//yu#7");
            
             } catch (IOException ex) 
             {
                Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, ex);
              }
        
    }
    
   
}
