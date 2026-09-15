package com.example.template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {

    @FXML
    public Label lblDisplay;
    @FXML
    public TextField txtInput;
    public TextField positiontxt;

    //mutator
    // do prime factorization

    private int[] nums = new int[10];
    private ArrayList<Integer> nums2 = new ArrayList<>();
    public void handleClick(ActionEvent actionEvent) {
        for (int i = 0; i<10; i++){
            nums2.add((int)(Math.random()*10+1));
        }
        System.out.println(nums2);




    }

    public void handlereplace() {
        System.out.println(replace());
    }



    public void handleadd(ActionEvent actionEvent) {
        System.out.println(add());
    }

    public ArrayList<Integer> add() {
        if
        int position = Integer.parseInt(positiontxt.getText());
        int num = Integer.parseInt(txtInput.getText());
        nums2.add(position,num);
        return nums2;
    }


    public ArrayList<Integer> replace() {
        int position = Integer.parseInt(positiontxt.getText());
        int num = Integer.parseInt(txtInput.getText());
        nums2.set(position, num);
        return nums2;
    }


    //userchose if they want to add a number at a location or replace










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




    public boolean primefactorizaion(int number){
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




   //look for aray for randnum and if has print arrays
    //generate arrays with armdmun



    public ArrayList<Integer> searcharray(){
        int[] nums = new int[10];
        ArrayList<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i<10; i++){
            nums[i]=(int)(Math.random()*10+1);
        }
        for (int i=0; i < nums.length;i++){
            System.out.print(nums[i]+",");
        }
        System.out.println("");
        int randnum = (int)(Math.random()*10+1);
        System.out.println(randnum);
        for (int i = 0; i<nums.length; i++){
            if (nums[i]== randnum){
                System.out.println(i);
                nums2.add(i);
            }

        }
        return nums2;

    }

    public void printarrayInts(int[] array){
        System.out.print("[");
        for (int i=0; i < array.length;i++){
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(",");
            }

        }
        System.out.print("]");
        System.out.println();

    }





    public String generatedivison(){
        int numerator = Randnum(1,100);
        int denominator = Randnum(1,100);
        while(!divide(numerator, denominator)){
            denominator = Randnum(1,numerator);

        }
        return (numerator + "/" + denominator);
    }
    public static String expandNumber(int num) {
        String result = "";
        int placeValue = 1;

        while (placeValue * 10 <= num) {
            placeValue *= 10;
        }

        while (placeValue >= 1) {
            int digit = (num / placeValue) % 10;

            if (digit != 0) {
                if (!result.equals("")) {
                    result += " + ";
                }
                result += (digit * placeValue);
            }

            placeValue /= 10;
        }

        return result;
    }


    public boolean divide(int num1, int num2){
        return num1%num2 == 0;
    }

    public int Randnum(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }



}