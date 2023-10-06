package Iphone;

import Iphone.funcoes.iphone.Iphone;
import Iphone.funcoes.ipod.Ipod;
import Iphone.funcoes.safari.Safari;
import Iphone.funcoes.telefone.Telefone;

public class Programa {
    public static void main(String[] args) {
        Ipod ipod = new Ipod();
        Telefone telefone = new Telefone();
        Safari safari = new Safari();
        Iphone iphone = new Iphone();

        iphone.inicio();

        iphone.ativarIpod();
        ipod.adicionarMusica("Nome 1", "Cantor 1", 3.22, 2010);
        ipod.adicionarMusica("Nome 2", "Cantor 2", 2.60, 2019);
        ipod.adicionarMusica("Nome 3", "Cantor 3", 4.15, 2001);
        ipod.adicionarMusica("Nome 4", "Cantor 4", 2.93, 2008);
        ipod.pausarMusica();
        ipod.selecionarMusica();

        ipod.pausarMusica();

        telefone.discarNumero();
        telefone.atender();
        telefone.ligar();
        telefone.iniciarCorreioDeVoz();

        safari.setUrl("www.google.com.br");
        safari.adicionarNovaAba();
        safari.exibirPagina();
        safari.atualizarPagina();
    }
}
