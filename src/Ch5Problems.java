public class Ch5Problems {
    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }
    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
    public static void checkFermat(int a, int b, int c, int n){
        if ((Math.pow(a,n)+Math.pow(b,n))==Math.pow(c,n)){
            System.out.println("Holy smokes, Fermet was wrong!");
        }
        else{
            System.out.println("No, that doesn't work");
        }
    }
    public static void main(String[] args) {
        //int bizz = 5;
        //int buzz = 2;
        //zoop("just for", bizz);
        //clink(2 * buzz);
        checkFermat(1,3,4,2);

        //Exercise 5.4 Fermat's Last Theorem says that there are no integers a, b,
        //and c such that a^n + b^n = c^n, except when n is <= 2.
        //Write a method named checkFermat that takes four integers as parameters {
        //a, b, c and n { and checks to see if Fermat's theorem holds. If n is greater
        //than 2 and a^n + b^n = c^n, the program should display \Holy smokes, Fermat
        //was wrong!" Otherwise the program should display \No, that doesn't work."
        //Hint: You may want to use Math.pow.


    }
}
