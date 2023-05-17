public class Linguagem {
    /*Classe: Em programação orientada a objetos, uma classe é um modelo para
criar objetos. Nesse caso, estamos criando uma classe chamada Linguagem.
Método main(): Este é o ponto de entrada para qualquer aplicação Java.
Quando você inicia um programa Java, é esse método que o sistema operacional
chama.
Campos: São variáveis que contêm algum tipo de informação. No nosso caso,
a classe Linguagem tem quatro campos*/
    protected String nome;
    protected int numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    //construtor
    public Linguagem(String nome, int numFalantes, String regioesFaladas,String ordemDasPalavras) {
    this.nome = nome;
    this.regioesFaladas = regioesFaladas;
    this.ordemDasPalavras = ordemDasPalavras;
    this.numFalantes = numFalantes;       
    }

    public void getInfo() {
        System.out.println( nome + " é falado por " + numFalantes + " pessoas principalmente em "
        + regioesFaladas);
    }
    public static void main(String[] args) {
        Linguagem portugues = new Linguagem("Portugues", 751, " AmericaDoSul", "escrita");
        portugues.getInfo();
        Mayan mayan = new Mayan("Mayan", 1000);
        mayan.getInfo();
        SinoTibetan sino = new SinoTibetan("Mandarim", 1000);
        sino.getInfo();
        SinoTibetan birmanes = new SinoTibetan("Bermanes", 1000);
        birmanes.getInfo();
    }
}
