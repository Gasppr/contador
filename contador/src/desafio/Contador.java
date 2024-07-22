package desafio;

import java.util.Scanner;

public class Contador {

   public static void start(){
        Scanner terminal = new Scanner(System.in);


        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidoException exception){
            System.out.println(  exception.getMessage());
        }
    }


    public static void contar(int paramentroUm , int paramentroDois) throws  ParametrosInvalidoException{

        if (paramentroUm > paramentroDois){
            throw new ParametrosInvalidoException("O primeiro parâmetro é maior que o Segundo parâmetro!");
        }
        int contagem = paramentroDois - paramentroUm;

        for (int i = 0 ; i<=contagem ; i++){
            System.out.println(i);
        }
    }
}
