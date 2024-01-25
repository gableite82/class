package entities;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double precisaNota;

    public String toString(){
        return "ALUNO: " + nome + "\n"
                + "PRIMEIRA NOTA: " + nota1 + "\n"
                + "SEGUNDA NOTA: " + nota2 + "\n"
                + "TERCEIRA NOTA: " + nota3 + "\n"
                + "MEDIA: " + media();
    }
    public double media(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public String aprovacao(){
        if (media() >= 7){
            return "ALUNO APROVADO";
        }else{
            return "ALUNO REPROVADO";
        }
    }

    public String precisaNota(){
        if(media() < 7){
            System.out.println("FALTOU  " + String.format("%.2f",7 - media()) + " PONTOS PARA O ALUNO PASSAR");
        }
        return null;
    }
}
