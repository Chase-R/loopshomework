package com.example.template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {

    @FXML
    public Label lblDisplay;
    @FXML
    public TextField txtrolls;
    public TextField diceside;
    public TextField dicenum;
    public ListView wordListView;

    //mutator
    // do prime factorization

    private int[] nums = new int[10];
    private ArrayList<Integer> nums2 = new ArrayList<>();
    private ArrayList<Integer> nums3 = new ArrayList<>();
    private ArrayList<Integer> nums4 = new ArrayList<>();
    private ArrayList<Boolean> bool1 = new ArrayList<>();
    private ArrayList<Boolean> bool2 = new ArrayList<>();
    public  ArrayList<Character> chararray = new ArrayList<>();
    public  ArrayList<Character> codearray = new ArrayList<>();
    private boolean[] lockers = new boolean[100];
    private String[] words =  new String[30];


    public void handleClick(ActionEvent actionEvent) {
        //encode(dicenum.getText().toLowerCase());
        String[] words = {
                "apple",
                "application",
                "apply",
                "app",
                "animal",
                "answer",
                "another",
                "back",
                "basket",
                "bathroom",
                "book",
                "books",
                "birthday",
                "blue",
                "black",
                "car",
                "card",
                "care",
                "cat",
                "catch",
                "computer",
                "come",
                "complete",
                "day",
                "dark",
                "door",
                "dog",
                "school",
                "schoolwork",
                "science"
        };


        for (int i = 0; i<100; i++){
            lockers[i] = false;
        }
        for (int i = 0; i<100; i++){
            System.out.print(lockers[i]+",");
        }
        System.out.println(" ");
        locker();


//        System.out.println(nums4);
//        bool1.add(false);
//        bool1.add(true);
//        bool1.add(false);
//        bool1.add(false);
//        bool1.add(false);
//        bool1.add(true);
//        bool1.add(true);
//        bool1.add(false);
//        bool1.add(true);
//        bool1.add(false);
//
//
//        for (int i = bool1.size()-1; i>=0; i--){
//            if (bool1.get(i) == true){
//                nums4.remove(i);
//            }
//        }
//        System.out.println(bool1);
//        System.out.println(nums4);

        //encoding system
        //[a,b,c,d....]
        //[!,@.#,$....]
        //encode using this system




    }

    public void locker() {
        for (int i = 1; i <= 100; i++) {


            for (int x = 1; x <= 100; x++) {


                if (x % i == 0) {

                    // Toggle the locker
                    if (lockers[x - 1]) {
                        lockers[x - 1] = false;
                    } else {
                        lockers[x - 1] = true;
                    }
                }
            }


            for (int q = 0; q < 100; q++) {
                System.out.print(lockers[q] + ",");
            }

            System.out.println(" ");
        }


        for (int i = 0; i < 100; i++) {
            System.out.print(lockers[i] + ",");
        }

        System.out.println(" ");
    }

    public void encode(String x) {
        for (int i = 97; i < 123; i++) {
            chararray.add((char)i);
        }

        for (int i = 37; i < 63; i++) {
            codearray.add((char)i);
        }

        System.out.println(chararray);
        System.out.println(codearray);

        String encoded = "";

        for (int i = 0; i < x.length(); i++) {

            if (x.charAt(i) == ' ') {
                encoded += " ";

            } else {
                for (int j = 0; j < chararray.size(); j++) {

                    if (x.charAt(i) == chararray.get(j)) {
                        encoded += codearray.get(j);
                    }
                }
            }

            System.out.println(encoded);
        }
    }
    //when start dialing number or num it cmes up automatically
    //array of 30 words make sure parts of words over lap
    //code so when they start typing it shows all possible words
    // uses list view
    //


    public void Removefromarray(){
        ArrayList<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("c");
        letters.add("a");
        letters.add("a");
        letters.add("d");
        letters.add("q");
        letters.add("i");
        System.out.println(letters);
        String removei = "a";
        for (int i=letters.size()-1; i >=0; i--){
            if (letters.get(i).equals(removei)){
                letters.remove(removei);

            }
        }
        System.out.println(letters);

    }


//    public ArrayList<String> removestring(String item){
//        int insatance = 0;
//        for (int i = 0; i<nums5.toArray().length; i++){
//            if (nums5.get(i).equals(item)){
//                insatance++;
//                nums5.remove(i);
//            }
//        }
//        System.out.println(insatance);
//        return nums5;
//    }

    public ArrayList<Integer> RemoveInt(int item){
        int insatance = 0;
        for (int i = nums4.size()-1; i>=0; i--){
            if (nums4.get(i) == item){
                insatance++;
                nums4.remove(i);
            }
        }
        System.out.println(insatance);
        return nums4;
    }



    public void diceroll(){
        for (int i = 0; i<(Integer.parseInt(diceside.getText())*(Integer.parseInt(txtrolls.getText()))); i++){
            int roll = 0;
            for (int x = 0; x<Integer.parseInt(dicenum.getText()); x++){
                roll += Randnum(1,Integer.parseInt(diceside.getText()));
            }

            nums2.add(roll);
        }
        System.out.println(nums2);
        for (int i = 0; i<Integer.parseInt(txtrolls.getText()); i++){
            nums3.add(0);
        }
        System.out.println(nums3);

        for (int i =0; i<nums2.toArray().length;i++){
            nums3.set(nums2.get(i),nums3.get(nums2.get(i))+1);

//            for (int x=1;x<=12;x++){
//                if(nums2.get(i) ==x){
//                    nums3.set(x,nums3.get(x)+1);
//                }
//            }

        }
        System.out.println(nums3);
    }

    public void handlereplace() {
        System.out.println("no");
    }



    public void handleadd(ActionEvent actionEvent) {
        System.out.println("no");
    }

//    public ArrayList<Integer> add() {
//        int position = Integer.parseInt(positiontxt.getText());
//        int num = Integer.parseInt(txtInput.getText());
//        nums2.add(position,num);
//        return nums2;
//    }
//
//
//    public ArrayList<Integer> replace() {
//        int position = Integer.parseInt(positiontxt.getText());
//        int num = Integer.parseInt(txtInput.getText());
//        nums2.set(position, num);
//        return nums2;
//    }


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