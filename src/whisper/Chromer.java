package whisper;



import java.io.File;

import java.io.IOException;
public class Chromer 
{

 public static void opener(String s) throws IOException
    {
      // String s = "C:\\Program Files (x86)\\Arduino\\arduino.exe";
      // String s = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
        File app = new File(s);
      
        if(! app.exists())
            {
                throw new IllegalArgumentException("file " + s + " does not exist");
            }
        else 
            {
                System.out.println("opening\"file\"..");
                Process pros = Runtime.getRuntime().exec(app.getAbsolutePath());
            
            }
    }
}
