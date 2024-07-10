import java.io.File;
import java.io.FileReader;

public class FileDemoMain {

    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Users\\Playdata\\IdeaProjects\\javastudy\\src\\testReader.txt");
            int data = 0;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            // File 객체
            File file = new File("C:\\Users\\Playdata\\IdeaProjects\\javastudy\\src\\testReader.txt");
            reader = new FileReader(file);
            char[] charArray = new char[(int) file.length()];
            reader.read(charArray);

            for (int i = 0; i < charArray.length; i++) {
                System.out.print(charArray[i]);
            }


//            System.out.println((char) reader.read());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
