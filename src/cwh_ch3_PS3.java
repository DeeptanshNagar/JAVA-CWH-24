package com.company;

public class cwh_ch3_PS3 {
    public static void main(String[] args) {

//        Question 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

//        Question 2
        String text = "To the moon and the back";
        text = text.replace(" ","_");
        System.out.println(text);

//        Question 3
        String letter = "Hello <|name|>,How are you. We hope you are fine.";
        letter = letter.replace("<|name|>","Vanshika");
        System.out.println(letter);

//        Question 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

//        Question 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);




    }
}
