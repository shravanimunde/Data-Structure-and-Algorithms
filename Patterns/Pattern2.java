// Program to print a square star pattern

class Pattern2 {
    public static void main(String[] args) {

        // Outer loop = Number of rows
        for (int i = 0; i < 5; i++) {

            // Inner loop = Number of stars in each row
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }

            // Move to the next line after one row is printed
            System.out.println();
        }
    }
}