import java.util.Scanner;

class firstCodeForces {
    
    public static String whoWins(int alice, int bob) {
        int helper = 0;

        while (alice > -1 && bob > -1) {
            // Even --> move of alice
            // Odd ---> move of bob
            if (helper % 2 == 0) {
                if (bob - 1 > 1 || alice>1) {
                    int c = alice;
                    alice = bob;
                    bob = c;
                }
                alice--;
            } else {
                if (alice - 1 > 1 || bob>1) {
                    int c = alice;
                    alice = bob;
                    bob = c;
                }
                bob--;
            }
            helper++;
        }
        if (alice == -1)
            return "Bob";
        else
            return "Alice";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alice = sc.nextInt();
        int bob = sc.nextInt();

        System.out.println(whoWins(alice, bob));

        sc.close();
    }
}