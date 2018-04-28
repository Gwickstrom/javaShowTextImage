import java.lang.System;
import java.util.Collection;
import java.util.ArrayList;
import java.io.*;
import java.text.Format;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.List;
import java.util.ListIterator;



public class Picture{

    //(Attempting to update the entire image
    public String formPicture(String base, String edge, String lowerPole, String upperPole){
        //DECLARING PICTURE
        Picture pic = new Picture();
        //CREATE DOUBLE
        String pic6 = pic.createDouble();
        return pic6;
    }
    //Method attemptiing to use nested for loops to split the prints to one half of the screen (left/right) and render the text from the inside out
    public String createDouble(){
        //DECLARING PICTURE
        Picture pic3 = new Picture();
        String base1 = " \" ";
        String base2 = ":";
        String edge1 = "|";
        String edge2 = "/";
        String edge3 = "\\";
        String edge4 = "_";
        String lowerPole1 = "|";
        String upperPole1 = "|";
        String[] arr = {base1, base2, edge1, edge2};

        for(int i = 1; i <= 1; i++){
            System.out.printf(edge1);
            for(int j = 1; j <= 10; j++){
                System.out.printf(base1);
            }
            System.out.printf(edge1);
        }


        // for(int w = 1; w <= 1; w++){
        //     for(int v = 1; v <= 1; v++){
        //     System.out.printf(edge1);
        //     // System.out.printf("cd-e");
        //     }
        // }


        return null;

        //example of working for loop

    }

    //Method attemptiing to use for loops to create the pole part of the picture.
    public static String pole(String pole1, String lrgpole){
        pole1 = "||";
        lrgpole = "||||";
        for (int k = 1; k <= 1; k++) {
            for (int l = 1; l <= 2; l++) {
            System.out.println(pole1);
            }
        }
        for (int q = 1; q <= 1; q++) {
            for (int t = 1; t <= 2; t++) {
            System.out.println(lrgpole);
            }
        }
        return null;
    }


    //Method attemptiing to use nested for loops create base of the structure
    public static String base(String base, String edge){
        base = " \" ";
        edge = "|";
        int[] arr = new int[100];
        Picture pic5 = new Picture();
        for (int m = 1; m <= 1; m++) {
            for (int n = 1; n <= 2; n++) {
                if(arr[n] == (arr.length - 1)){
                    System.out.printf(edge);
                } else {
                    System.out.printf(base);
                }
            }
            System.out.println();
        }
        return null;


    }
    //Method attemptiing to use nested for loops create lowerTower of the structure
    public static String lowerTower(String lowerbase, String loweredge){
        Picture pic6 = new Picture();
        lowerbase = " \" ";
        loweredge = "|";
        int[] arr = new int[100];
        Picture pic5 = new Picture();
        for (int o = 1; o <= 1  ; o++) {
            for (int s = 1; s <= 2; s++) {
                if(arr[s] == (arr.length - 1)){
                    System.out.printf(loweredge);
                } else {
                    System.out.printf(lowerbase);
                }
            }
            System.out.println();
        }
        return null;


    }
    //Possible Method attemptiing to center the text
    public static String center(String text, int len){
        String out = String.format("%"+len+"s%s%"+len+"s", "",text,"");
        float mid = (out.length()/2);
        float start = mid - (len/2);
        float end = start + len;
        return out.substring((int)start, (int)end);


    }
}
