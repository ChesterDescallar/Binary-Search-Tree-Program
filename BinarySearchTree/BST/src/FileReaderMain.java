/**
 *File Name: FileReaderMain
 *@version 1.0
 *Created On: 28-04-2019
 *@since 28-04-2019
 *@author Chester Descallar 978050
 *Copyright: No Copyright
 *Purpose: The program that tests the FileReader class.
 *Version History - version 1.0 - code with comments
 */
import java.util.Scanner;

public class FileReaderMain {
    public static void main (String[] args) {


    Scanner input = new Scanner (System.in);
    System.out.println ("Please enter a profile set to open:");
    String filename = input.next ();

    FileReader.readProfileSet(filename); //to open file without adding the directory at the beginning ('data/profile1.txt'),
										//use FileReader.readProfileSet("data/"+filename)

    }
}
