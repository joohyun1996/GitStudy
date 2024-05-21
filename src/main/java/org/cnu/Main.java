package org.cnu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int param = sc.nextInt();

        Calculable additionExpression = new AdditionExpression();
        Calculable divisionExpression = new DivisionExpression();


        System.out.printf("my addition expression's result : %d \n", additionExpression.calculate(param));
        System.out.printf("my division expression's result : %d \n", divisionExpression.calculate(param));
    }
}

interface Calculable {
    int calculate(int param);
}

//본인이 작성한 코드를 붙여넣어주세요!
class AdditionExpression implements Calculable{
    @Override
    public int calculate(int param) {
        return param + 21;
    }
}

class DivisionExpression implements Calculable{
    @Override
    public int calculate(int param) {
        return param / 2;
    }
}
