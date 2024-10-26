
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
public class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=sc1.nextInt();
        if(n>0)
          System.out.println("number is positive ");  
        else if(n<0)
          System.out.println("number is negative ");    
        else
            System.out.println("number is zero ");
    }
}
