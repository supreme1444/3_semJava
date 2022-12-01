import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
class Main
{
    public static void main(String[] args)
    {
        File file = new File("C:/Users/supre/OneDrive/Рабочий стол/Новая папка (11)/java 2/java_1/zapros.txt");

        
        StringBuilder text = new StringBuilder();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
        
            while ((line = br.readLine()) != null) {
                String[] strings = line.split(",|:|\\s");
                for (String string : strings)
                text.append(string);
                
                //System.out.println( text);
            }
            StringBuffer strBuffer = new StringBuffer(text);
            strBuffer.replace(0,6,"SELECT * FROM students WHERE name = ");
            strBuffer.replace(44,53,"AND country = ");
            strBuffer.replace(66,73," AND city = ");
            strBuffer.replace(85,100," ");
            System.out.println(strBuffer.toString());
            br.close();
            
        }
        catch (IOException e) {
            
        }
    }
}
