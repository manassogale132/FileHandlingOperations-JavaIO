import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	
	public static void main(String[] args) {
		
		FileWriter writer;
		try {
			writer = new FileWriter("C:\\Users\\Manas\\Desktop\\FileHandiling\\file1.txt");
			writer.write("My name is Manas.\n");
			writer.write("I am from Pune.");
			writer.close();
			System.out.println("*Successful");
			
		} catch (IOException e) {
			System.out.println("*Error");
			e.printStackTrace();
		}
			
	}

}
