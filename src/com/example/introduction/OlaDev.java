package com.example.introduction;


import java.util.Scanner;

public class OlaDev {
    public static void main(String[] args) {
        System.out.println("Qual o seu nome?");
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        name = sc.nextLine();

        System.out.println("Seu nome é: " + name);
    }
}