/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author smv
 */
class MultiThreadingThree extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000); 
            }
            catch(InterruptedException e){
                
            }
        }
    }
}
public class ThreadTwo {
    public static void main(String[] args){
    MultiThreadingThree mt1=new MultiThreadingThree();
            mt1.start();
    }
}