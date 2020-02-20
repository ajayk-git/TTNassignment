//WAP to convert seconds into days, hours, minutes and seconds.

import java.util.Scanner;

class SecondConversion{
    void secondconversion(int seconds) {
        int days = seconds/(24*3600);
        seconds=seconds%(24*3600);

        int hour = seconds/(3600);
        seconds =seconds/3600;

        int minutes = seconds/60;
        seconds = seconds/60;

        System.out.println("\ndays: "+days+" hours: "+hour+" minutes: "+minutes+" seconds: "+seconds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter seconds to find days hours minutes and seconds");
        int n = sc.nextInt();
        SecondConversion sd = new SecondConversion();
        sd.secondconversion(n);
    }
}