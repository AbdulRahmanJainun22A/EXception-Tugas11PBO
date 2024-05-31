/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @abdul rahman
 */
public class Exception5 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0); // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Pesan error: ");
            System.out.println(e.getMessage()); // Print the error message
            System.out.println("Info stack trace:");
            e.printStackTrace(); // Print the stack trace to standard error
            e.printStackTrace(System.out); // Print the stack trace to standard output
        } catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi"); // Handle any other exceptions
        }
    }
    
}
