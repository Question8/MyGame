
import java.util.Scanner;

public class TimeZone {
    

    public int myMap[][];

    private boolean hasEntered;

    private int timePeriod;
    private int year;

    TimeZone(int timePeriod) {
        this.timePeriod = timePeriod;
        myMap = new int[12][17];
        this.initMap(this.timePeriod);

        switch (timePeriod) {
            case 1:
                this.year = 1942;
                break;
            case 2:
                this.year = 1968;
                break;
            case 3:
                this.year = 2019;
                break;
            case 4:
                this.year = 2064;
                break;
            case 5:
                this.year = 3065;
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

    public int[][] getMyMap() {
        return myMap;
    }

    public void timeTravel(Scanner in) {
        
        int choice = 0;
        int currentTP = this.timePeriod;

        while (choice == 0 || choice == currentTP) {
            if (choice == currentTP) {
                System.out.println("Sorry that is the year you are currently at. "
                        + "Please choose a different year.");
            }
            choice = testDriver.validNum("What year would you like to time travel to:" 
                +"\n1) 1942"
                +"\n2) 1968"
                +"\n3) 2019"
                +"\n4) 2064"
                +"\n5) 3065");
        }

        switch (choice) {
            case 1:
                this.timePeriod = 1;
                this.year = 1942;
                initMap(1);
                break;
            case 2:
                this.timePeriod = 2;
                this.year = 1968;
                initMap(2);
                break;
            case 3:
                this.timePeriod = 3;
                this.year = 2019;
                initMap(3);
                break;
            case 4:
                this.timePeriod = 4;
                this.year = 2064;
                initMap(4);
                break;
            case 5:
                this.timePeriod = 5;
                this.year = 3065;
                initMap(5);
                break;

        }

        System.out.println("You have traveled to the year: " + this.year);
    }

    public void initMap(int tp) {//16 x 9

        switch (tp) {
            case 1://This is 1942
                this.myMap[0][0] = 4;
                this.myMap[0][1] = 4;
                this.myMap[0][2] = 4;
                this.myMap[0][3] = 4;
                this.myMap[0][4] = 4;
                this.myMap[0][5] = 4;
                this.myMap[0][6] = 4;
                this.myMap[0][7] = 4;
                this.myMap[0][8] = 4;
                this.myMap[0][9] = 4;
                this.myMap[0][10] = 4;
                this.myMap[0][11] = 4;
                this.myMap[0][12] = 4;
                this.myMap[0][13] = 4;
                this.myMap[0][14] = 4;
                this.myMap[0][15] = 4;
                this.myMap[0][16] = 4;

                this.myMap[1][0] = 4;
                this.myMap[1][1] = 8;
                this.myMap[1][2] = 0;
                this.myMap[1][3] = 0;
                this.myMap[1][4] = 0;
                this.myMap[1][5] = 0;
                this.myMap[1][6] = 0;
                this.myMap[1][7] = 0;
                this.myMap[1][8] = 4;
                this.myMap[1][9] = 4;
                this.myMap[1][10] = 4;
                this.myMap[1][11] = 4;
                this.myMap[1][12] = 4;
                this.myMap[1][13] = 4;
                this.myMap[1][14] = 4;
                this.myMap[1][15] = 4;
                this.myMap[1][16] = 4;

                this.myMap[2][0] = 4;
                this.myMap[2][1] = 0;
                this.myMap[2][2] = 0;
                this.myMap[2][3] = 0;
                this.myMap[2][4] = 0;
                this.myMap[2][5] = 0;
                this.myMap[2][6] = 0;
                this.myMap[2][7] = 0;
                this.myMap[2][8] = 4;
                this.myMap[2][9] = 4;
                this.myMap[2][10] = 4;
                this.myMap[2][11] = 4;
                this.myMap[2][12] = 4;
                this.myMap[2][13] = 4;
                this.myMap[2][14] = 4;
                this.myMap[2][15] = 4;
                this.myMap[2][16] = 4;

                this.myMap[3][0] = 4;
                this.myMap[3][1] = 0;
                this.myMap[3][2] = 0;
                this.myMap[3][3] = 3;
                this.myMap[3][4] = 1;
                this.myMap[3][5] = 0;
                this.myMap[3][6] = 0;
                this.myMap[3][7] = 0;
                this.myMap[3][8] = 4;
                this.myMap[3][9] = 4;
                this.myMap[3][10] = 0;
                this.myMap[3][11] = 0;
                this.myMap[3][12] = 0;
                this.myMap[3][13] = 0;
                this.myMap[3][14] = 0;
                this.myMap[3][15] = 0;
                this.myMap[3][16] = 4;

                this.myMap[4][0] = 4;
                this.myMap[4][1] = 0;
                this.myMap[4][2] = 0;
                this.myMap[4][3] = 0;
                this.myMap[4][4] = 0;
                this.myMap[4][5] = 0;
                this.myMap[4][6] = 0;
                this.myMap[4][7] = 0;
                this.myMap[4][8] = 4;
                this.myMap[4][9] = 4;
                this.myMap[4][10] = 0;
                this.myMap[4][11] = 0;
                this.myMap[4][12] = 0;
                this.myMap[4][13] = 5;
                this.myMap[4][14] = 0;
                this.myMap[4][15] = 0;
                this.myMap[4][16] = 4;

                this.myMap[5][0] = 4;
                this.myMap[5][1] = 0;
                this.myMap[5][2] = 0;
                this.myMap[5][3] = 0;
                this.myMap[5][4] = 0;
                this.myMap[5][5] = 0;
                this.myMap[5][6] = 0;
                this.myMap[5][7] = 0;
                this.myMap[5][8] = 0;
                this.myMap[5][9] = 0;
                this.myMap[5][10] = 0;
                this.myMap[5][11] = 0;
                this.myMap[5][12] = 0;
                this.myMap[5][13] = 0;
                this.myMap[5][14] = 0;
                this.myMap[5][15] = 0;
                this.myMap[5][16] = 4;

                this.myMap[6][0] = 4;
                this.myMap[6][1] = 0;
                this.myMap[6][2] = 0;
                this.myMap[6][3] = 0;
                this.myMap[6][4] = 0;
                this.myMap[6][5] = 0;
                this.myMap[6][6] = 0;
                this.myMap[6][7] = 0;
                this.myMap[6][8] = 0;
                this.myMap[6][9] = 0;
                this.myMap[6][10] = 0;
                this.myMap[6][11] = 0;
                this.myMap[6][12] = 0;
                this.myMap[6][13] = 0;
                this.myMap[6][14] = 0;
                this.myMap[6][15] = 0;
                this.myMap[6][16] = 4;

                this.myMap[7][0] = 4;
                this.myMap[7][1] = 0;
                this.myMap[7][2] = 0;
                this.myMap[7][3] = 0;
                this.myMap[7][4] = 0;
                this.myMap[7][5] = 0;
                this.myMap[7][6] = 0;
                this.myMap[7][7] = 0;
                this.myMap[7][8] = 0;
                this.myMap[7][9] = 0;
                this.myMap[7][10] = 0;
                this.myMap[7][11] = 0;
                this.myMap[7][12] = 0;
                this.myMap[7][13] = 0;
                this.myMap[7][14] = 0;
                this.myMap[7][15] = 0;
                this.myMap[7][16] = 4;

                this.myMap[8][0] = 4;
                this.myMap[8][1] = 4;
                this.myMap[8][2] = 4;
                this.myMap[8][3] = 4;
                this.myMap[8][4] = 4;
                this.myMap[8][5] = 4;
                this.myMap[8][6] = 4;
                this.myMap[8][7] = 4;
                this.myMap[8][8] = 4;
                this.myMap[8][9] = 4;
                this.myMap[8][10] = 0;
                this.myMap[8][11] = 0;
                this.myMap[8][12] = 0;
                this.myMap[8][13] = 0;
                this.myMap[8][14] = 0;
                this.myMap[8][15] = 0;
                this.myMap[8][16] = 4;

                this.myMap[9][0] = 4;
                this.myMap[9][1] = 4;
                this.myMap[9][2] = 4;
                this.myMap[9][3] = 4;
                this.myMap[9][4] = 4;
                this.myMap[9][5] = 4;
                this.myMap[9][6] = 4;
                this.myMap[9][7] = 4;
                this.myMap[9][8] = 4;
                this.myMap[9][9] = 4;
                this.myMap[9][10] = 0;
                this.myMap[9][11] = 0;
                this.myMap[9][12] = 0;
                this.myMap[9][13] = 0;
                this.myMap[9][14] = 0;
                this.myMap[9][15] = 0;
                this.myMap[9][16] = 4;

                this.myMap[10][0] = 4;
                this.myMap[10][1] = 4;
                this.myMap[10][2] = 4;
                this.myMap[10][3] = 4;
                this.myMap[10][4] = 4;
                this.myMap[10][5] = 4;
                this.myMap[10][6] = 4;
                this.myMap[10][7] = 4;
                this.myMap[10][8] = 4;
                this.myMap[10][9] = 4;
                this.myMap[10][10] = 0;
                this.myMap[10][11] = 0;
                this.myMap[10][12] = 0;
                this.myMap[10][13] = 0;
                this.myMap[10][14] = 0;
                this.myMap[10][15] = 0;
                this.myMap[10][16] = 4;

                this.myMap[11][0] = 4;
                this.myMap[11][1] = 4;
                this.myMap[11][2] = 4;
                this.myMap[11][3] = 4;
                this.myMap[11][4] = 4;
                this.myMap[11][5] = 4;
                this.myMap[11][6] = 4;
                this.myMap[11][7] = 4;
                this.myMap[11][8] = 4;
                this.myMap[11][9] = 4;
                this.myMap[11][10] = 4;
                this.myMap[11][11] = 4;
                this.myMap[11][12] = 4;
                this.myMap[11][13] = 4;
                this.myMap[11][14] = 4;
                this.myMap[11][15] = 4;
                this.myMap[11][16] = 4;
                break;
                
            case 2://This is 1968
                this.myMap[0][0] = 4;
                this.myMap[0][1] = 4;
                this.myMap[0][2] = 4;
                this.myMap[0][3] = 4;
                this.myMap[0][4] = 4;
                this.myMap[0][5] = 4;
                this.myMap[0][6] = 4;
                this.myMap[0][7] = 4;
                this.myMap[0][8] = 4;
                this.myMap[0][9] = 4;
                this.myMap[0][10] = 4;
                this.myMap[0][11] = 4;
                this.myMap[0][12] = 4;
                this.myMap[0][13] = 4;
                this.myMap[0][14] = 4;
                this.myMap[0][15] = 4;
                this.myMap[0][16] = 4;

                this.myMap[1][0] = 4;
                this.myMap[1][1] = 8;
                this.myMap[1][2] = 0;
                this.myMap[1][3] = 0;
                this.myMap[1][4] = 0;
                this.myMap[1][5] = 0;
                this.myMap[1][6] = 0;
                this.myMap[1][7] = 0;
                this.myMap[1][8] = 4;
                this.myMap[1][9] = 4;
                this.myMap[1][10] = 4;
                this.myMap[1][11] = 4;
                this.myMap[1][12] = 4;
                this.myMap[1][13] = 4;
                this.myMap[1][14] = 4;
                this.myMap[1][15] = 4;
                this.myMap[1][16] = 4;

                this.myMap[2][0] = 4;
                this.myMap[2][1] = 0;
                this.myMap[2][2] = 0;
                this.myMap[2][3] = 0;
                this.myMap[2][4] = 0;
                this.myMap[2][5] = 0;
                this.myMap[2][6] = 0;
                this.myMap[2][7] = 0;
                this.myMap[2][8] = 4;
                this.myMap[2][9] = 4;
                this.myMap[2][10] = 4;
                this.myMap[2][11] = 4;
                this.myMap[2][12] = 4;
                this.myMap[2][13] = 4;
                this.myMap[2][14] = 4;
                this.myMap[2][15] = 4;
                this.myMap[2][16] = 4;

                this.myMap[3][0] = 4;
                this.myMap[3][1] = 0;
                this.myMap[3][2] = 0;
                this.myMap[3][3] = 0;
                this.myMap[3][4] = 1;
                this.myMap[3][5] = 0;
                this.myMap[3][6] = 0;
                this.myMap[3][7] = 0;
                this.myMap[3][8] = 4;
                this.myMap[3][9] = 4;
                this.myMap[3][10] = 0;
                this.myMap[3][11] = 0;
                this.myMap[3][12] = 0;
                this.myMap[3][13] = 0;
                this.myMap[3][14] = 0;
                this.myMap[3][15] = 0;
                this.myMap[3][16] = 4;

                this.myMap[4][0] = 4;
                this.myMap[4][1] = 0;
                this.myMap[4][2] = 0;
                this.myMap[4][3] = 0;
                this.myMap[4][4] = 0;
                this.myMap[4][5] = 0;
                this.myMap[4][6] = 0;
                this.myMap[4][7] = 0;
                this.myMap[4][8] = 4;
                this.myMap[4][9] = 4;
                this.myMap[4][10] = 0;
                this.myMap[4][11] = 0;
                this.myMap[4][12] = 0;
                this.myMap[4][13] = 5;
                this.myMap[4][14] = 0;
                this.myMap[4][15] = 0;
                this.myMap[4][16] = 4;

                this.myMap[5][0] = 4;
                this.myMap[5][1] = 0;
                this.myMap[5][2] = 0;
                this.myMap[5][3] = 0;
                this.myMap[5][4] = 0;
                this.myMap[5][5] = 0;
                this.myMap[5][6] = 0;
                this.myMap[5][7] = 0;
                this.myMap[5][8] = 0;
                this.myMap[5][9] = 0;
                this.myMap[5][10] = 0;
                this.myMap[5][11] = 0;
                this.myMap[5][12] = 0;
                this.myMap[5][13] = 0;
                this.myMap[5][14] = 0;
                this.myMap[5][15] = 0;
                this.myMap[5][16] = 4;

                this.myMap[6][0] = 4;
                this.myMap[6][1] = 0;
                this.myMap[6][2] = 0;
                this.myMap[6][3] = 0;
                this.myMap[6][4] = 0;
                this.myMap[6][5] = 0;
                this.myMap[6][6] = 0;
                this.myMap[6][7] = 0;
                this.myMap[6][8] = 0;
                this.myMap[6][9] = 0;
                this.myMap[6][10] = 0;
                this.myMap[6][11] = 0;
                this.myMap[6][12] = 0;
                this.myMap[6][13] = 0;
                this.myMap[6][14] = 0;
                this.myMap[6][15] = 0;
                this.myMap[6][16] = 4;

                this.myMap[7][0] = 4;
                this.myMap[7][1] = 0;
                this.myMap[7][2] = 0;
                this.myMap[7][3] = 0;
                this.myMap[7][4] = 0;
                this.myMap[7][5] = 0;
                this.myMap[7][6] = 0;
                this.myMap[7][7] = 0;
                this.myMap[7][8] = 0;
                this.myMap[7][9] = 0;
                this.myMap[7][10] = 0;
                this.myMap[7][11] = 0;
                this.myMap[7][12] = 0;
                this.myMap[7][13] = 0;
                this.myMap[7][14] = 0;
                this.myMap[7][15] = 0;
                this.myMap[7][16] = 4;

                this.myMap[8][0] = 4;
                this.myMap[8][1] = 4;
                this.myMap[8][2] = 4;
                this.myMap[8][3] = 4;
                this.myMap[8][4] = 4;
                this.myMap[8][5] = 4;
                this.myMap[8][6] = 4;
                this.myMap[8][7] = 4;
                this.myMap[8][8] = 4;
                this.myMap[8][9] = 4;
                this.myMap[8][10] = 0;
                this.myMap[8][11] = 0;
                this.myMap[8][12] = 0;
                this.myMap[8][13] = 0;
                this.myMap[8][14] = 0;
                this.myMap[8][15] = 0;
                this.myMap[8][16] = 4;

                this.myMap[9][0] = 4;
                this.myMap[9][1] = 4;
                this.myMap[9][2] = 4;
                this.myMap[9][3] = 4;
                this.myMap[9][4] = 4;
                this.myMap[9][5] = 4;
                this.myMap[9][6] = 4;
                this.myMap[9][7] = 4;
                this.myMap[9][8] = 4;
                this.myMap[9][9] = 4;
                this.myMap[9][10] = 0;
                this.myMap[9][11] = 3;
                this.myMap[9][12] = 0;
                this.myMap[9][13] = 0;
                this.myMap[9][14] = 0;
                this.myMap[9][15] = 0;
                this.myMap[9][16] = 4;

                this.myMap[10][0] = 4;
                this.myMap[10][1] = 4;
                this.myMap[10][2] = 4;
                this.myMap[10][3] = 4;
                this.myMap[10][4] = 4;
                this.myMap[10][5] = 4;
                this.myMap[10][6] = 4;
                this.myMap[10][7] = 4;
                this.myMap[10][8] = 4;
                this.myMap[10][9] = 4;
                this.myMap[10][10] = 0;
                this.myMap[10][11] = 0;
                this.myMap[10][12] = 0;
                this.myMap[10][13] = 0;
                this.myMap[10][14] = 0;
                this.myMap[10][15] = 0;
                this.myMap[10][16] = 4;

                this.myMap[11][0] = 4;
                this.myMap[11][1] = 4;
                this.myMap[11][2] = 4;
                this.myMap[11][3] = 4;
                this.myMap[11][4] = 4;
                this.myMap[11][5] = 4;
                this.myMap[11][6] = 4;
                this.myMap[11][7] = 4;
                this.myMap[11][8] = 4;
                this.myMap[11][9] = 4;
                this.myMap[11][10] = 4;
                this.myMap[11][11] = 4;
                this.myMap[11][12] = 4;
                this.myMap[11][13] = 4;
                this.myMap[11][14] = 4;
                this.myMap[11][15] = 4;
                this.myMap[11][16] = 4;
                break;
                
            case 3://This is 2019
                this.myMap[0][0] = 4;
                this.myMap[0][1] = 4;
                this.myMap[0][2] = 4;
                this.myMap[0][3] = 4;
                this.myMap[0][4] = 4;
                this.myMap[0][5] = 4;
                this.myMap[0][6] = 4;
                this.myMap[0][7] = 4;
                this.myMap[0][8] = 4;
                this.myMap[0][9] = 4;
                this.myMap[0][10] = 4;
                this.myMap[0][11] = 4;
                this.myMap[0][12] = 4;
                this.myMap[0][13] = 4;
                this.myMap[0][14] = 4;
                this.myMap[0][15] = 4;
                this.myMap[0][16] = 4;

                this.myMap[1][0] = 4;
                this.myMap[1][1] = 0;
                this.myMap[1][2] = 5;
                this.myMap[1][3] = 0;
                this.myMap[1][4] = 0;
                this.myMap[1][5] = 4;
                this.myMap[1][6] = 6;
                this.myMap[1][7] = 0;
                this.myMap[1][8] = 0;
                this.myMap[1][9] = 0;
                this.myMap[1][10] = 0;
                this.myMap[1][11] = 8;
                this.myMap[1][12] = 0;
                this.myMap[1][13] = 0;
                this.myMap[1][14] = 0;
                this.myMap[1][15] = 0;
                this.myMap[1][16] = 4;

                this.myMap[2][0] = 4;
                this.myMap[2][1] = 0;
                this.myMap[2][2] = 0;
                this.myMap[2][3] = 0;
                this.myMap[2][4] = 0;
                this.myMap[2][5] = 4;
                this.myMap[2][6] = 0;
                this.myMap[2][7] = 0;
                this.myMap[2][8] = 0;
                this.myMap[2][9] = 0;
                this.myMap[2][10] = 0;
                this.myMap[2][11] = 0;
                this.myMap[2][12] = 0;
                this.myMap[2][13] = 0;
                this.myMap[2][14] = 0;
                this.myMap[2][15] = 0;
                this.myMap[2][16] = 4;

                this.myMap[3][0] = 4;
                this.myMap[3][1] = 0;
                this.myMap[3][2] = 0;
                this.myMap[3][3] = 0;
                this.myMap[3][4] = 0;
                this.myMap[3][5] = 4;
                this.myMap[3][6] = 0;
                this.myMap[3][7] = 0;
                this.myMap[3][8] = 0;
                this.myMap[3][9] = 0;
                this.myMap[3][10] = 0;
                this.myMap[3][11] = 0;
                this.myMap[3][12] = 6;
                this.myMap[3][13] = 0;
                this.myMap[3][14] = 0;
                this.myMap[3][15] = 0;
                this.myMap[3][16] = 4;

                this.myMap[4][0] = 4;
                this.myMap[4][1] = 4;
                this.myMap[4][2] = 0;
                this.myMap[4][3] = 0;
                this.myMap[4][4] = 4;
                this.myMap[4][5] = 4;
                this.myMap[4][6] = 4;
                this.myMap[4][7] = 4;
                this.myMap[4][8] = 4;
                this.myMap[4][9] = 4;
                this.myMap[4][10] = 0;
                this.myMap[4][11] = 6;
                this.myMap[4][12] = 0;
                this.myMap[4][13] = 0;
                this.myMap[4][14] = 4;
                this.myMap[4][15] = 4;
                this.myMap[4][16] = 4;

                this.myMap[5][0] = 4;
                this.myMap[5][1] = 0;
                this.myMap[5][2] = 0;
                this.myMap[5][3] = 0;
                this.myMap[5][4] = 6;
                this.myMap[5][5] = 0;
                this.myMap[5][6] = 0;
                this.myMap[5][7] = 0;
                this.myMap[5][8] = 0;
                this.myMap[5][9] = 0;
                this.myMap[5][10] = 0;
                this.myMap[5][11] = 6;
                this.myMap[5][12] = 0;
                this.myMap[5][13] = 0;
                this.myMap[5][14] = 0;
                this.myMap[5][15] = 0;
                this.myMap[5][16] = 4;

                this.myMap[6][0] = 4;
                this.myMap[6][1] = 1;
                this.myMap[6][2] = 0;
                this.myMap[6][3] = 0;
                this.myMap[6][4] = 0;
                this.myMap[6][5] = 0;
                this.myMap[6][6] = 0;
                this.myMap[6][7] = 6;
                this.myMap[6][8] = 0;
                this.myMap[6][9] = 0;
                this.myMap[6][10] = 0;
                this.myMap[6][11] = 0;
                this.myMap[6][12] = 3;
                this.myMap[6][13] = 0;
                this.myMap[6][14] = 0;
                this.myMap[6][15] = 0;
                this.myMap[6][16] = 4;

                this.myMap[7][0] = 4;
                this.myMap[7][1] = 0;
                this.myMap[7][2] = 0;
                this.myMap[7][3] = 0;
                this.myMap[7][4] = 0;
                this.myMap[7][5] = 0;
                this.myMap[7][6] = 0;
                this.myMap[7][7] = 0;
                this.myMap[7][8] = 0;
                this.myMap[7][9] = 0;
                this.myMap[7][10] = 0;
                this.myMap[7][11] = 0;
                this.myMap[7][12] = 0;
                this.myMap[7][13] = 0;
                this.myMap[7][14] = 6;
                this.myMap[7][15] = 0;
                this.myMap[7][16] = 4;

                this.myMap[8][0] = 4;
                this.myMap[8][1] = 4;
                this.myMap[8][2] = 4;
                this.myMap[8][3] = 4;
                this.myMap[8][4] = 7;
                this.myMap[8][5] = 0;
                this.myMap[8][6] = 4;
                this.myMap[8][7] = 4;
                this.myMap[8][8] = 4;
                this.myMap[8][9] = 4;
                this.myMap[8][10] = 0;
                this.myMap[8][11] = 0;
                this.myMap[8][12] = 0;
                this.myMap[8][13] = 0;
                this.myMap[8][14] = 0;
                this.myMap[8][15] = 0;
                this.myMap[8][16] = 4;

                this.myMap[9][0] = 4;
                this.myMap[9][1] = 4;
                this.myMap[9][2] = 4;
                this.myMap[9][3] = 4;
                this.myMap[9][4] = 4;
                this.myMap[9][5] = 4;
                this.myMap[9][6] = 4;
                this.myMap[9][7] = 4;
                this.myMap[9][8] = 4;
                this.myMap[9][9] = 4;
                this.myMap[9][10] = 0;
                this.myMap[9][11] = 0;
                this.myMap[9][12] = 0;
                this.myMap[9][13] = 0;
                this.myMap[9][14] = 0;
                this.myMap[9][15] = 0;
                this.myMap[9][16] = 4;

                this.myMap[10][0] = 4;
                this.myMap[10][1] = 4;
                this.myMap[10][2] = 4;
                this.myMap[10][3] = 4;
                this.myMap[10][4] = 4;
                this.myMap[10][5] = 4;
                this.myMap[10][6] = 4;
                this.myMap[10][7] = 4;
                this.myMap[10][8] = 4;
                this.myMap[10][9] = 4;
                this.myMap[10][10] = 0;
                this.myMap[10][11] = 0;
                this.myMap[10][12] = 0;
                this.myMap[10][13] = 0;
                this.myMap[10][14] = 0;
                this.myMap[10][15] = 0;
                this.myMap[10][16] = 4;

                this.myMap[11][0] = 4;
                this.myMap[11][1] = 4;
                this.myMap[11][2] = 4;
                this.myMap[11][3] = 4;
                this.myMap[11][4] = 4;
                this.myMap[11][5] = 4;
                this.myMap[11][6] = 4;
                this.myMap[11][7] = 4;
                this.myMap[11][8] = 4;
                this.myMap[11][9] = 4;
                this.myMap[11][10] = 4;
                this.myMap[11][11] = 4;
                this.myMap[11][12] = 4;
                this.myMap[11][13] = 4;
                this.myMap[11][14] = 4;
                this.myMap[11][15] = 4;
                this.myMap[11][16] = 4;
                break;
                
            case 4://THis is 2064
                this.myMap[0][0] = 4;
                this.myMap[0][1] = 4;
                this.myMap[0][2] = 4;
                this.myMap[0][3] = 4;
                this.myMap[0][4] = 4;
                this.myMap[0][5] = 4;
                this.myMap[0][6] = 4;
                this.myMap[0][7] = 4;
                this.myMap[0][8] = 4;
                this.myMap[0][9] = 4;
                this.myMap[0][10] = 4;
                this.myMap[0][11] = 4;
                this.myMap[0][12] = 4;
                this.myMap[0][13] = 4;
                this.myMap[0][14] = 4;
                this.myMap[0][15] = 4;
                this.myMap[0][16] = 4;

                this.myMap[1][0] = 4;
                this.myMap[1][1] = 0;
                this.myMap[1][2] = 0;
                this.myMap[1][3] = 0;
                this.myMap[1][4] = 4;
                this.myMap[1][5] = 0;
                this.myMap[1][6] = 0;
                this.myMap[1][7] = 5;
                this.myMap[1][8] = 0;
                this.myMap[1][9] = 0;
                this.myMap[1][10] = 4;
                this.myMap[1][11] = 0;
                this.myMap[1][12] = 0;
                this.myMap[1][13] = 0;
                this.myMap[1][14] = 0;
                this.myMap[1][15] = 0;
                this.myMap[1][16] = 4;

                this.myMap[2][0] = 4;
                this.myMap[2][1] = 0;
                this.myMap[2][2] = 0;
                this.myMap[2][3] = 0;
                this.myMap[2][4] = 4;
                this.myMap[2][5] = 0;
                this.myMap[2][6] = 0;
                this.myMap[2][7] = 0;
                this.myMap[2][8] = 0;
                this.myMap[2][9] = 0;
                this.myMap[2][10] = 4;
                this.myMap[2][11] = 0;
                this.myMap[2][12] = 0;
                this.myMap[2][13] = 3;
                this.myMap[2][14] = 0;
                this.myMap[2][15] = 0;
                this.myMap[2][16] = 4;

                this.myMap[3][0] = 4;
                this.myMap[3][1] = 6;
                this.myMap[3][2] = 0;
                this.myMap[3][3] = 0;
                this.myMap[3][4] = 4;
                this.myMap[3][5] = 0;
                this.myMap[3][6] = 0;
                this.myMap[3][7] = 0;
                this.myMap[3][8] = 0;
                this.myMap[3][9] = 0;
                this.myMap[3][10] = 4;
                this.myMap[3][11] = 0;
                this.myMap[3][12] = 0;
                this.myMap[3][13] = 6;
                this.myMap[3][14] = 0;
                this.myMap[3][15] = 0;
                this.myMap[3][16] = 4;

                this.myMap[4][0] = 4;
                this.myMap[4][1] = 0;
                this.myMap[4][2] = 0;
                this.myMap[4][3] = 0;
                this.myMap[4][4] = 4;
                this.myMap[4][5] = 4;
                this.myMap[4][6] = 0;
                this.myMap[4][7] = 0;
                this.myMap[4][8] = 0;
                this.myMap[4][9] = 4;
                this.myMap[4][10] = 4;
                this.myMap[4][11] = 0;
                this.myMap[4][12] = 0;
                this.myMap[4][13] = 0;
                this.myMap[4][14] = 0;
                this.myMap[4][15] = 0;
                this.myMap[4][16] = 4;

                this.myMap[5][0] = 4;
                this.myMap[5][1] = 0;
                this.myMap[5][2] = 0;
                this.myMap[5][3] = 6;
                this.myMap[5][4] = 0;
                this.myMap[5][5] = 0;
                this.myMap[5][6] = 0;
                this.myMap[5][7] = 0;
                this.myMap[5][8] = 0;
                this.myMap[5][9] = 0;
                this.myMap[5][10] = 0;
                this.myMap[5][11] = 6;
                this.myMap[5][12] = 0;
                this.myMap[5][13] = 0;
                this.myMap[5][14] = 0;
                this.myMap[5][15] = 0;
                this.myMap[5][16] = 4;

                this.myMap[6][0] = 4;
                this.myMap[6][1] = 1;
                this.myMap[6][2] = 0;
                this.myMap[6][3] = 0;
                this.myMap[6][4] = 0;
                this.myMap[6][5] = 0;
                this.myMap[6][6] = 0;
                this.myMap[6][7] = 0;
                this.myMap[6][8] = 0;
                this.myMap[6][9] = 0;
                this.myMap[6][10] = 0;
                this.myMap[6][11] = 0;
                this.myMap[6][12] = 0;
                this.myMap[6][13] = 0;
                this.myMap[6][14] = 0;
                this.myMap[6][15] = 0;
                this.myMap[6][16] = 4;

                this.myMap[7][0] = 4;
                this.myMap[7][1] = 3;
                this.myMap[7][2] = 0;
                this.myMap[7][3] = 0;
                this.myMap[7][4] = 0;
                this.myMap[7][5] = 0;
                this.myMap[7][6] = 0;
                this.myMap[7][7] = 6;
                this.myMap[7][8] = 0;
                this.myMap[7][9] = 0;
                this.myMap[7][10] = 0;
                this.myMap[7][11] = 0;
                this.myMap[7][12] = 0;
                this.myMap[7][13] = 0;
                this.myMap[7][14] = 0;
                this.myMap[7][15] = 0;
                this.myMap[7][16] = 4;

                this.myMap[8][0] = 4;
                this.myMap[8][1] = 0;
                this.myMap[8][2] = 0;
                this.myMap[8][3] = 0;
                this.myMap[8][4] = 4;
                this.myMap[8][5] = 0;
                this.myMap[8][6] = 0;
                this.myMap[8][7] = 0;
                this.myMap[8][8] = 0;
                this.myMap[8][9] = 0;
                this.myMap[8][10] = 4;
                this.myMap[8][11] = 0;
                this.myMap[8][12] = 0;
                this.myMap[8][13] = 0;
                this.myMap[8][14] = 0;
                this.myMap[8][15] = 0;
                this.myMap[8][16] = 4;

                this.myMap[9][0] = 4;
                this.myMap[9][1] = 0;
                this.myMap[9][2] = 0;
                this.myMap[9][3] = 0;
                this.myMap[9][4] = 4;
                this.myMap[9][5] = 0;
                this.myMap[9][6] = 0;
                this.myMap[9][7] = 8;
                this.myMap[9][8] = 0;
                this.myMap[9][9] = 0;
                this.myMap[9][10] = 4;
                this.myMap[9][11] = 0;
                this.myMap[9][12] = 0;
                this.myMap[9][13] = 0;
                this.myMap[9][14] = 6;
                this.myMap[9][15] = 0;
                this.myMap[9][16] = 4;

                this.myMap[10][0] = 4;
                this.myMap[10][1] = 4;
                this.myMap[10][2] = 4;
                this.myMap[10][3] = 4;
                this.myMap[10][4] = 4;
                this.myMap[10][5] = 4;
                this.myMap[10][6] = 4;
                this.myMap[10][7] = 4;
                this.myMap[10][8] = 4;
                this.myMap[10][9] = 4;
                this.myMap[10][10] = 4;
                this.myMap[10][11] = 4;
                this.myMap[10][12] = 4;
                this.myMap[10][13] = 4;
                this.myMap[10][14] = 4;
                this.myMap[10][15] = 4;
                this.myMap[10][16] = 4;

                this.myMap[11][0] = 4;
                this.myMap[11][1] = 4;
                this.myMap[11][2] = 4;
                this.myMap[11][3] = 4;
                this.myMap[11][4] = 4;
                this.myMap[11][5] = 4;
                this.myMap[11][6] = 4;
                this.myMap[11][7] = 4;
                this.myMap[11][8] = 4;
                this.myMap[11][9] = 4;
                this.myMap[11][10] = 4;
                this.myMap[11][11] = 4;
                this.myMap[11][12] = 4;
                this.myMap[11][13] = 4;
                this.myMap[11][14] = 4;
                this.myMap[11][15] = 4;
                this.myMap[11][16] = 4;
                break;
                
            case 5://This is 3065
                 this.myMap[0][0] = 4;
                this.myMap[0][1] = 4;
                this.myMap[0][2] = 4;
                this.myMap[0][3] = 4;
                this.myMap[0][4] = 4;
                this.myMap[0][5] = 4;
                this.myMap[0][6] = 4;
                this.myMap[0][7] = 4;
                this.myMap[0][8] = 4;
                this.myMap[0][9] = 4;
                this.myMap[0][10] = 4;
                this.myMap[0][11] = 4;
                this.myMap[0][12] = 4;
                this.myMap[0][13] = 4;
                this.myMap[0][14] = 4;
                this.myMap[0][15] = 4;
                this.myMap[0][16] = 4;

                this.myMap[1][0] = 4;
                this.myMap[1][1] = 0;
                this.myMap[1][2] = 0;
                this.myMap[1][3] = 0;
                this.myMap[1][4] = 4;
                this.myMap[1][5] = 0;
                this.myMap[1][6] = 0;
                this.myMap[1][7] = 5;
                this.myMap[1][8] = 0;
                this.myMap[1][9] = 0;
                this.myMap[1][10] = 4;
                this.myMap[1][11] = 0;
                this.myMap[1][12] = 0;
                this.myMap[1][13] = 0;
                this.myMap[1][14] = 0;
                this.myMap[1][15] = 0;
                this.myMap[1][16] = 4;

                this.myMap[2][0] = 4;
                this.myMap[2][1] = 0;
                this.myMap[2][2] = 0;
                this.myMap[2][3] = 0;
                this.myMap[2][4] = 4;
                this.myMap[2][5] = 0;
                this.myMap[2][6] = 0;
                this.myMap[2][7] = 0;
                this.myMap[2][8] = 0;
                this.myMap[2][9] = 0;
                this.myMap[2][10] = 4;
                this.myMap[2][11] = 0;
                this.myMap[2][12] = 0;
                this.myMap[2][13] = 3;
                this.myMap[2][14] = 0;
                this.myMap[2][15] = 0;
                this.myMap[2][16] = 4;

                this.myMap[3][0] = 4;
                this.myMap[3][1] = 6;
                this.myMap[3][2] = 0;
                this.myMap[3][3] = 0;
                this.myMap[3][4] = 4;
                this.myMap[3][5] = 0;
                this.myMap[3][6] = 0;
                this.myMap[3][7] = 0;
                this.myMap[3][8] = 0;
                this.myMap[3][9] = 0;
                this.myMap[3][10] = 4;
                this.myMap[3][11] = 0;
                this.myMap[3][12] = 0;
                this.myMap[3][13] = 6;
                this.myMap[3][14] = 0;
                this.myMap[3][15] = 0;
                this.myMap[3][16] = 4;

                this.myMap[4][0] = 4;
                this.myMap[4][1] = 0;
                this.myMap[4][2] = 0;
                this.myMap[4][3] = 0;
                this.myMap[4][4] = 4;
                this.myMap[4][5] = 4;
                this.myMap[4][6] = 0;
                this.myMap[4][7] = 0;
                this.myMap[4][8] = 0;
                this.myMap[4][9] = 4;
                this.myMap[4][10] = 4;
                this.myMap[4][11] = 0;
                this.myMap[4][12] = 0;
                this.myMap[4][13] = 0;
                this.myMap[4][14] = 0;
                this.myMap[4][15] = 0;
                this.myMap[4][16] = 4;

                this.myMap[5][0] = 4;
                this.myMap[5][1] = 0;
                this.myMap[5][2] = 0;
                this.myMap[5][3] = 6;
                this.myMap[5][4] = 0;
                this.myMap[5][5] = 0;
                this.myMap[5][6] = 0;
                this.myMap[5][7] = 0;
                this.myMap[5][8] = 0;
                this.myMap[5][9] = 0;
                this.myMap[5][10] = 0;
                this.myMap[5][11] = 6;
                this.myMap[5][12] = 0;
                this.myMap[5][13] = 0;
                this.myMap[5][14] = 0;
                this.myMap[5][15] = 0;
                this.myMap[5][16] = 4;

                this.myMap[6][0] = 4;
                this.myMap[6][1] = 1;
                this.myMap[6][2] = 0;
                this.myMap[6][3] = 0;
                this.myMap[6][4] = 0;
                this.myMap[6][5] = 0;
                this.myMap[6][6] = 0;
                this.myMap[6][7] = 0;
                this.myMap[6][8] = 0;
                this.myMap[6][9] = 0;
                this.myMap[6][10] = 0;
                this.myMap[6][11] = 0;
                this.myMap[6][12] = 0;
                this.myMap[6][13] = 0;
                this.myMap[6][14] = 0;
                this.myMap[6][15] = 0;
                this.myMap[6][16] = 4;

                this.myMap[7][0] = 4;
                this.myMap[7][1] = 3;
                this.myMap[7][2] = 0;
                this.myMap[7][3] = 0;
                this.myMap[7][4] = 0;
                this.myMap[7][5] = 0;
                this.myMap[7][6] = 0;
                this.myMap[7][7] = 6;
                this.myMap[7][8] = 0;
                this.myMap[7][9] = 0;
                this.myMap[7][10] = 0;
                this.myMap[7][11] = 0;
                this.myMap[7][12] = 0;
                this.myMap[7][13] = 0;
                this.myMap[7][14] = 0;
                this.myMap[7][15] = 0;
                this.myMap[7][16] = 4;

                this.myMap[8][0] = 4;
                this.myMap[8][1] = 0;
                this.myMap[8][2] = 0;
                this.myMap[8][3] = 0;
                this.myMap[8][4] = 4;
                this.myMap[8][5] = 0;
                this.myMap[8][6] = 0;
                this.myMap[8][7] = 0;
                this.myMap[8][8] = 0;
                this.myMap[8][9] = 0;
                this.myMap[8][10] = 4;
                this.myMap[8][11] = 0;
                this.myMap[8][12] = 0;
                this.myMap[8][13] = 0;
                this.myMap[8][14] = 0;
                this.myMap[8][15] = 0;
                this.myMap[8][16] = 4;

                this.myMap[9][0] = 4;
                this.myMap[9][1] = 0;
                this.myMap[9][2] = 0;
                this.myMap[9][3] = 0;
                this.myMap[9][4] = 4;
                this.myMap[9][5] = 0;
                this.myMap[9][6] = 0;
                this.myMap[9][7] = 8;
                this.myMap[9][8] = 0;
                this.myMap[9][9] = 0;
                this.myMap[9][10] = 4;
                this.myMap[9][11] = 0;
                this.myMap[9][12] = 0;
                this.myMap[9][13] = 0;
                this.myMap[9][14] = 6;
                this.myMap[9][15] = 0;
                this.myMap[9][16] = 4;

                this.myMap[10][0] = 4;
                this.myMap[10][1] = 4;
                this.myMap[10][2] = 4;
                this.myMap[10][3] = 4;
                this.myMap[10][4] = 4;
                this.myMap[10][5] = 4;
                this.myMap[10][6] = 4;
                this.myMap[10][7] = 4;
                this.myMap[10][8] = 4;
                this.myMap[10][9] = 4;
                this.myMap[10][10] = 4;
                this.myMap[10][11] = 4;
                this.myMap[10][12] = 4;
                this.myMap[10][13] = 4;
                this.myMap[10][14] = 4;
                this.myMap[10][15] = 4;
                this.myMap[10][16] = 4;

                this.myMap[11][0] = 4;
                this.myMap[11][1] = 4;
                this.myMap[11][2] = 4;
                this.myMap[11][3] = 4;
                this.myMap[11][4] = 4;
                this.myMap[11][5] = 4;
                this.myMap[11][6] = 4;
                this.myMap[11][7] = 4;
                this.myMap[11][8] = 4;
                this.myMap[11][9] = 4;
                this.myMap[11][10] = 4;
                this.myMap[11][11] = 4;
                this.myMap[11][12] = 4;
                this.myMap[11][13] = 4;
                this.myMap[11][14] = 4;
                this.myMap[11][15] = 4;
                this.myMap[11][16] = 4;
                break;
        }//end switch

    }//end initMap

    public void Notes(Scanner in){
        System.out.println("You ran into a note... Do you want to read it?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        int note = in.nextInt();
        
        if(note == 1){
            System.out.println("--------------------------------------------");
            switch(timePeriod){
                case 1:
                    System.out.println("September 11th\n"
                                      +"The reason I took you is a reason you may never understand. That reason does not\n"
                                      +"seem very important at the moment but I am here to help you get back to 2019..\n"
                                      +"");
                    break;
                case 2:
                    System.out.println("This is a note from 1968");
                    break;
                case 3:
                    System.out.println("This is a note from 2019");
                    break;
                case 4:
                    System.out.println("This is a note from 2064");
                    break;
                case 5:
                    System.out.println("This is a note from 3065");
                    break;
            }
            testDriver.promptEnterKey();
            System.out.println("--------------------------------------------");
        }
    }//end of Notes
}
