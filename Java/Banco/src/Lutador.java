public class Lutador {
     //Atributos
     private String nome;
     private String nacionalidade;
     private int idade;
     private float altura;
     private float peso;
     private String categoria;
     private int vitoria, derrota, empate;

     //Metodos Publicos
     public void apresentar(){}
     public void status(){}
     public void ganharLuta(){}
     public void perderLuta(){}
     public void empatarLuta(){}

     //Metodos Especiais
     public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota, int empate){
          this.nome = nome;
          this.nacionalidade = nacionalidade;
          this.idade = idade;
          this.altura = altura;
          this.vitoria = vitoria;
          this.derrota = derrota;
          this.empate = empate;

     }

     public String getNome(){
          return nome;
     }

     public void setNome(String nome){
          this.nome = nome;
     }

     public String getNacionalidade(){
          return nacionalidade;
     }

     public void setNacionalidade(String nacionalidade){
          this.nacionalidade = nacionalidade;
     }

     public int getIdade(){
          return idade;
     }

     public void setIdade(int idade){
          this.idade = idade;
     }

     



     
}
