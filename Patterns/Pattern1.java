// Print the following pattern using nested loops:
// *
// **
// ***
// ****
// *****
//
// Outer loop: i goes from 1 to 5. Each i is a row number.
// Inner loop: prints one '*' for each j value from 1 to i.
// Example: if i = 3, inner loop runs 3 times and prints ***.

class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Inner loop: print exactly i stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after the row is complete
            System.out.println();
        }
    }
}