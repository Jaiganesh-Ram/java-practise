
import java.io.File;

public class FileHandling{
public static void main(String[] args){
   File file=new File ("C:\\workspace\\FileHandling\\test.txt");
   try{
	if(file.exists()){
	   file.delete();
	}
	file.createNewFile();
      } catch (Exception e){
	  System.out.println("File Creation error: "+ e.getMessage());
	}
      }
}
	