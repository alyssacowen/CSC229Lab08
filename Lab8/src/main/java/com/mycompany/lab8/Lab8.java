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
        
         //starts at 2 because 2 is first prime number that comes after 0
   for(int i = 2; i <= n; i++){
       if(isPrime(i)){
           primeNumbers.append(new Node(i));
           if (containsAThree(i)){
               primeNumbersThatContainAThree.append(new Node(i));
           }
       }
   }
   int sum = 0;
   Node current = primeNumbersThatContainAThree.getHead();
   while (current != null){
       sum += current.data;
       current = current.next;
   }
        System.out.println("The total sum of prime numbers that contain a 3 up until the integer " + n + " is equal to " + sum);
    
  
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
        }
        return false;
    
    }
}


