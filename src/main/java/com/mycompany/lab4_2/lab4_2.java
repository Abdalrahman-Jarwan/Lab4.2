/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4_2;

/**
 *
 * @author Blank47
 */
import java.util.Scanner;
public class lab4_2 {
    public static void insurcost(int age ){
int insurcost = (5* age) + 300;

System.out.println("your life insurance cost is: $" + insurcost +"/year");
 }

  public static void main(String[] args) {
  
  Scanner keyboard = new Scanner(System.in);
    
System.out.println(" Please enter your age: ");
int age = keyboard.nextInt();

insurcost(age);

  }
 
}

