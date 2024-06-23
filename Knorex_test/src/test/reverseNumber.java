package test;


//Given a signed 32-bit integer x, return x with its digits
//reversed.
public class reverseNumber {


public static void main(String[] args)   
{  
int number = 120, reverse = 0;  
// not need to mentioned the initialization part of the for loop  because before loop i initialized number
for( ;number != 0; number=number/10)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
} 
}