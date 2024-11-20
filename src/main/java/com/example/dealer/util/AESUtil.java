package com.example.dealer.util;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESUtil {
	private static final String ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String SECRET_KEY = "1234567890abcdef"; // Use the same key as in React.js

    public static String decrypt(String encryptedText) throws Exception {
    	String[] parts = encryptedText.split(":");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid encrypted format. Expected IV:Ciphertext");
        }

        String ivBase64 = parts[0];  // Extract IV part
        String cipherTextBase64 = parts[1];  

        // Decode Base64 strings into byte arrays
        byte[] iv = Base64.getDecoder().decode(ivBase64);  // Decode IV
        byte[] cipherText = Base64.getDecoder().decode(cipherTextBase64);  // Decode Ciphertext

        // Debugging output: Check the decoded bytes
        System.out.println("IV (Base64): " + ivBase64);
        System.out.println("Ciphertext (Base64): " + cipherTextBase64);

        // Verify lengths
        if (iv.length != 16) {
            throw new IllegalArgumentException("Invalid IV length. Expected 16 bytes.");
        }
        if (cipherText.length < 16) {  
            throw new IllegalArgumentException("Ciphertext length is too short.");
        }

        // Create a SecretKeySpec from the SECRET_KEY (16 bytes for AES-128)
        SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");

        // Initialize the IvParameterSpec with the decoded IV
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        // Initialize the Cipher for AES 
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);

        
        byte[] decryptedBytes = cipher.doFinal(cipherText);

        
        return new String(decryptedBytes);
    }
}
