package org.example.beans;

public class ExampleBean {

    // Number of years to calculate the Ultimate Answer
    private int years;

    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer;

    public ExampleBean(int years, String ultimateAnswer, int a) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
        System.out.println(a);
    }
}
