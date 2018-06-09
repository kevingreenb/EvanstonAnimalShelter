package com.example.android.quiz;

/**
 * Created by KevinGreen on 2/8/18.
 */

import java.util.ArrayList;

public class QuestionBank {
    ArrayList<Question> list = new ArrayList<>();

    public QuestionBank() {
        list.add(new Question("Which of the following is an example of valid jQuery code?",
                "$('main-nav').show();",
                "document.querySelector('#main-nav');",
                "$('#main-nav').hide();",
                "document.getElementById('main-nav').style.display = 'inline-block';",
                "c",
                "RADIO"));

        list.add(new Question( "What will the following code do? \n"+
                "$('#price-list li').html('<strong>$4.99</strong>');",
                "Select the element with the ID of price list and set its HTML content to $4.99",
                "Select the <strong> tag and set its HTML content to $4.99",
                "Select the list item nested within #price-list and set its HTML content to $4.99",
                "To make pizza more delicious",
                "c",
                "BUTTON"));

        list.add(new Question( "Which of the following is a primary reason the jQuery library was developed for JavaScript?",
                "To address inconsistencies in the way JavaScript was implemented in different browsers.",
                "To provide clear guidelines for web application architecture.",
                "To make developer's life easier.",
                "To compete against Java.",
                "ac",
                "CHECK"));

        list.add(new Question( "Fill in the text below with the method that would hide the element #my-element.",
                "",
                "",
                "",
                "",
                "hide()",
                "TEXT"));
    }



}