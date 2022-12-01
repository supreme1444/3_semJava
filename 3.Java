import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
class Main
{
    public static void main(String[] args)
    {
    
         File file = new File("C:/Users/supre/OneDrive/Рабочий стол/Новая папка (11)/zapros1.txt");
        StringBuilder text = new StringBuilder();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader( file));
            String line;
        
            while ((line = br.readLine()) != null) {
                String[] strings = line.split(",|:|\\s|]|}");
                for (int i = 0; i < 1; i++) 
                {
                     
                    text.append("Студент"+strings[1]+"получил"+strings[3]+ "по предмету"+strings[5]+"."+"\n");
                   
                }
                
                //text.append(string);
               
                //System.out.println( text);
            }
             System.out.println(text);
            
            br.close();
            
        }
        catch (IOException e) {
            
        }
    }

}
// "C:/Users/supre/OneDrive/Рабочий стол/Новая папка (11)/zapros1.txt"
