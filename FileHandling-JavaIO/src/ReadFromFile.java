import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
		File obj = new File("C:\\Users\\Manas\\Desktop\\FileHandiling\\file1.txt");
		Scanner reader = new Scanner(obj);
		while(reader.hasNext()) {
			String data =reader.nextLine();
			System.out.println(data);
		}
        reader.close();
		}catch(FileNotFoundException e) {
			System.out.println("*Error");
			e.printStackTrace();
		}
	}

}
