import java.io.File;

public class FileManipulator {

    public static void main(String[] args) {
        File createdFile = new File(
                "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/Q10/fileCreated.txt");
        File deletedFile = new File(
                "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/Q10/fileDeleted.txt");
        File renamedFile = new File(
                "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/Q10/fileRenamed.txt");

        if (deletedFile.delete()) {
            System.out.println("File deleted successfully!!");
        } else {
            System.out.println("File deletion unsuccessful!!");
        }

        boolean renameFlag = createdFile.renameTo(renamedFile);

        if (renameFlag) {
            System.out.println("File renamed successfully!!");
        } else {
            System.out.println("File renaming unsuccessful!!");
        }

        System.out.println("File size of renamed file:" + renamedFile.length());
    }

}