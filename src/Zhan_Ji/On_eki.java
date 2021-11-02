package Zhan_Ji;
// Ондық санды екілкке айналдыру
import java.util.Scanner;
public class On_eki {
    public static String DecToBin(){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Ondyk sandy engyz=");
        a=sc.nextInt();
        String temp = "";
        while(a !=0){
            b = a%2;
            temp = b + temp;
            a = a/2;
        } return (temp);
    }
    public static void main(String[] args) {
        System.out.println(DecToBin());
    }
}

