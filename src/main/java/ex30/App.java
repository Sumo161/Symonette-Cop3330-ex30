package ex30;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nyles Symonette
 */

public class App {
    public static void main(String[] args){

        //set loops for both row &
        // implement consistent variable w/ spacing 
        for (int row = 1; row <= 12; row++){
            for( int column = 1; column <= 12; column++){
                System.out.print(row * column + "\t");
            }
            System.out.println();
        }
    }
}
