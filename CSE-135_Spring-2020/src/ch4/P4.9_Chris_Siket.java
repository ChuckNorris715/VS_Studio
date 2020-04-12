package ch4;

import java.util.Random;

class Drunkard {
    int x, y;

    Drunkard(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void moveNorth() {
        this.y -= 1;
    }

    void moveEast() {
        this.x += 1;
    }

    void report() {
        System.out.println( x + ", " + y);
    }
}

class Four {
    public static void main(String[] args) {
        Random generator = new Random();
        Drunkard drunkard = new Drunkard(100, 100);
        int direction;
        for (int i = 0; i < 100; i++) {
            direction = Math.abs(generator.nextInt()) % 4;
            if (direction == 0) { // N
                drunkard.moveNorth();
            } else if (direction == 1) { // E
                drunkard.moveEast();
            } else if (direction == 2) { // S
                System.out.println("Should move South.");
            } else if (direction == 3) { // W
                System.out.println("Should move West.");
            } else {
                System.out.println("Impossible!");
            }
            drunkard.report();
        }
    }
}
