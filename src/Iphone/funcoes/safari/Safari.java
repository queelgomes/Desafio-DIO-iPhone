package Iphone.funcoes.safari;

public class Safari {
    private String url = null;

    public void setUrl(String url) {
        this.url = url;
    }

    public void exibirPagina(){
        if (url != null){
            System.out.println("URL: " + url);
            System.out.println("Página exibida com sucesso.");
        }else{
            System.out.println("Insira uma url válida.");
        }
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada com sucesso.");
    }
    public void atualizarPagina() {
        if (url != null) {
            System.out.println("Página: " + url + " atualizado com sucesso.");
        } else {
            System.out.println("Nenhuma página aberta no momento.");
        }
    }
}
