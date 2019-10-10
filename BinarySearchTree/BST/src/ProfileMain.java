/**
 *File Name: ProfileMain
 *@version 1.0
 *Created On: 28-04-2019
 *@since 28-04-2019
 *@author Chester Descallar 978050
 *Copyright: No Copyright
 *Purpose: The program used to test the Profile class
 *Version History - version 1.0 - code with comments
 */
public class ProfileMain {
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

        Profile newProfile4 = new Profile("Charmeleon", "Charmeleon",
                3,3,1999, "Swansea", "United Kingdom",
                "English","charmeleon@gmail.com", new String[]{"water", "food"});

        Profile newProfile5 = new Profile("Squirtle", "Squirtle",
                3,3,1999, "Swansea", "United Kingdom",
                "English","squirtle@gmail.com", new String[]{"water", "food"});



        //Checks if the get methods are working
        System.out.println("CHECKING THE GET METHODS ARE WORKING");
        System.out.println(newProfile.getFullName());
        System.out.println(newProfile.getLastName());
        System.out.println(newProfile.getFirstName());
        System.out.println(newProfile.getDateOfBirth());
        System.out.println(newProfile.getTownResidence());
        System.out.println(newProfile.getCountryResidence());
        System.out.println(newProfile.getNationality());
        System.out.println(newProfile.getEmailAdd());
        newProfile.getInterests();
        System.out.println("\n-----------------------------");

        //Check if the set methods are working
        System.out.println("CHECKING THE SET METHODS ARE WORKING");
        newProfile.setCountryResidence("New Country");
        newProfile.setTownResidence("New Town");
        newProfile.setInterests(new String[]{});
        newProfile.setNationality("New Nationality");
        newProfile.setEmailAdd("newemail@gmail.com");
        System.out.println(newProfile.toString());
        System.out.println("\n-----------------------------");

        //Adds friends to the profile
        newProfile.addFriend(newProfile2);
        newProfile.addFriend(newProfile3);
        newProfile.addFriend(newProfile4);
        newProfile.addFriend(newProfile5);

        //Gets the number of friends
        System.out.println("Number of friends: " + newProfile.numOfFriends());

        //Checks if the get friend method is working
        System.out.println("CHECKING IF GET FRIEND METHOD IS WORKING");
        System.out.println("\n-----------------------------");
        System.out.println(newProfile.getFriend(0));
        System.out.println("\n-----------------------------");
        System.out.println(newProfile.getFriend(2));
        System.out.println("\n-----------------------------");
        System.out.println(newProfile.getFriend(3));
        System.out.println("-----------------------------");





    }
}
