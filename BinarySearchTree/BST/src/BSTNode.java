/**
 *File Name: BSTNode
 *@version 1.0
 *Created On: 28-04-2019
 *@since 28-04-2019
 *@author Chester Descallar 978050
 *Copyright: No Copyright
 *Purpose: The binary search tree node
 *Version History - version 1.0 - code with comments
 */

public class BSTNode {
    private Profile data; //reference to a profile
    private BSTNode l; //The "left child" in the node
    private BSTNode r;//The "right child" in the node

    /**
     * Constructor that creates a new node
     * @param data
     */
    public BSTNode(Profile data){
        this.data = data;
        l = r = null;
    }

    /**
     * Gets the profile of the node
     * @return the profile of the node
     */
    public Profile getProfile(){
        return data;
    }

    /**
     * Sets the left child of the node
     * @param l the profile that will be the left child of the node
     */
    public void setL (BSTNode l){
        this.l = l;
    }

    /**
     * Sets the right child of the node
     * @param r the profile that will be the right child of the node
     */
    public void setR(BSTNode r){
        this.r = r;
    }

    /**
     * Gets the left child of the node
     * @return the left child of the node
     */
    public BSTNode getL() {
        return l;
    }

    /**
     * Gets the right child of the node
     * @return the right child of the node
     */
    public BSTNode getR() {
        return r;
    }
}
