package PrimeirasAulas;

public class HelloWord {
    public static void main(String[] args) {
        int dadoDoTipoInteiro = 10;
        double dadoDoTipoDouble =3.14;
        float dadosDoTipoFloat = 3.14F;
        long dadosDoTipoLong = 34445514L;
        String dadosDoTipoString = "Hello Word";
        boolean dadosdOTipoBoolean = false ;

        if (dadoDoTipoInteiro == 10){
            System.out.println("Entrou no if");
        }else if (dadoDoTipoInteiro == 30){
            System.out.println("Entrou no else if");
        }else {
            System.out.println("Entrou no esle");
        }

        int valorInicail = 0;
        while (valorInicail < 3){
            System.out.println("O valor inicai é menor que 3");
            valorInicail++;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("O valor de i é:" + i);
        }
    }
}
