
package copybytesimaxe;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Copybytesimaxe {

    
    public static void main(String[] args) throws IOException {
       File foto1 = new File ("/home/oracle/NetBeansProjects/copybytesimaxe/foto1.gif");
       File foto2 = new File ("/home/oracle/NetBeansProjects/copybytesimaxe/foto2.gif");
       
       foto2.createNewFile();
       
       BufferedInputStream in =new BufferedInputStream( new FileInputStream(foto1));
       BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(foto2,true));
       
        int aux;
       while((aux=in.read())!=-1){
       
          out.write(aux);
               
       }
       in.close();
       out.close();
    }
    
}
