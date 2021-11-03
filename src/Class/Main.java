package Class;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[]{new Student(1, "Zhndos", "07.11.2002", "Nur", "FIT", "2", "SIB-27"),
                            new Student(1, "Zhndar", "07.11.2003", "Alm", "FEN", "2", "IS-27"),
                            new Student(1, "Zhnbol", "07.11.2004", "Kokwetau", "FIT", "1", "SIB-17")};
        System.out.println("a) Studennter tyzymy korse facul");
        String facl = sc.nextLine();

        for(int i = 0; i < 3; ++i) {
            if (student[i].getFacultet().equalsIgnoreCase(facl)) {
                System.out.println(student[i].toString());
            }
        }

    }
}