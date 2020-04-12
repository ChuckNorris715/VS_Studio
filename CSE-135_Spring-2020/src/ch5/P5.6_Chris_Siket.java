package ch5;

import java.util.Scanner;

class Main{
    public static String getTimeName(int hours, int minutes)
    {
        String name = "";
        if ((hours >= 1 && hours <= 12) && (minutes >= 0 && minutes <= 59))
        {
            String hourminute[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                    "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                    "nineteen",
                    "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
                    "twenty six", "twenty seven", "twenty eight", "twenty nine" };
            String hour;
            if (hours == 12)
                hour = hourminute[1];
            else
                hour = hourminute[hours + 1];
            if (minutes == 0)
                name = hourminute[hours] + " o'clock";
            else if (minutes == 15)
                name = "quarter past " + hourminute[hours];
            else if (minutes == 30)
                name = "half past " + hourminute[hours];
            else if (minutes == 45)
                name = "a quarter to " + hour;
            else if (minutes < 30)
                name = hourminute[minutes] + " minutes past " + hourminute[hours];
            else
                name = hourminute[60 - minutes] + " to " + hour;
        }
        else
            name = "The format entered is invalid";
        return name;
    }
    public static void main(String[] args) {
        System.out.println("Please enter time");
        Scanner s = new Scanner(System.in);
        System.out.print("\nHours: ");
        int hour = s.nextInt();
        System.out.print("\nMinutes: ");
        int min = s.nextInt();
        String time_name = getTimeName(hour, min);
        System.out.println("\nThe time is " + time_name);
    }
}