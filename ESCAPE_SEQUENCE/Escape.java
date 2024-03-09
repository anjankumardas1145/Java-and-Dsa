package ESCAPE_SEQUENCE;

public class Escape {
    public static void main(String[] args) {
        //escape sequence:jab mai string kai under koi bhi special chees diani hai toh uss time escape sequence use karta hun..
        //TIME:3.6HOUR
      //  \t:insert a tab in the next at this point
        System.out.println("hello \tgood \tmorning");
        // \b:insert a backspace in the text at this point
        System.out.println("hello\bgood morning");
        // \':insert a single quote character in the next at this point
        System.out.println("hello \'good\' morning");
        // \":insert a double quote character in the next at this point
        System.out.println("hello \"good\" morning");//to display like this::hello "good" morning
        // \\:insert a backslash character in the text at this point
        System.out.println("hello \\good\\ morning");//to display like this :hello \good\ morning
        // \n:insert a newline in the text at this point
        System.out.println("hello \n good morning");
    }
}
