/**
 *File Name: BSTNodeMain
 *@version 1.0
 *Created On: 28-04-2019
 *@since 28-04-2019
 *@author Chester Descallar 978050
 *Copyright: No Copyright
 *Purpose: The program used to test the BSTNode
 *Version History - version 1.0 - code with comments
 */
public class BSTNodeMain {
    public static void main (String[] args) {

        //Creates the profiles
        Profile newProfile = new Profile("Descallar", "Chester",
                2,2,1999, "Swansea", "United Kingdom",
                "English","1234@gmail.com", new String[]{"water", "food"});

        Profile newProfile2 = new Profile("Bulbasaur", "Bulbasaur",
                2,2,1999, "Cardiff", "United Kingdom",
                "Pokemon","Bulbasaur@gmail.com", new String[]{"water", "food"});

        Profile newProfile3 = new Profile("Pikachu", "Pikachu",
                3,3,1999, "Swansea", "United Kingdom",
                "English","pikachu@gmail.com", new String[]{"water", "food"});

        //Creates new nodes using the profile created previously
        BSTNode chesterNode = new BSTNode(newProfile);
        BSTNode charizardNode = new BSTNode(newProfile2);
        BSTNode pikachuNode = new BSTNode(newProfile3);

        //Checking if the get profile method is working.
        System.out.println(chesterNode.getProfile());
        System.out.println("-----------------------------");

        //Setting the left child and right child of the chesterNode
        chesterNode.setL(charizardNode);
        chesterNode.setR(pikachuNode);

        //Checking if the get(L/R) methods are working
        System.out.println(chesterNode.getL().getProfile());
        System.out.println(chesterNode.getR().getProfile());






    }
}
