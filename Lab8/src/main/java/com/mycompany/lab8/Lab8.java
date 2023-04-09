/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;
import java.util.*;
/**
 *
 * @author alyss
 */
public class Lab8 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter an integer for n: ");
        int n = scnr.nextInt();
        SinglyLinkedList primeNumbers = new SinglyLinkedList();
        SinglyLinkedList primeNumbersThatContainAThree = new SinglyLinkedList();
    }
        //check prime
        public static boolean isPrime(int n){
if(n<=1)
return false;
else{
        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0){ 
                return false;
            }
        }
        return true;
    }
        }
        //check for 3
    public static boolean containsAThree(int n){
        String intToString = Integer.toString(n);
        for (int i = 0; i < intToString.length(); i++){
            if (intToString.charAt(i)=='3'){
                return true;
            }
        
        return false;
    }
   
    

