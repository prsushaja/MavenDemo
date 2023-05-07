package FileWordOccrence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordOccurence {

	public static void main(String[] args) throws IOException 
	{
		String str;
		File input=new File("C:\\Users\\prsus\\eclipse-workspace\\MavenProjExe\\Inputfile\\javafile.txt");
		FileReader fr=null;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the word to be searched");
		String Searchword=ob.nextLine();
		
			fr=new FileReader(input);
			BufferedReader br=new BufferedReader(fr);
		
			while((str=br.readLine())!=null)
			{
				if(str.contains(Searchword))
				{
					System.out.println(str);
				
				}
				else
				{
					System.out.println("enter a valid word");
				}
			}
		
		
		//System.out.println("Occurence of searchword is" +occ);
	fr.close();
		

	}

}
 