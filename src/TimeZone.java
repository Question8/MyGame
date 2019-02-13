
import java.util.Scanner;

public class TimeZone {

    private int[][] map;
    
    private boolean hasEntered;

    private int timePeriod;
    private int year;

    
    TimeZone(int timePeriod){
        this.timePeriod = timePeriod;
        
        switch(timePeriod)
        {
            case 1:
                this.year = 1396;
                System.out.println("The year is: " + this.year);
                break;
            case 2:
                this.year = 1874;
                System.out.println("The year is: " + this.year);
                break;
            case 3:
                this.year = 2019;
                System.out.println("The year is: " + this.year);
                break;
            case 4:
                this.year = 2064;
                System.out.println("The year is: " + this.year);
                break;
            case 5:
                this.year = 3065;
                System.out.println("The year is: " + this.year);
                break;             
        }
    }
    
    public boolean setHasEntered(boolean entered) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getHasEntered() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setTimePeriod(int timePeriod) {
        this.timePeriod = timePeriod;
    }

    public int getTimePeriod() {
        return this.timePeriod;
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void timeTravel(Scanner in){
        System.out.println("What year would you like to time travel to:");
        System.out.println("1) 1396");
        System.out.println("2) 1874");
        System.out.println("3) 2019");
        System.out.println("4) 2064");
        System.out.println("5) 3065");
        
        int choice = 0;
        int currentTP = this.timePeriod;
        
        while (choice== 0 || choice == currentTP){
            if (choice == currentTP) {
                System.out.println("Sorry that is the year tou are current at. "
                        + "Please choose a different year.");
            }
            choice = in.nextInt();
        }
        
        switch(choice){
            case 1:
                this.timePeriod = 1;
                this.year = 1396;
                break;
            case 2:
                this.timePeriod = 2;
                this.year = 1874;
                break;
            case 3:
                this.timePeriod = 3;
                this.year = 2019;
                break;
            case 4:
                this.timePeriod = 4;
                this.year = 2064;
                break;
            case 5:
                this.timePeriod = 5;
                this.year = 3065;
                break;
                                   
        }
        
        System.out.println("You have traveled to the year: " + this.year);
    }
}
