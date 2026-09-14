package com.example.template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.reflect.Array;

public class HelloController {

    @FXML
    public Label lblDisplay;
    @FXML
    public TextField txtInput;

    //mutator
    // do prime factorization
    public void handleClick(ActionEvent actionEvent) {

    }





    public int roll(){

    }





// how many of any given substring in a string
    // how many of any give char in
    public boolean inString(String x, String a){
        int test = 0;
        x = x.toLowerCase();
        while (test < x.length()){
//            if (x.charAt(test) == a){
//                return true;
//            }
            String b = x.substring(test,test+1);
            if (b.equals(a)){
                return true;
            }
            test++;

        }
        return false;
    }

    public int howManyinString(String x, String a){
        int test = 0;
        int num = 0;
        while (test < x.length()){
//            if (x.charAt(test) == a){
//                return true;
//            }
            x= x.toLowerCase();
            String b = x.substring(test,test+1);
            if (b.equals(a)){
                num++;
            }
            test++;

        }
        return num;
    }


    public int howManySinS(String x, String a){
        int loc = x.indexOf("t");
        int num = 0;
        String b = x.toLowerCase();
        String c = "A";

        while (loc != -1){

            c = b.substring(loc,loc+3);

            if (c.contains(a)){
                num++;
            }
            b = b.substring(loc+1);
            if (b.contains("t")){
                loc = b.indexOf("t");
            }else{
                loc = -1;
            }



        }
        return num;
    }


    public String primefactor(int a){
        String prime = "";
        for (int i = 2; i <= a; i++) {
            while (a % i == 0) {
                prime += i;
                a /= i;
            }
        }
        return prime;
    }




    public boolean prime(int number){
        if(number<2){
            return false;
        }
        int test = 2;
        while (test < Math.sqrt(number)){

            if(number%test == 0){
                return false;
            }
            test++;

        }
        return true;
    }




    public String generatedivison(){
        int numerator = Randnum(1,100);
        int denominator = Randnum(1,100);
        while(!divide(numerator, denominator)){
            denominator = Randnum(1,numerator);

        }
        return (numerator + "/" + denominator);
    }


    public boolean divide(int num1, int num2){
        return num1%num2 == 0;
    }

    public int Randnum(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }


}