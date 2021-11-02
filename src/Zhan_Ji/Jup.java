package Zhan_Ji;
// Берілгені: Бағандардағы жұп сандардың санын табу
import java.util.Random;
import java.util.Scanner;
public class Jup {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int n,m;
        System.out.print("Mаs zhol engyz =");
        n=sc.nextInt();
        System.out.print("Mаs bagan engyz =");
        m=sc.nextInt();
        int a[][]=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                a[i][j]=r.nextInt(20)-10;
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i = 0; i < a[0].length; i++){
            int jupsan = 0;
            for(int j = 0; j < a.length; j++){
                if(a[i][j] % 2 == 0){
                    jupsan++;
                }
            }
            System.out.println( (i + 1) + " Баган " + jupsan + " жуп сан бар");
        }
    }
}
