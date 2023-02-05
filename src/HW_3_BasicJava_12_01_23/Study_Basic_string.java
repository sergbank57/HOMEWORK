package HW_3_BasicJava_12_01_23;

public class Study_Basic_string {
    public static void main(String[] args) {
        String text = new String("I study Basic Java!");
        System.out.println(text);
        System.out.println(text.length());
        System.out.println("last symbol is - " +text.charAt(18));
        boolean inclusiv = text.contains("Java");
        System.out.println("This text contains substring 'Java'! -" +" "+ inclusiv);
       // text.replace()
        System.out.println("Change a to o:" +" " + (text.replace( 'a', 'o')));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.substring(0,13));
    }
}
