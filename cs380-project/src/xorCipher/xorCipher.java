package xorCipher;
import java.io.*;
import java.util.*;

public class xorCipher {

	//Testing random inputs
    /*public static void main(String[] args) throws UnsupportedEncodingException{
        String input = "ABC";
        String key = "k";
        byte[] inputBytes = input.getBytes("UTF-8");
        byte[] keyBytes = key.getBytes("UTF-8");
        
        for(byte b : inputBytes){
            System.out.println((char)b + " -> " + Integer.toBinaryString(b));
        }
        for(byte b : keyBytes){
            System.out.println((char)b + " -> " + Integer.toBinaryString(b));
        }
        
        byte[] xorResult = xorCipher(inputBytes, keyBytes);
        for(byte b : xorResult) {
            System.out.println(Integer.toBinaryString(b));
        }
        
        String s = new String(xorResult);
        System.out.println(s);
        
    }*/
    
    //  Encodes/decodes the input with the key using XOR.
    public void xorCipher(byte[] input, byte[] key){
        for(int i = 0; i < input.length; i++){
            input[i] = (byte)(((int) input[i]) ^ ((int) key[i % key.length]));
        }
    }
    
}
