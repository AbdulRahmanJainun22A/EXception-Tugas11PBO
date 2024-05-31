/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @abdul rahman
 */
public class Exception6 {
     static void demo() {
        // Create and throw a NullPointerException
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        throw t;

        // This line is unreachable and will not be executed
        // System.out.println("Ini tidak lagi dicetak");
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai"); // This line will not be executed
        } catch (NullPointerException e) {
            // Catch the NullPointerException and print the error message
            System.out.println("Ada pesan error: " + e);
        }
    }
    
    
}
