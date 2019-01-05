package com.koodeau;
import java.util.HashMap;
import java.util.Map;

public class Library {

    public Library(){}

    String Char, Code;
    static Map<String, String> Binary = new HashMap<>();

    public void PutCodes(){
        Binary.put(" ", " ");

        Binary.put("A", "01000001 ");
        Binary.put("B", "01000010 ");
        Binary.put("C", "01000011 ");
        Binary.put("D", "01000100 ");
        Binary.put("E", "01000101 ");
        Binary.put("F", "01000110 ");
        Binary.put("G", "01000111 ");
        Binary.put("H", "01001000 ");
        Binary.put("I", "01001001 ");
        Binary.put("J", "01001010 ");
        Binary.put("K", "01001011 ");
        Binary.put("L", "01001100 ");
        Binary.put("M", "01001101 ");
        Binary.put("N", "01001110 ");
        Binary.put("O", "01001111 ");
        Binary.put("P", "01010000 ");
        Binary.put("Q", "01010001 ");
        Binary.put("R", "01010010 ");
        Binary.put("S", "01010011 ");
        Binary.put("T", "01010100 ");
        Binary.put("U", "01010101 ");
        Binary.put("V", "01010110 ");
        Binary.put("W", "01010111 ");
        Binary.put("X", "01011000 ");
        Binary.put("Y", "01011001 ");
        Binary.put("Z", "01011010 ");

        Binary.put("a", "01100001 ");
        Binary.put("b", "01100010 ");
        Binary.put("c", "01100011 ");
        Binary.put("d", "01100100 ");
        Binary.put("e", "01100101 ");
        Binary.put("f", "01100110 ");
        Binary.put("g", "01100111 ");
        Binary.put("h", "01101000 ");
        Binary.put("i", "01101001 ");
        Binary.put("j", "01101010 ");
        Binary.put("k", "01101011 ");
        Binary.put("l", "01101100 ");
        Binary.put("m", "01101101 ");
        Binary.put("n", "01101110 ");
        Binary.put("o", "01101111 ");
        Binary.put("p", "01110000 ");
        Binary.put("q", "01110001 ");
        Binary.put("r", "01110010 ");
        Binary.put("s", "01110011 ");
        Binary.put("t", "01110100 ");
        Binary.put("u", "01110101 ");
        Binary.put("v", "01110110 ");
        Binary.put("w", "01110111 ");
        Binary.put("x", "01111000 ");
        Binary.put("y", "01111001 ");
        Binary.put("z", "01111010 ");

        Binary.put("1", "00110001 ");
        Binary.put("2", "00110010 ");
        Binary.put("3", "00110011 ");
        Binary.put("4", "00110100 ");
        Binary.put("5", "00110101 ");
        Binary.put("6", "00110110 ");
        Binary.put("7", "00110111 ");
        Binary.put("8", "00111000 ");
        Binary.put("9", "00111001 ");
        Binary.put("0", "00110000 ");

        Binary.put("?", "00111111 ");
        Binary.put("-", "00101101 ");
        Binary.put("@", "01000000 ");
        Binary.put("_", "01011111 ");
        Binary.put(".", "00101110 ");
        Binary.put("/", "00101111 ");
        Binary.put("!", "00100001 ");
        Binary.put(",", "00101100 ");
        Binary.put("\"", "00100010 ");
        Binary.put("#", "00100011 ");
        Binary.put("$", "00100100 ");
        Binary.put("%", "00100101 ");
        Binary.put("&", "00100110 ");
        Binary.put("'", "00100111 ");
        Binary.put("(", "00101000 ");
        Binary.put(")", "00101001 ");
        Binary.put("*", "00101010 ");
        Binary.put("+", "00101011 ");

    }

    public static void main(String[] args) {
        Library Codes = new Library();
        Codes.PutCodes();
        
        System.out.println("\n=== Iterating over the HashMap's entrySet using simple for-each loop ===");
        
        for(Map.Entry<String, String> entry: Binary.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}