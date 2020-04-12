package ch9;

import java.util.Scanner;
import java.util.ArrayList;

class Appointment {
    protected String description;
    protected int day, month, year;

    public Appointment(String desc, int d, int m, int y) {
        description = desc;
        day = d;
        month = m;
        year = y;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean occursOn(int d, int m, int y) {
        if (getDay() == d && getMonth() == m && getYear() == y)
            return true;
        else
            return false;
    }

    public String toString() {
        return description + " on " + day + "/" + month + "/" + year;
    }

}

class OneTime extends Appointment {

    public OneTime(String desc, int d, int m, int y) {

        super(desc, d, m, y);

    }

    public String toString()

    {

        return "[OneTime] " + super.toString();

    }

}

class Monthly extends Appointment {

    public Monthly(String desc, int d, int m, int y) {

        super(desc, d, m, y);

    }

    // override super class method

    public boolean occursOn(int d, int m, int y)

    {

        if (getDay() == d) // since this is monthly appointment , we only need to check if the day matches

            return true;

        else

            return false;

    }

    public String toString()

    {

        return "[Monthly] " + description + " on day " + day + " of the month";

    }

}

class Daily extends Appointment {

    public Daily(String desc, int d, int m, int y) {

        super(desc, d, m, y);

    }

    // override super class method

    public boolean occursOn(int d, int m, int y)

    {

        return true; // since it occurs daily, there is no need to check day, month or year

    }

    public String toString()

    {

        return "[Daily] " + description;

    }

}

class AppointmentBook {

    ArrayList<Appointment> appointments;

    public AppointmentBook()

    {

        appointments = new ArrayList<Appointment>();

    }

    public void addAppointment(Appointment a)

    {

        appointments.add(a);

    }

    public void showAll()

    {

        for (Appointment a : appointments)

            System.out.println(a.toString());

    }

    public void show(int d, int m, int y)

    {

        for (Appointment a : appointments)

            if (a.occursOn(d, m, y))

                System.out.println(a.toString());

    }

}

class TestAppointment {

    public static void main(String[] args) {

        AppointmentBook book = new AppointmentBook();

        book.addAppointment(new Monthly("Pay electric bill", 5, 1, 2017));

        book.addAppointment(new Daily("Meet Mr. John", 10, 2, 2017));

        book.addAppointment(new OneTime("Meet dentist", 15, 2, 2017));

        System.out.println("The appointments in the book are ");

        book.showAll();

        Scanner scanner = new Scanner(System.in);

        String ans, desc;

        int type, d, m, y;

        Appointment app;

        while (true)

        {

            System.out.println("Add an appointment? y/n: ");

            ans = scanner.next();

            if (!ans.equalsIgnoreCase("y"))

                break;

            else

            {

                while (true)

                {

                    System.out.println("1. One time");

                    System.out.println("2. Daily");

                    System.out.println("3. Monthly");

                    System.out.println("Choose appointment type: ");

                    type = scanner.nextInt();

                    if (type >= 1 && type <= 3)

                        break;

                }

                scanner.nextLine(); // flush newline
                System.out.println("Enter description: ");
                desc = scanner.nextLine();
                System.out.println("Enter day: ");
                d = scanner.nextInt();
                System.out.println("Enter month: ");
                m = scanner.nextInt();
                System.out.println("Enter year: ");
                y = scanner.nextInt();
                if (type == 1)
                    app = new OneTime(desc, d, m, y);
                else if (type == 2)
                    app = new Daily(desc, d, m, y);
                else
                    app = new Monthly(desc, d, m, y);
                book.addAppointment(app);
            }
        }

        System.out.println("\nThe appointments in the book are ");
        book.showAll();
        System.out.println("\nEnter date to show appointments for the date");
        System.out.println("Enter day: ");
        d = scanner.nextInt();
        System.out.println("Enter month: ");
        m = scanner.nextInt();
        System.out.println("Enter year: ");
        y = scanner.nextInt();
        book.show(d, m, y);

    }
}