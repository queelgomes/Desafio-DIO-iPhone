package Iphone.funcoes.telefone;

import java.util.Random;
import java.util.Scanner;

public class Telefone implements Teclado {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    private int chamadaRecebidaUm = rd.nextInt(9999);
    private int chamadaRecebidaDois = rd.nextInt(9999);
    private int ligarNumero = 0;

    public void ligar() {
        discarNumero();
        if(ligarNumero > 111111111){
            System.out.print("Ligando para o número ");
            String numero = String.valueOf(ligarNumero);
            System.out.println(numero.substring(0, 5) + "-" + numero.substring(5) + ".");
        }else{
            System.out.println("Formato de número permitido: 123456789.\nReinicie o programa.");
        }
    }
    public  void atender(){
        System.out.printf("Número 9%d-%d ligando.%n", chamadaRecebidaUm, chamadaRecebidaDois);
    }
    public void iniciarCorreioDeVoz(){
        System.out.println("Ligando Correio de Voz ...");
    }

    @Override
    public void discarNumero() {
        System.out.print("Digite o numero: ");
        try{
            this.ligarNumero = sc.nextInt();
        }catch (Exception e){
            System.out.println("Digite apenas numeros.");
        }

    }
}
