package ch9;

//Clock.java

import java.util.Date;

class Clock {

    // getter for hours

    public int getHours() {

        String timeStr = new Date().toString().split(" ")[3];
        int hour = Integer.parseInt(timeStr.split(":")[0]);
        return hour;
    }

    // getter for minutes

    public int getMinutes() {

        String timeStr = new Date().toString().split(" ")[3];
        int minute = Integer.parseInt(timeStr.split(":")[1]);
        return minute;

    }

    public String getTime() {

        return String.format("%02d:%02d", getHours(), getMinutes());

    }

}

// WorldClock.java

class WorldClock extends Clock {

    private int offset;

    public WorldClock(int offset) {

        this.offset = offset % 24;

    }
    @Override

    public int getHours() {

        // fetching hours using super class getHours method

        int hr = super.getHours();
        hr += offset;

        if (hr > 23) {
            hr = hr - 24;
        }

        else if (hr < 0) {
            hr = hr + 24;
        }

        return hr;

    }
}

// Test.java for testing

class Test {

    public static void main(String[] args) {

        // creating a Clock with current time

        Clock clock = new Clock();

        WorldClock worldClock = new WorldClock(12);

        System.out.println(clock.getTime());

        System.out.println(worldClock.getTime());

    }

}