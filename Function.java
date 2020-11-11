
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThanhNam int a = 0
 * double b 
 * string s
 * 
 */
public class Function {
  public String getProblem(String id,String date,String name,String sortDesc, String fullDes,double mark,String category,String author){
      Problem problemEnt = new Problem(id, date, name, sortDesc, fullDes, mark, category, author);
      //System.out.println("Enter full description");
      //String fullDes = sc.nextLine(); " 1 + 1 = ? "
      
      return problemEnt.toString();
  }
  
  public void writeFile(String fileWriteData){
        try {
            Files.write(Paths.get("\\Users\\Admin\\Desktop\\JAVA\\oo.dat"), fileWriteData.getBytes());
        } catch (IOException e) {
        }
    
  }

  
}
