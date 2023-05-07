package FileWordOccrence;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import com.google.common.io.Files;
public class WordOccJava {

		   public static void main(String[] args) throws Exception 
		   {
		      int cnt=0;
		      String s;
		      String[] buffer; 
		      File f1=new File("C:\\Users\\prsus\\eclipse-workspace\\MavenProjExe\\Inputfile\\javafile.txt"); 
		      FileReader fr = new FileReader(f1);
		      BufferedReader bfr = new BufferedReader(fr);
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the word to be Searched");
		      String wrd=sc.nextLine();
		      
		       String out="C:\\Users\\prsus\\eclipse-workspace\\MavenProjExe\\output\\ouut.txt";
		       
		      while((s=bfr.readLine())!=null)   
		      {
		         buffer=s.split(" ");  
		          for (String ch : buffer) 
		          {
		                 if (ch.equals(wrd))   
		                 {
		                   cnt++; 
		                   
		                 }
		          }
		          if(s.contains(wrd))
					{
		        	 
		        	 File file = new File(out);
		       FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		  bw.write(s);
		bw.close();
		       System.out.println(s);
					}
		    		
						
					}
		      
		      if(cnt==0)  
		      {
		         System.out.println("Word not found!");
		      }
		      else
		      {
		         System.out.println("Word : "+wrd+"found! Count : "+cnt);
		      }
		      
		         fr.close();
		   }


		

	}


