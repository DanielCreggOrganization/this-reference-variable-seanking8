public class Country {
    
    public int population;
    public String continent;
    public String capital;

    public Country(){
        
    }

    public Country(int population, String capital, String continent){
        this.population = population;
        this.continent = continent;
        this.capital = capital;
    }
    
    public void printCountryInfo(){
        System.out.println("\nPopulation: "+population);
        System.out.println("Capital: "+capital);
        System.out.println("Continent: "+continent+"\n");
    }

}