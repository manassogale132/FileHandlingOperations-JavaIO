import java.io.File;

public class GetFileInformation {

	public static void main(String[] args) {
		
		File obj = new File("C:\\Users\\Manas\\Desktop\\FileHandiling\\file1.txt");
		
		if(obj.exists()) {
			System.out.println("File name :"+obj.getName());
			System.out.println("Path :"+obj.getAbsolutePath());
			System.out.println("Size :"+obj.length());
			System.out.println("Readable :"+obj.canRead());
			System.out.println("Writeable :"+obj.canWrite());
		}
		else {
			System.out.println("File Does not Exists");
		}
	}

}
