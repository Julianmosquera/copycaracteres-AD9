
package copycaracteres;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author julian
 */
public class Copycaracteres {


    
    public static void main(String[] args) throws IOException {
        FileReader fread = new FileReader("/home/oracle/Documents/texto10.txt");
        ArrayList guardar = new ArrayList();

        int aux =fread.read();

        while (aux != -1) {
          
          guardar.add(aux);
          aux=fread.read(); 
          
        }

        fread.close();

        FileWriter fw = new FileWriter("/home/oracle/Documents/texto11.txt");

        
            for (int i = 0;i<guardar.size(); i++) {
                fw.write((int) guardar.get(i));
                
            }
        
        fw.close();

    }

}
