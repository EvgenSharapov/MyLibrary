package file;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file=new File("pom.xml");
        long fileSizeInBytes=file.length();
        System.out.println("File size in bytes: "+fileSizeInBytes);
    }
}
