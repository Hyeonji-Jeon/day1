package org.example;

import java.util.Scanner;

public class Calculator4U {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while(true){

            System.out.println("값을 입력하세요");
            String str = scanner.nextLine();

            if (str.equals("END")){
                break;
            }

            int value = Integer.parseInt(str);
            sum = sum + value;
            System.out.println("sum :" + sum);

        }
    }
}
