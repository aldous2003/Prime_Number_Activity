/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgdo.pkgwhile;

/**
 *
 * @author Aldous
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n1 = 0, n2 = 1, n3, i;
        System.out.println(n1 + n2);

        for (i = 2; i < 15; i++) {
            n3 = n1 + n2;

            boolean flag = false;
            for (int j = 2; n3 <= n3 / 2; ++j) {
                // condition for nonprime number
                if (n3 % j == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(n3 + " is a prime number.");
            } else {
                System.out.println(n3 + " is not a prime number.");
            }
            n1 = n2;
            n2 = n3;
        }
    }

}
