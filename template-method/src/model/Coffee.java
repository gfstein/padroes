package model;

import java.util.Scanner;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return getUserInput().toLowerCase().startsWith("y");
    }

    private String getUserInput(){
        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        scanner.close();
        return answer;
    }

}
