import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		File obj = new File("C:\\Users\\Manas\\Desktop\\FileHandiling\\file2.txt");
		
		if(obj.delete()) {
			System.out.println("File Deleted :"+obj.getName());
		}
		else {
			System.out.println("File Does not Exists.");
		}

	}

}
