/**
 * Date
 */
public class Date {
    
    // Instance Variables
    public int day;
    public int month;
    public int year;
    String event;

    // Default Constructor (No Parameters)
    public Date(){
        event = "Nothing on Today";
    }

    // Parameterized constructor (3 Parameters)
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(int day, int month, int year, String event){
        this(day,month,year);
        this.event = event;
    }
    
    // A simple print method
    public void printDate(){
        // Print the date like this: day/month/year
        System.out.println(day+" / "+month+" / "+year+". "+event);
    }
}
