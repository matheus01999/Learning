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
     public void apresentar(){
          System.out.println("Lutador " + this.nome);
          System.out.println("Char " + this.altura + this.peso);
          System.out.println("Categoria " + this.categoria);
          System.out.println("Vitoria " + this.vitoria);
          System.out.println("Derrotas " + this.derrota);
          System.out.println("Empates " + this.empate);
     }
     public void status(){
          System.out.println(getNome());
          System.out.println(getVitoria());
          System.out.println(getDerrota());
     }

     public void ganharLuta(){
          this.setVitoria(this.getVitoria() + 1);
     }

     public void perderLuta(){
          this.setDerrota(this.getDerrota() + 1);
     }

     public void empatarLuta(){
          this.setEmpate(this.getEmpate() + 1);
     }


     //Metodos Especiais
     public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, String categoria, int vitoria, int derrota, int empate){
          this.nome = nome;
          this.nacionalidade = nacionalidade;
          this.idade = idade;
          this.altura = altura;
          this.categoria = categoria;
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

     public float getAltura(){
          return altura;

     }

     public void setAltura(float altura){
          this.altura = altura;
     }

     public float getPeso(){
          return peso;
     }

     public void setPeso(float peso){
          this.peso = peso;
     }

     public String getCategoria(){
          return categoria;
     }

     public void setCategoria(String categoria){
          if (this.peso < 52.2) {
               this.categoria = "invalida";
          }else if(this.peso <= 70.3){
               this.categoria = "Leve";
          }else if(this.peso <= 83.9){
               this.categoria = "Medio";
          }else if(this.peso <= 120.2){
               this.categoria = "Pesado";
          }else{
               this.categoria = "invalida";
          }
     }

     public int getVitoria(){
          return vitoria;
     }

     public void setVitoria(int vitoria){
          this.vitoria = vitoria;
     }

     public int getDerrota(){
          return derrota;
     }

     public void setDerrota(int derrota){
          this.derrota = derrota;
     }

     public int getEmpate(){
          return empate;
     }

     public void setEmpate(int empate){
          this.empate = empate;
     }



     



     
}
