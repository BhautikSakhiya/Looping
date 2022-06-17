
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        /*// create a new file
        File myFile = new File("secret.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
*/

        // write a file
        try {
            FileWriter fileWriter = new FileWriter("secret.txt");
            fileWriter.write( "Java I/O (Input and Output) is used to process the input and produce the output.\n"+
                    "Java uses the concept of a stream to make I/O operation fast. The java.io package contains all the classes required for input and output operations.\n"+
                    "We can perform file handling in Java by Java I/O API.\n "+"OutputStream\n" +
                    "Java application uses an output stream to write data to a destination; it may be a file, an array, peripheral device or socket.\n" +
                    "\n" +
                    "InputStream\n" +
                    "Java application uses an input stream to read data from a source; it may be a file, an array, peripheral device or socket.");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

      /*  // Reading a file
        File myFile = new File("secret.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/

     /*       // Deleting a file
        File myFile = new File("secret.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
*/
    }

}
