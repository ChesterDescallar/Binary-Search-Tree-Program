/**
 *File Name: AlphaMain
 *@version 1.0
 *Created On: 28-04-2019
 *@since 28-04-2019
 *@author Chester Descallar 978050
 *Copyright: No Copyright
 *Purpose: The program that checks if the traversal works to print out the alphabetical order
 *Version History - version 1.0 - code with comments
 */
public class AlphaMain {
    public static void main(String[] args){

        //Creates a new tree.
        BST newTree = new BST();

        //Creates new profiles which will populate the tree
        Profile newProfile = new Profile("Descallar", "Chester",
                1,1,1999, "Swansea", "United Kingdom",
                "English","1234@gmail.com", new String[]{"food"});

        Profile newProfile2 = new Profile("Bulbasaur", "Bulbasaur",
                2,2,1999, "Cardiff", "United Kingdom",
                "Pokemon","Bulbasaur@gmail.com", new String[]{"cycling", "food"});

        Profile newProfile3 = new Profile("Pikachu", "Pikachu",
                3,3,1999, "Bristol", "United Kingdom",
                "English","pikachu@gmail.com", new String[]{"tennis", "water"});

        Profile newProfile4 = new Profile("Charmeleon", "Charmeleon",
                4, 4,1999, "London", "United Kingdom",
                "English","charmeleon@gmail.com", new String[]{"swimming", "gaming", "sleeping"});

        Profile newProfile5 = new Profile("Zekrom", "Zekrom",
                4, 4,1999, "Stoke", "United Kingdom",
                "English","zekrom@gmail.com", new String[]{"watching tv", "pranks", "sleeping"});

        //Adds the newly created profile into the tree
        newTree.insertProfile(newProfile);
        newTree.insertProfile(newProfile5);
        newTree.insertProfile(newProfile4);
        newTree.insertProfile(newProfile3);
        newTree.insertProfile(newProfile2 );


        //Prints out the tree in alphabetical order *by surname*)
        System.out.println("--PRINT SURNAME ALPHABETICAL--");
        newTree.printAlphabetical();




    }
}
