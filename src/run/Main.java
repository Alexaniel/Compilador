package run;

import java.util.ArrayList;

import controladores.Lexer;
import controladores.Token;

public class Main {

	public static void main(String[] args) {
        String input = "int a = 0 ; for";
        ArrayList<Token> tokens = Lexer.lex(input);
        
        for (Token token : tokens) {
            //System.out.println("(" + token.getTipo() + ": " + token.getValor() + ")");
        }
    }

}
