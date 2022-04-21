package py_to_j;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_system {
    public static void main(String[] args) {
        File MyFile= new File("abc.txt");

        try{
            /*
            1 Paragraph --> CREATING AND WRITING FILE
            2 Paragraph --> READING FILE
             */

            //MyFile.createNewFile();
            //System.out.println("Created Sucessfully");
            //FileWriter fileWriter = new FileWriter("abc.txt");
            //fileWriter.write("My Name is Sid");
            //fileWriter.close();
            //System.out.println("Written Sucessfully");

            Scanner sc = new Scanner(MyFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
