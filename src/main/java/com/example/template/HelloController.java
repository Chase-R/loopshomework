package com.example.template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

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
    //SIMULATION
    //happy meal
    //goal is to be mcdonald happy mea pirze colector
    //collect all prizes and they are random
    //how many timws go to mcdonalds to fing
    //how many of each prize doyou have
    //avg number it takes to get all prizes
    //random chances like im app purchase
    //thigs have diference chances
    //profit margins
    //some prizes are rarer
    //one with equa and one with unequal



    //for homework do 2 array list
    //prizes[0,0,0,0]
    //[5,30,50,15]
    //likly hood[5,35.85,100]
    // if less then first item the prize 1 else if less then second ad so on

    private int[] nums = new int[10];
    private ArrayList<Integer> nums2 = new ArrayList<>();
    private ArrayList<Integer> nums3 = new ArrayList<>();
    private ArrayList<Integer> nums4 = new ArrayList<>();
    private ArrayList<Boolean> bool1 = new ArrayList<>();
    private ArrayList<Boolean> bool2 = new ArrayList<>();
    public  ArrayList<Character> chararray = new ArrayList<>();
    public  ArrayList<Character> codearray = new ArrayList<>();
    private boolean[] lockers = new boolean[100];
    private boolean[] realhavetoy = new boolean[10];
    private int[] realnumoftoy = new int[10];
    ArrayList<String> words = new ArrayList<>();

    public void handleClick(ActionEvent actionEvent) {
      //  printarrayInts(HappyMealEqual(Integer.parseInt(dicenum.getText())));
        happyMeal();
        printarrayInts(realnumoftoy);

//        words.clear();
//        addwords();
        //encode(dicenum.getText().toLowerCase());



//        for (int i = 0; i<100; i++){
//            lockers[i] = false;
//        }
//        for (int i = 0; i<100; i++){
//            System.out.print(lockers[i]+",");
//        }
//        System.out.println(" ");
//        locker();


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

    public int[] HappyMealEqual(int prizes) {
        boolean[] havetoy = new boolean[prizes];
        int[] numoftoy = new int[prizes];
        int i = 0;
        while (!haveAllToys(havetoy)) {
            i += 1;
            int randnum = (int) (Math.random() * prizes) + 1;

            havetoy[randnum - 1] = true;
            numoftoy[randnum - 1] += 1;
        }

        System.out.println(i);
        return numoftoy;





    }

    public void happyMeal(){
        int i = 0;
        while (!haveAllToys(realhavetoy)) {
            i+=1;
            int toy = toyPicker();

            realhavetoy[toy - 1] = true;
            realnumoftoy[toy - 1] += 1;

        }

        System.out.println(i);
    }


    public boolean haveAllToys(boolean[] toys) {
        for (boolean hasToy : toys) {
            if (!hasToy) {
                return false;
            }
        }

        return true;
    }


    public int toyPicker(){
        int toy = 0;

        int randNum = (int)(Math.random() * 100) + 1;

        if (randNum <= 30) {
            toy = 1;
        } else if (randNum <= 50) {
            toy = 2;
        } else if (randNum <= 65) {
            toy = 3;
        } else if (randNum <= 75) {
            toy = 4;
        } else if (randNum <= 82) {
            toy = 5;
        } else if (randNum <= 88) {
            toy = 6;
        } else if (randNum <= 93) {
            toy = 7;
        } else if (randNum <= 96) {
            toy = 8;
        } else if (randNum <= 99) {
            toy = 9;
        } else {
            toy = 10;
        }
        return toy;
    }





    public void contact(KeyEvent keyEvent) {

//        wordListView.getItems().clear();
//        String compare = dicenum.getText().toLowerCase();
//        for (int i = 0; i<words.size();i++){
//            if(words.get(i).startsWith(compare) ){
//                wordListView.getItems().add(words.get(i));
//            }
//        }

    }

//    public void addwords() {
//        words.addAll(Arrays.asList(
//                    "app", "apple", "apples", "application", "apply",
//                    "applying", "appointment", "approach", "approve", "approval",
//
//                    "ban", "banana", "band", "bandage", "bank",
//                    "banking", "basket", "basketball", "battle", "battery",
//
//                    "car", "card", "care", "career", "careful",
//                    "carry", "cart", "cartoon", "case", "castle",
//
//                    "com", "come", "computer", "computing", "company",
//                    "compare", "complete", "completed", "complex", "communication",
//
//                    "run", "runner", "running", "runway", "runt",
//                    "rush", "rushing", "rule", "ruler", "room",
//
//                    "test", "testing", "tested", "tester", "text",
//                    "textbook", "team", "teacher", "teach", "technology",
//
//                    "game", "games", "gaming", "gamer", "garden",
//                    "garage", "gas", "gate", "gift", "girl",
//
//                    "play", "player", "playing", "played", "plane",
//                    "planet", "plant", "plastic", "place", "platform",
//
//                    "school", "science", "scientist", "score", "screen",
//                    "search", "season", "second", "security", "software",
//
//                    "math", "matter", "material", "match", "machine",
//                    "market", "manager", "maximum", "memory", "message",
//
//                    "answer", "area", "around", "another", "anything",
//                    "always", "amount", "average", "book", "ball",
//
//                    "box", "blue", "big", "building", "business",
//                    "button", "brother", "break", "class", "clean",
//
//                    "close", "code", "coding", "color", "college",
//                    "control", "course", "create", "data", "database",
//
//                    "day", "decision", "design", "developer", "development",
//                    "different", "document", "door", "easy", "education",
//
//                    "electric", "element", "else", "email", "energy",
//                    "engine", "engineering", "example", "family", "fast",
//
//                    "father", "field", "final", "find", "finish",
//                    "first", "food", "football", "general", "get",
//
//                    "give", "glass", "go", "great", "green",
//                    "group", "grow", "growth", "hand", "happy",
//
//                    "hard", "head", "health", "help", "home",
//                    "house", "human", "hundred", "idea", "important",
//
//                    "information", "input", "inside", "internet", "item",
//                    "interest", "interesting", "into", "job", "join",
//
//                    "jump", "key", "keyboard", "kind", "know",
//                    "language", "large", "learn", "learning", "level",
//
//                    "library", "life", "light", "main", "make",
//                    "many", "map", "model", "money", "month",
//
//                    "name", "natural", "number", "network", "new",
//                    "next", "night", "object", "office", "open",
//
//                    "operation", "option", "order", "paper", "parent",
//                    "part", "people", "person", "picture", "program",
//
//                    "programming", "question", "quick", "read", "reader",
//                    "real", "reason", "record", "red", "result",
//
//                    "return", "right", "road", "robot", "rock",
//                    "simple", "size", "skill", "small", "space",
//
//                    "start", "state", "step", "student", "system",
//                    "table", "thing", "think", "time", "today",
//
//                    "tool", "under", "understand", "use", "user",
//                    "using", "value", "variable", "version", "video",
//
//                    "view", "wait", "walk", "water", "website",
//                    "window", "year", "yellow", "yes", "young",
//
//                    "your", "zero", "zone"
//            ));
//        words.addAll(Arrays.asList(
//                // A
//                "able", "about", "above", "accept", "access",
//                "account", "action", "active", "actual", "add",
//                "address", "adjust", "adventure", "after", "again",
//                "against", "age", "agree", "ahead", "allow",
//                "almost", "alone", "along", "already", "also",
//                "although", "always", "amazing", "among", "animal",
//                "answer", "anyone", "anything", "appear", "area",
//                "arm", "arrive", "article", "artist", "ask",
//                "available", "away",
//
//                // B
//                "back", "background", "bad", "balance", "ball",
//                "bank", "base", "basic", "basket", "beautiful",
//                "because", "become", "before", "begin", "behind",
//                "believe", "best", "better", "between", "beyond",
//                "bike", "bird", "black", "block", "blue",
//                "board", "body", "book", "both", "bottom",
//                "box", "boy", "break", "bring", "brother",
//                "build", "building", "business", "button",
//
//                // C
//                "call", "camera", "camp", "can", "capital",
//                "car", "card", "care", "career", "carry",
//                "case", "catch", "cause", "center", "certain",
//                "change", "character", "check", "child", "choose",
//                "city", "class", "clean", "clear", "close",
//                "code", "coding", "college", "color", "come",
//                "common", "company", "complete", "computer",
//                "connect", "control", "correct", "course",
//                "create", "creative", "current",
//
//                // D
//                "daily", "dance", "danger", "data", "database",
//                "day", "deal", "decide", "decision", "deep",
//                "degree", "develop", "developer", "development",
//                "different", "difficult", "direct", "direction",
//                "discover", "distance", "do", "doctor", "dog",
//                "door", "down", "draw", "dream", "drive",
//                "during",
//
//                // E
//                "each", "early", "easy", "education", "effect",
//                "eight", "else", "email", "end", "energy",
//                "engine", "engineer", "engineering", "enough",
//                "enter", "entire", "environment", "especially",
//                "even", "event", "every", "everyone", "everything",
//                "example", "experience", "explain", "eye",
//
//                // F
//                "face", "fact", "family", "far", "fast",
//                "father", "favorite", "feature", "feel", "field",
//                "figure", "file", "fill", "final", "find",
//                "fine", "finish", "fire", "first", "fish",
//                "five", "floor", "follow", "football", "force",
//                "form", "four", "free", "friend", "from",
//                "front", "full", "function", "future",
//
//                // G
//                "game", "garden", "gas", "gate", "general",
//                "get", "girl", "give", "glass", "go",
//                "goal", "good", "government", "grade", "great",
//                "green", "group", "grow", "growth", "guess",
//                "guide",
//
//                // H
//                "hair", "half", "hand", "happen", "happy",
//                "hard", "head", "health", "hear", "heart",
//                "help", "high", "history", "home", "hope",
//                "house", "however", "human", "hundred",
//
//                // I
//                "idea", "identify", "image", "important", "include",
//                "information", "input", "inside", "instead", "interest",
//                "interesting", "internet", "into", "issue", "item",
//
//                // J
//                "job", "join", "jump", "just",
//
//                // K
//                "keep", "key", "keyboard", "kind", "know",
//                "knowledge",
//
//                // L
//                "language", "large", "last", "late", "later",
//                "learn", "learning", "left", "level", "library",
//                "life", "light", "like", "line", "list",
//                "little", "live", "local", "long", "look",
//                "love", "low",
//
//                // M
//                "machine", "main", "make", "manage", "manager",
//                "many", "map", "market", "math", "matter",
//                "maximum", "maybe", "mean", "meaning", "measure",
//                "memory", "message", "method", "middle", "might",
//                "million", "minimum", "minute", "model", "money",
//                "month", "more", "most", "move", "music",
//
//                // N
//                "name", "natural", "near", "necessary", "need",
//                "network", "never", "new", "next", "night",
//                "nine", "nothing", "notice", "number",
//
//                // O
//                "object", "office", "often", "okay", "old",
//                "once", "one", "only", "open", "operation",
//                "option", "order", "other", "outside", "over",
//                "own",
//
//                // P
//                "page", "paper", "parent", "part", "party",
//                "pass", "past", "people", "percent", "person",
//                "phone", "picture", "place", "plan", "plane",
//                "planet", "plant", "play", "player", "point",
//                "possible", "power", "practice", "prepare",
//                "present", "pretty", "problem", "process",
//                "program", "programming", "project", "provide",
//
//                // Q
//                "question", "quick", "quickly", "quite",
//
//                // R
//                "race", "radio", "raise", "read", "ready",
//                "real", "reason", "receive", "record", "red",
//                "remember", "remove", "report", "result", "return",
//                "right", "road", "rock", "room", "round",
//                "run", "runner", "running", "rule", "ruler",
//
//                // S
//                "same", "school", "science", "scientist", "score",
//                "screen", "search", "season", "second", "security",
//                "see", "seem", "send", "service", "set",
//                "seven", "share", "short", "show", "simple",
//                "since", "six", "size", "skill", "small",
//                "software", "some", "someone", "something", "song",
//                "space", "special", "sport", "start", "state",
//                "step", "still", "stop", "story", "student",
//                "study", "subject", "success", "system",
//
//                // T
//                "table", "take", "teacher", "team", "technology",
//                "tell", "ten", "test", "testing", "text",
//                "than", "that", "their", "them", "then",
//                "there", "thing", "think", "third", "this",
//                "three", "time", "today", "together", "tool",
//                "top", "total", "town", "train", "travel",
//                "tree", "try", "turn", "two",
//
//                // U
//                "under", "understand", "unit", "until", "up",
//                "use", "user", "using", "usually",
//
//                // V
//                "value", "variable", "various", "version", "very",
//                "video", "view", "visit", "voice",
//
//                // W
//                "wait", "walk", "want", "water", "way",
//                "website", "week", "well", "what", "when",
//                "where", "which", "while", "white", "whole",
//                "why", "window", "with", "word", "work",
//                "world", "write", "writer",
//
//                // X/Y/Z
//                "year", "yellow", "yes", "yet", "young",
//                "your", "yourself", "zero", "zone"
//        ));
//    }
    public void selectWord(MouseEvent mouseEvent) {
        String selectedWord = wordListView.getSelectionModel().getSelectedItem().toString();

        if (selectedWord != null) {
            dicenum.setText(selectedWord);
            wordListView.getItems().clear();
        }
    }
    public void locker() {
        for (int i = 1; i <= 100; i++) {


            for (int x = 1; x <= 100; x++) {


                if (x % i == 0) {

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