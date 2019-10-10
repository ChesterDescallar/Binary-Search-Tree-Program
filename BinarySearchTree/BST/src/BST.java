/**
 *File Name: BST
 *@version 1.0
 *Created On: 28-04-2019
 *@since 28-04-2019
 *@author Chester Descallar 978050
 *Copyright: No Copyright
 *Purpose: The binary tree class
 *Version History - version 1.0 - code with comments
 */
public class BST {
    private BSTNode root; //The root of the the binary tree

    /**
     * Constructor to create a new binary search tree
     */
    public BST() {
        root = null;
    }

    /**
     * Inserts a new profile into the binary search tree
     * @param p The profile that will be inserted into the tree
     */
    public void insertProfile (Profile p){
        BSTNode node = new BSTNode(p);

        //Checks if the root of the binary search tree is empty -> if it is, then insert the profile as the root
        if (root == null){
            System.out.println("Setting ROOT - (to this profile)");
            root = node;

        }
        //Otherwise calls a recursive method which adds the profile to either the left or right child
        else{
           addProfile(root, node);
        }

    }

    /**
     * A recursive method that adds a profile to the left or right child of the parent node based on the alphabetical
     * letters of their surnames whether it comes before or after the parent node
     * @param root The parent node
     * @param newP The profile that will be added
     * @return the profile
     */
    private BSTNode addProfile (BSTNode root, BSTNode newP) {

        //Checks if the the last name of the profile is less than the last name of the root(parent node) of the BST
        if (newP.getProfile().getLastName().compareToIgnoreCase(root.getProfile().getLastName()) < 0){
            //If it is checks if the left node is empty and if it is then sets the profile to be the left child
            //of the parent node
            if (root.getL() == null) {
                System.out.println("Setting LEFT of PARENT NODE - (to this profile)");
                root.setL(newP);
            } else { //Otherwise, keeps going down to the left child and keep using recursion until
                    // the profile can be set to be the left child.
                System.out.println("GETTING LEFT");
                return addProfile(root.getL(), newP);
            }
        }

        //Checks if the the last name of the profile is greater than the last name of the root(parent node) of the BST
        if (newP.getProfile().getLastName().compareToIgnoreCase(root.getProfile().getLastName()) > 0){
            //If it is checks if the right node is empty and if it is then sets the profile to be the right child
            //of the parent node
            if (root.getR() == null) {
                System.out.println("Setting RIGHT of PARENT NODE - (to this profile)");
                root.setR(newP);
            } else { //Otherwise, keeps going down to the right child and keep using recursion until
                // the profile can be set to be the right child.
                System.out.println("GETTING RIGHT");
                return addProfile(root.getR(), newP);
            }
        }
        return newP; //returns the profile
    }


    /**
     * Gets the profile of the root
     * @return the profile of the root
     */
    public Profile getRootProfile(){
        return root.getProfile();
    }

    /**
     * Recursion to print the BST in alphabetical order
     */
   public void printAlphabetical(){
        printAlphabetical(root);
   }

    /**
     * Recursion using an in order traversal to print the BST in alphabetical order
     * @param node the parent node
     */
   private void printAlphabetical(BSTNode node){
        if (node.getL() != null){
            printAlphabetical(node.getL());
        }
        System.out.println("Full name: " + node.getProfile().getFullName());
        if (node.getR() != null){
            printAlphabetical(node.getR());
        }

   }

}
