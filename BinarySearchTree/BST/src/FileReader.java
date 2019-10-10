/**
 *File Name: FileReader
 *@version 1.0
 *Created On: 28-04-2019
 *@since 28-04-2019
 *@author Chester Descallar 978050
 *Copyright: No Copyright
 *Purpose: The file reader to read profiles
 *Version History - version 1.0 - code with comments
 */
import java.io.*;
import java.util.*;

public class FileReader {


    /**
     *Method to read the file and return the string of attributes for each profile from the file.
     * It also shuts down if the file being inputted does not exist.
     * @param filename the name of the file
     * @return the attributes from the file
     */
    public static BST readProfileSet (String filename){
        File inputFile = new File (filename);
        Scanner in = null;

        try {
            in = new Scanner(inputFile);
        }
        catch (FileNotFoundException e){
            System.out.println("Cannot find " + filename);
            System.exit(0);
        }

        return FileReader.readDataFile(in);
    }

    /**
     * Reads the data file used by the program and returns the BST that is populated
     * with all the profiles in the file
     * @param in The scanner of the file
     * @return The profiles represented by the data file
     */
    public static BST readDataFile (Scanner in){
        BST newTree = new BST();

        //Reads in the file and place them on the BST
        while (in.hasNextLine()){
            String treeLine = in.nextLine();
            System.out.println(treeLine);
            Scanner newNode = new Scanner(treeLine);
            newTree.insertProfile(readProfile(newNode));
            System.out.println("-----------------------------");
        }

        return newTree;

    }

    /**
     * Creates the profile
     * @param in the file being inputted
     * @return the profile
     */
    private static Profile readProfile(Scanner in){
        in.useDelimiter("," );
        String lastName = in.next();
        String firstName = in.next();
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        String town = in.next();
        String country = in.next();
        String nationality = in.next();
        String email = in.next();

        ArrayList<String> interestArrayList = new ArrayList<>();
        String[] interests;
        while (in.hasNext()){
            in.useDelimiter(",|;");
            String newInterest = in.next();
            interestArrayList.add(newInterest);
        }
        interests = new String[interestArrayList.size()];
        interests = interestArrayList.toArray(interests);

        in.close();


        Profile newProfile = new Profile(lastName, firstName, day, month, year,
                town, country, nationality, email, interests);

        System.out.println(newProfile);
        return newProfile;
    }

}
