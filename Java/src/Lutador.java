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
          System.out.println("Apresentamos o lutador  " + this.nome);
          System.out.println("Diretamente de " + this.nacionalidade);
          System.out.println("Categoria " + this.categoria);
          System.out.println("Vitoria " + this.vitoria);
          System.out.println("Derrotas " + this.derrota);
          System.out.println("Empates " + this.empate);
     }
     public void status(){
          System.out.println("informações do lutador");
          System.out.println("-----------------------");
          System.out.println("Nome: " + getNome());
          System.out.println("Nacionalidade: " + getNacionalidade());
          System.out.println("Idade: " + getIdade());
          System.out.println("Altura: " + getAltura());
          System.out.println("Peso " + getPeso());
          System.out.println("Categoria: " + getCategoria());
          System.out.println("");
          System.out.println("Potuação");
          System.out.println("--------------------------");
          System.out.println("Vitorias " + getVitoria());
          System.out.println("Derrotas " + getDerrota());
          System.out.println("Empates: " + getEmpate());
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
     public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,  int vitoria, int derrota, int empate){
          this.nome = nome;
          this.nacionalidade = nacionalidade;
          this.idade = idade;
          this.altura = altura;
          this.vitoria = vitoria;
          this.derrota = derrota;
          this.empate = empate;
          this.setPeso(peso);

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
          this.setCategoria(categoria);
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
