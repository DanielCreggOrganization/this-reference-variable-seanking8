/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // Create a Date object using the default constructor
        Date dateObject1 = new Date();
        // Create 3 more Date objects using all the paramiterised constructors
        Date dateObject2 = new Date(8,3,2000);
        Date dateObject3 = new Date(5,8,2001);
        Date dateObject4 = new Date(21,4,2003);

        // Call the printDate() method for each object you create.
        
        dateObject1.printDate();
        dateObject2.printDate();
        dateObject3.printDate();
        dateObject4.printDate();

        Country ireland = new Country(4000000,"Dublin","Europe");

        ireland.printCountryInfo();

        Date dateObject5 = new Date(17,3,2020,"St. Patrick's Day");

        dateObject5.printDate();

    }

}
