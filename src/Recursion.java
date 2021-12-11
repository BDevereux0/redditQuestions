public class Recursion {
    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }
        //Below is exercise 5.5, pg 81.
    public static void beerSong(int bottles){
            if (bottles !=0) {
                System.out.println(bottles + " bottles of beer on the wall");
                System.out.println(bottles + " bottles of beer");
                System.out.println("ya' take one down, ya' pass it around");
                bottles = bottles - 1;
                System.out.println(bottles+" bottles of beer on the wall.");
                System.out.println();
                beerSong(bottles);
            }
            else{
                System.out.println("No bottles of beer on the wall.");
                System.out.println("no bottles of beer");
                System.out.println("ya' can't take one down. ya' can't pass it around");
                System.out.println("'cause there are no more bottles of beer on the wall!");
            }
        }


    public static void main(String[] args) {
        //displayBinary(11);
        beerSong(99);


    }
}
