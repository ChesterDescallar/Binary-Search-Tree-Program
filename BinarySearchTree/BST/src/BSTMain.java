/**
 *File Name: BSTMain
 *@version 1.0
 *Created On: 28-04-2019
 *@since 28-04-2019
 *@author Chester Descallar 978050
 *Copyright: No Copyright
 *Purpose: The program that tests the BST class
 *Version History - version 1.0 - code with comments
 */
public class BSTMain {
    public static void main (String[] args){
        BST newTree = new BST(); //Creates a new BST

        //Creates the profiles
        Profile newProfile = new Profile("Descallar", "Chester",
                1,1,1999, "Swansea", "United Kingdom",
                "English","1234@gmail.com", new String[]{"water", "food"});

        Profile newProfile2 = new Profile("Bulbasaur", "Bulbasaur",
                2,2,1999, "Cardiff", "United Kingdom",
                "Pokemon","Bulbasaur@gmail.com", new String[]{"nothing"});

        Profile newProfile3 = new Profile("Pikachu", "Pikachu",
                3,3,1999, "Swansea", "United Kingdom",
                "English","pikachu@gmail.com", new String[]{"water", "food"});

        Profile newProfile4 = new Profile("Charmeleon", "Charmeleon",
                4, 4,1999, "Swansea", "United Kingdom",
                "English","charmeleon@gmail.com", new String[]{"water", "food", "sleeping"});

        Profile newProfile5 = new Profile("Zekrom", "Zekrom",
                5, 5,1999, "Swansea", "United Kingdom",
                "French","zekrom@gmail.com", new String[]{"bonsai trees", "watching tv", "sleeping"});


        //Inserts profile to the tree.
        newTree.insertProfile(newProfile);
        newTree.insertProfile(newProfile5);
        newTree.insertProfile(newProfile4);
        newTree.insertProfile(newProfile3);
        newTree.insertProfile(newProfile2);

        //Gets the root profile of the tree.
        System.out.println(newTree.getRootProfile());


    }
}
