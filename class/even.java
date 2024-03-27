
    // how to check a number is even or odd without using conditional 
    // operator in java?

    public class even {
        public static void main(String[] args) {
            int number = 6; // You can replace this with the number you want to check
    
            String[] parity = {"Even", "Odd"};
            System.out.println(number + " is " + parity[number & 1] + ".");
        }
    }





//     The key concept here is to use bitwise AND (&) with 1 to check the least significant bit of a binary number. If the least significant bit is 1, the number is odd; if it's 0, the number is even.

// In binary representation:

// Odd numbers always end with 1.
// Even numbers always end with 0.
// When you perform bitwise AND with 1, you effectively check the value of the least significant bit:

// If the least significant bit is 1, the result is 1 (odd).
// If the least significant bit is 0, the result is 0 (even).
// So, by doing number & 1, you get either 0 or 1, and you use that result to index an array of strings (parity in the example) to determine if the number is even or odd. This is a bitwise trick to avoid using explicit conditional statements.
    


    

