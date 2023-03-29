import java.io.File;

public class FileLister {

	public static void main(String[] args) {
		File directory = new File(args[0]);

		// String filesInDirectory[] = directory.list();

		// System.out.println("Files in the given directory:");
		// for (int i = 0; i < filesInDirectory.length; i++) {
		// 	System.out.println(filesInDirectory[i]);
		// }
		if (directory.isDirectory()) {
            for (String fileName : directory.list()) {
                System.out.println(fileName);
            }
        }
		else{
			System.out.println("Not a directory");
		}
	}

}