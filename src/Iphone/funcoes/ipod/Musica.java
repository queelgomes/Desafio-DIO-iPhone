package Iphone.funcoes.ipod;

public class Musica {
    private String nome;
    private String cantor;
    private double duracao;
    private int anoLancamento;

    public Musica(String nome, String cantor, double duracao, int anoLancamento) {
        this.nome = nome;
        this.cantor = cantor;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }
    public String getCantor() {
        return cantor;
    }

    @Override
    public String toString() {
        return String.format("""
                Música: %s
                Cantor/Banda: %s
                Duração: %.2f
                Ano de Lançamento: %d""", nome, cantor, duracao, anoLancamento);
    }

}
