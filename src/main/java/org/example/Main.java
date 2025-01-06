package org.example;

import java.util.Scanner; // Scanner 클래스를 가져오기

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         int[] arr = new int[5];

        System.out.println("배열의 값을 입력하세요:");

        //배열 값 입력 받기
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        // 배열의 합계 계산
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }

        System.out.println("최종 금액: " + sum);

        scanner.close();

        }
    }
