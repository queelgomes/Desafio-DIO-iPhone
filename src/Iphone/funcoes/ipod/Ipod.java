package Iphone.funcoes.ipod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ipod {
    Scanner sc = new Scanner(System.in);

    private List<Musica> listaMusicas;
    private Musica musicaReproduzindo = null;

    public Ipod() {
        this.listaMusicas = new ArrayList<>();
    }

    public void adicionarMusica(String nome, String cantor, double duracao, int anoLancamento){
        listaMusicas.add(new Musica(nome, cantor, duracao, anoLancamento));
        System.out.println("    >>> Musica " + nome + " adicionada com sucesso!");
    }
    public void tocarMusica(){
        if (musicaReproduzindo != null){
            System.out.println("\n    >>> PLAY acionado. \nReproduzindo: \n" + musicaReproduzindo);
        } else{
            System.out.println("Selecione uma música antes de acionar o Play.");
        }
    }
    public void pausarMusica(){
        if(musicaReproduzindo != null){
            System.out.print("\n    >>> PAUSE acionado. Digite: \n1 - PLAY | 2 - STOP ");
            int continuar;
            do{
                continuar = sc.nextInt();
                if (continuar == 1){
                    System.out.println("\n    >>> Reproduzindo: " + musicaReproduzindo.getNome());
                    break;
                } else if(continuar == 2){
                    musicaReproduzindo = null;
                    System.out.println("    >>> STOP acionado.");
                    break;
                } else{
                    System.out.print("Opção inválida. Digite novamente\n1 - PLAY | 2 - STOP ");
                }
            }while (continuar > 2);
        }else{
            System.out.println("PAUSE acionado. Nenhuma música sendo reproduzida no momento.");
        }
    }
    public void selecionarMusica(){
        int indice = 1;
        System.out.println("\nBiblioteca iPod:");
        for(Musica m : listaMusicas){
            System.out.println("   [" + indice + "]" + "Música: " + m.getNome() + " | Cantor/Banda: " + m.getCantor());
            indice++;
        }
        System.out.print("Escolha sua música para reproduzir: ");
        int musicaEscolhida = sc.nextInt();
        musicaReproduzindo = listaMusicas.get(musicaEscolhida - 1);
        System.out.println("    >>> Musica " + musicaReproduzindo.getNome() + " selecionada com sucesso.");
    }
}
