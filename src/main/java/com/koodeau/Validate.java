package com.koodeau;
import javax.swing.*;
import com.koodeau.App;

public class Validate extends Library {

    Validate(){}

    public static String Text = new String("");
    public static StringBuilder Code = new StringBuilder();

    static void Input(){
        Text = JOptionPane.showInputDialog(null,"Input text (Max 255 symbols) to translate into Binary Code:");
        if (Text.length()>255){
            Text = JOptionPane.showInputDialog(null,"Input less text (Max 255 symbols) to translate into Binary Code:");
            System.out.println("[WARNING] "+App.currentTime + ": String 'Text' is bigger than 255 symbols! {Validate}");
        }
        System.out.println("User input: "+Text);
    }


    public void Check(){

        if (Text.isEmpty()){
            System.out.println("[WARNING] "+App.currentTime + ": Input is blank or empty. Try again. {Validate}");
            JOptionPane.showMessageDialog(null, "Your Input cannot be blank. Please, input something to translate it.", "Error", JOptionPane.ERROR_MESSAGE);
            Validate.Input();
        }

/*
        if (Text.contains("A")){Code += Binary.get("A");}
        if (Text.contains("B")){Code += Binary.get("B");}
        if (Text.contains("C")){Code += Binary.get("C");}
        if (Text.contains("D")){Code += Binary.get("D");}
        if (Text.contains("E")){Code += Binary.get("E");}
        if (Text.contains("F")){Code += Binary.get("F");}
        if (Text.contains("G")){Code += Binary.get("G");}
        if (Text.contains("H")){Code += Binary.get("H");}
        if (Text.contains("I")){Code += Binary.get("I");}
        if (Text.contains("J")){Code += Binary.get("J");}
        if (Text.contains("K")){Code += Binary.get("K");}
        if (Text.contains("L")){Code += Binary.get("L");}
        if (Text.contains("M")){Code += Binary.get("M");}
        if (Text.contains("N")){Code += Binary.get("N");}
        if (Text.contains("O")){Code += Binary.get("O");}
        if (Text.contains("P")){Code += Binary.get("P");}
        if (Text.contains("Q")){Code += Binary.get("Q");}
        if (Text.contains("R")){Code += Binary.get("R");}
        if (Text.contains("S")){Code += Binary.get("S");}
        if (Text.contains("T")){Code += Binary.get("T");}
        if (Text.contains("U")){Code += Binary.get("U");}
        if (Text.contains("V")){Code += Binary.get("V");}
        if (Text.contains("W")){Code += Binary.get("W");}
        if (Text.contains("X")){Code += Binary.get("X");}
        if (Text.contains("Y")){Code += Binary.get("Y");}
        if (Text.contains("Z")){Code += Binary.get("Z");}

        if (Text.contains("a")){Code += Binary.get("a");}
        if (Text.contains("b")){Code += Binary.get("b");}
        if (Text.contains("c")){Code += Binary.get("c");}
        if (Text.contains("d")){Code += Binary.get("d");}
        if (Text.contains("e")){Code += Binary.get("e");}
        if (Text.contains("f")){Code += Binary.get("f");}
        if (Text.contains("g")){Code += Binary.get("g");}
        if (Text.contains("h")){Code += Binary.get("h");}
        if (Text.contains("i")){Code += Binary.get("i");}
        if (Text.contains("j")){Code += Binary.get("j");}
        if (Text.contains("k")){Code += Binary.get("k");}
        if (Text.contains("l")){Code += Binary.get("l");}
        if (Text.contains("m")){Code += Binary.get("m");}
        if (Text.contains("n")){Code += Binary.get("n");}
        if (Text.contains("o")){Code += Binary.get("o");}
        if (Text.contains("p")){Code += Binary.get("p");}
        if (Text.contains("q")){Code += Binary.get("q");}
        if (Text.contains("r")){Code += Binary.get("r");}
        if (Text.contains("s")){Code += Binary.get("s");}
        if (Text.contains("t")){Code += Binary.get("t");}
        if (Text.contains("u")){Code += Binary.get("u");}
        if (Text.contains("v")){Code += Binary.get("v");}
        if (Text.contains("w")){Code += Binary.get("w");}
        if (Text.contains("x")){Code += Binary.get("x");}
        if (Text.contains("y")){Code += Binary.get("y");}
        if (Text.contains("z")){Code += Binary.get("z");}

        if (Text.contains("1")){Code += Binary.get("1");}
        if (Text.contains("2")){Code += Binary.get("2");}
        if (Text.contains("3")){Code += Binary.get("3");}
        if (Text.contains("4")){Code += Binary.get("4");}
        if (Text.contains("5")){Code += Binary.get("5");}
        if (Text.contains("6")){Code += Binary.get("6");}
        if (Text.contains("7")){Code += Binary.get("7");}
        if (Text.contains("8")){Code += Binary.get("8");}
        if (Text.contains("9")){Code += Binary.get("9");}
        if (Text.contains("0")){Code += Binary.get("0");}

        if (Text.contains(".")){Code += Binary.get(".");}
        if (Text.contains(",")){Code += Binary.get(",");}
        if (Text.contains("/")){Code += Binary.get("/");}
        if (Text.contains("?")){Code += Binary.get("?");}
        if (Text.contains("@")){Code += Binary.get("@");}
        if (Text.contains("!")){Code += Binary.get("!");}
        if (Text.contains("#")){Code += Binary.get("#");}
        if (Text.contains("%")){Code += Binary.get("%");}
        if (Text.contains("&")){Code += Binary.get("&");}
        if (Text.contains("*")){Code += Binary.get("*");}
        if (Text.contains("(")){Code += Binary.get("(");}
        if (Text.contains(")")){Code += Binary.get(")");}
        if (Text.contains("\"")){Code += Binary.get("\"");}
        if (Text.contains("'")){Code += Binary.get("'");}
        if (Text.contains("-")){Code += Binary.get("-");}
        if (Text.contains("+")){Code += Binary.get("+");}
        if (Text.contains("_")){Code += Binary.get("_");}
        if (Text.contains("$")){Code += Binary.get("$");}
*/
    }

    public void Translate(){



        byte[] bytes = Text.getBytes(); System.out.println("[INFO] "+App.currentTime + ": Text.getBytes(); {Validate}");
        

		for (byte b : bytes){
            int val = b;
            
			for (int i = 0; i < 8; i++){
				Code.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
            }
            
			Code.append(' '); System.out.println("[INFO] "+App.currentTime + ": Code.append(); {Validate}");
        }
        
        System.out.println("'" + Text + "' to binary: " + Code);


    }

    public static void main(String[] args) {
        Validate Validate = new Validate();
//        Codes.PutCodes();
        Validate.Check(); System.out.println("[INFO] "+App.currentTime + ": Check() void from class {Validate} started!");    
        Validate.Translate(); System.out.println("[INFO] "+App.currentTime + ": Translate() void from class {Validate} started!");

        System.out.println("Binary: "+Code);
        JOptionPane.showMessageDialog(null, "Inputed text : "+Text+"\nTranslation to Binary Code :\n"+Code, "Binary", JOptionPane.INFORMATION_MESSAGE);

    }
}
