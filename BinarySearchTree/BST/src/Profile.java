/**
 *File Name: Profile
 *@version 1.0
 *Created On: 28-04-2019
 *@since 28-04-2019
 *@author Chester Descallar 978050
 *Copyright: No Copyright
 *Purpose: The class is the Profile which will have all the details.
 *Version History - version 1.0 - code with comments
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Profile {
    //All the attributes of this profile
    private String lastName;
    private String firstName;
    private int day;
    private int month;
    private int year;
    private String townResidence;
    private String countryResidence;
    private String nationality;
    private String emailAdd;
    private String[] interests;
    private ArrayList<Profile> friends = new ArrayList<Profile>();

    /**
     * Creates a profile
     * @param lastName Last Name of the person
     * @param firstName First Name of the person
     * @param day The day in the person's birthday
     * @param month The month in the person's birthday
     * @param year  The year in the person's birthday
     * @param townResidence The person's town residence
     * @param countryResidence The person's country residence
     * @param nationality The person's nationality
     * @param emailAdd The person's email address
     * @param interests The person's interests.
     */
    public Profile(String lastName, String firstName, int day, int month, int year, String townResidence,
                   String countryResidence, String nationality, String emailAdd, String[] interests) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.townResidence = townResidence;
        this.countryResidence = countryResidence;
        this.nationality = nationality;
        this.emailAdd = emailAdd;
        this.interests = interests;
    }

    /**
     * Gets the town residence
     * @return  The town residence
     */
    public String getTownResidence() {
        return townResidence;
    }

    /**
     * Sets the town residence
     * @param townResidence the town residence
     */
    public void setTownResidence(String townResidence) {
        this.townResidence = townResidence;
    }

    /**
     * Gets the country residence
     * @return The country residence
     */
    public String getCountryResidence() {
        return countryResidence;
    }

    /**
     * Sets the country residence
     * @param countryResidence the country residence
     */
    public void setCountryResidence(String countryResidence) {
        this.countryResidence = countryResidence;
    }

    /**
     * Gets the nationality
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality
     * @param nationality the person's nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Gets the persons interests
     */
    public void getInterests() {
        System.out.println("Interests: ");
        for (String i : interests){
            System.out.println(i);
        }
    }

    /**
     * Sets the persons interests
     * @param interests The persons's interests
     */
    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    /**
     * Gets the person's email address
     * @return the email address
     */
    public String getEmailAdd() {
        return emailAdd;
    }

    /**
     * Sets the person's email adderss
     * @param emailAdd the email address
     */
    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }

    /**
     * Gets the person's date of birth
     * @return day, month, year combined together to produce the date of birth
     */
    public String getDateOfBirth() {
        return (day + "/" + month + "/" + year);
    }

    /**
     * Gets the person's last name
     * @return The last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the person's first name
     * @return The first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the person's full name.
     * @return fullname and lastname combined
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Adds new friends
     * @param p The profile to be added
     */
    public void addFriend (Profile p){
        friends.add(p);
    }

    /**
     * Gets friend i from the list
     * @param i The number that the friend is in the list
     * @return The profile of that friend
     */
    public Profile getFriend (int i)
    {
       return friends.get(i);
    }

    /**
     * Gets the number of friends the profile has
     * @return the number of friends
     */
    public int numOfFriends() {
        return friends.size();
    }


    /**
     * Method to collate all the attributes of the profile into a readable string
     * @return The profile containing all the attributes
     */
    @Override
    public String toString() {
        return "--Profile-- \n" +
                "Last Name: " + lastName + "\n" +
                "First Name: " + firstName + "\n" +
                "Date of Birth: " + day + "/" + month + "/" + year + "\n" +
                "Town of Residence: " + townResidence + "\n" +
                "Country of Residence: " + countryResidence + "\n" +
                "Nationality: " + nationality + "\n" +
                "Email Address: " + emailAdd + "\n" +
                "Interests: " + Arrays.toString(interests) + "\n";
                //"Friends: " +  + "\n" +

    }
}
