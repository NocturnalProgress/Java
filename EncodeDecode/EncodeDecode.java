package EncodeDecode;

import java.util.Base64;
import java.util.Scanner;

class EncodeDecode {
    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getMimeEncoder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a message.");
        String message = scan.nextLine();
        String encodeString = encoder.encodeToString(message.getBytes());
        System.out.println("Encoded message: " + encodeString);
        scan.close();

        Base64.Decoder decoder = Base64.getMimeDecoder();
        String decodeString = new String(decoder.decode(encodeString));
        System.out.println("Decoded message: " + decodeString);
    }
}