import java.io.*;
import static java.lang.Math.pow;
import java.util.Scanner;
public class SimpleCalc2 {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("in1.txt");
        fw.write("8\n4");
        fw.close();
        Scanner sc1=new Scanner (new File("in1.txt"));
        int num1=sc1.nextInt();
        int num2=sc1.nextInt();
        sc1.close();
        int sum=num1+num2;
        int diff=num1-num2;
        int mul=num1*num2;
        float div=num1/num2;
        int quo=num1/num2;
        int rem=num1%num2;
        int expo=(int) pow(num1,num2);
        fw=new FileWriter("out1.txt");
        fw.write(sum+" "+diff+" "+mul+" "+div+" "+quo+" "+rem+" "+expo);
        fw.close();
        fw=new FileWriter("out2.txt");
        fw.write(sum+"\n "+diff+"\n "+mul+"\n "+div+"\n "+quo+"\n "+rem+"\n "+expo);
        fw.close();
        fw=new FileWriter("out3.txt");
        fw.write(" sum is :"+sum+"\n difference is: "+diff+"\n Product is : "+mul+"\nDivision is: "+div+"\nQuotient is: "+quo+"\nReminder is: "+rem+"Exponential is "+expo);
        fw.close();
    }
}
