package com.example.adrin.location;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Adrián on 29/01/2017.
 */

public class partidaEuropa {

    //Roma, Madrid, Paris.

    public void main (String args[]){

        int num = getNum(1,3);
        llamadaPais(num);
    }

    void llamadaPais(int num){

        switch(num) {

            case 1:
                System.out.println("Roma");
                break;
            case 2:
                System.out.println("Madrid");
                break;
            case 3:
                System.out.println("Paris");
                break;
            default:
                System.out.println("Error");
        }
    }

    int getNum (int min,int max){
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + min);
        return randomNum;
    }

}
