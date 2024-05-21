package org.cnu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int param = sc.nextInt();

        Calculable multiplyExpression = new multiExpression();
        Calculable additionExpression = new AdditionExpression();
        Calculable divisionExpression = new DivisionExpression();

        System.out.printf("my addition expression's result : %d \n", additionExpression.calculate(param));
        System.out.printf("my division expression's result : %d \n", divisionExpression.calculate(param));
        System.out.printf("my multiplication expression's result : %d \n", multiplyExpression.calculate(param));
    }
}

interface Calculable {
    int calculate(int param);
}

class AdditionExpression implements Calculable{
    @Override
    public int calculate(int param) {
        return param + 21;
    }
}

class multiExpression implements Calculable{
    @Override
    public int calculate(int param) {
        return param*100;
    }
}
class DivisionExpression implements Calculable{
    @Override
    public int calculate(int param) {
        return param / 2;
    }
}
