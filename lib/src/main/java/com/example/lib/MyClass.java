package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String LuckyString[] = {"���q","�N","�j�N"};
        System.out.println("�п�J�ͤ� :�� ��");
        int MonthNumber = Integer.parseInt(scanner.next());
        while (MonthNumber<1||MonthNumber>12){
            System.out.println("��J���~�ЦA��J���:");
            MonthNumber = Integer.parseInt(scanner.next());
        }
        int DateNumber = Integer.parseInt(scanner.next());
        while (DateNumber<1||DateNumber>31){
            System.out.println("��J���~�ЦA��J���:");
            DateNumber = Integer.parseInt(scanner.next());
        }
        int LuckyNumber = (MonthNumber*2+DateNumber)%3;
        System.out.println("�A���B��:"+LuckyString[LuckyNumber]);
    }
}
