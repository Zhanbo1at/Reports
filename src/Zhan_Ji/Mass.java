package Zhan_Ji;
//Aйнымалылар.массив берілген 7 сан.Табу керек оң сандардын теріс сандардың суммасын жұп сандардың санын

public class Mass {
    public static void main(String[] args) {

        int sumPlus = 0, sumMin = 0, count = 0;

        int a[] = {-2, -1, 3, 5, 9, 11, 14};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sumPlus += a[i];
            } else {
                sumMin += a[i];
            }
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Max = "+sumPlus);
        System.out.println("Min = "+sumMin);
        System.out.println("Жуп сандар саны =" +count);
    }
}