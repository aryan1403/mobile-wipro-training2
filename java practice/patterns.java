public class patterns {
    public static void main(String[] args) {
        // right angled triangle
        /*
         * 
         * *
         * * *
         * * * *
         * * * * *
         */

        // Code:- (nested for loop)
        // 5 -> no of columns
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* "); // print *
            }
            System.out.println(); // move to the new line
        }

        // TODO: print the inverted triangle
        /*
         * * * * *
         * * * *
         * * *
         * *
         * 
         */

        // TODO: print the triangle
        /*
              *
            * * *
          * * * * *
        * * * * * * *
        */
        /* int n = 10;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                continue;
            }
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        } */

        // TODO: Hollow triangle
        /*
                    *
                 *     *
               *         *
             *             *
            * * * * * * * * *
         */
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (2 * i); k++) {
                if(k == 1 || i == 10 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         
        
    }
}
