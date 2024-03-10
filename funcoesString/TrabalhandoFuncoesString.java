package funcoesString;

public class TrabalhandoFuncoesString{
    public static void main(String[] args) {
        String original = "abckndsa NJKHBJKHB ABC abc DEFG   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a','x');
        String s07 = original.replace("abc","xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");


        System.out.println("Original: -" + original +"-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring: -" + s04 + "-");
        System.out.println("substring: -" + s05 + "-");
        System.out.println("replace: -" + s06 + "-");
        System.out.println("replace: -" + s07 + "-");
        System.out.println("indexOf of 'bc':" + i);
        System.out.println("lastIndexOf of 'bc':" + j);

        String[] vect = original.split(" ");
        String n1 = vect[0];
        String n2 = vect[1];
        String n3 = vect[2];

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
