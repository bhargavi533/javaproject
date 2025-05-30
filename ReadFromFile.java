package xyz;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:\\3308\\Java is a powerful, high-level, obj.txt");
					int ch;
			while((ch=reader.read())!=-1)
			{
				System.out.print((char)ch);
			}
			reader.close();
			}
		catch (IOException e)
		{
			System.out.println("Error:"+ e.getMessage());
		}



	}

}
