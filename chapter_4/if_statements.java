package chapter_4;

public class if_statements {
    public static void main(String[] args) {
        int userval = 0;
        int itemDiscount;


        if (userval == 62) {
            itemDiscount = 15 ;
        }
        else {
            itemDiscount = 0;
        }

        if (numPeoples== 10) {
            groupSize = 2 * groupSize;
        }
        else {
            groupSize = 3* groupSize
            numPeoples -=1 
        }

        if (numPlayer != 11) {
            teamSize = 11;
        }
        else {
            teamSize = numPlayer;
        }
        teamSize = 2 * teamSize
    }

    if (givenYear<=1900) {
        System.out.println("Long ago");
    }
    else if (givenYear <=2000) {
        System.out.println("20th century");
    }

    else if (givenYear <=2100) {
        System.out.println("21st century");
    }

    else {
        System.out.println("Distant future" );
    }



    
}
