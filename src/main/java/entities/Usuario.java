package entities;

public class Usuario {
    public int ID;
    public String nome;
    public String plano;
    public double valorPlano;
    public int quantidadeUsuarios;

//    public Usuario(int ID, String nome, String plano, double valorPlano, int quantidadeUsuarios) {
//        this.ID = ID;
//        this.nome = nome;
//        this.plano = plano;
//        this.valorPlano = valorPlano;
//        this.quantidadeUsuarios = quantidadeUsuarios;
//    }

    public double mensalidade(){
        return quantidadeUsuarios * valorPlano;
    }

}
