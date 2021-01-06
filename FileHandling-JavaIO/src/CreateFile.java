import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
	
		
		File obj = new File("C:\\Users\\Manas\\Desktop\\FileHandiling\\file1.txt");
		
		try {
			if(obj.createNewFile()) {
				System.out.println("New File Created :"+obj.getName());
			}
			else {
				System.out.println("File Already Exists.");
			}
		} catch (IOException e) {
			System.out.println("*Error");
			e.printStackTrace();
		}

	}

}
