public class ControleRemoto  implements Controlador{
     //atributos
     private int volume;
     private boolean ligado;
     private boolean tocando;

     public ControleRemoto(){
          this.volume = 50;
          this.tocando = false;
          this.ligado = false;

     }

     private int getVolume(){
          return volume;
     }

     private void setVolume(int volume){
          this.volume = volume;
     }

     private boolean getLigado(){
          return ligado;
     }

     private void setLigado(boolean ligado){
          this.ligado = ligado;
     }

     private boolean getTocando(){
          return tocando;
     }

     private void setTocando(boolean tocando){
          this.tocando = tocando;
     }

     //metodos abstratos

     @Override
     public void ligar() {
          
          this.setLigado(true);
          System.out.println("ligadoooo");
     }

     @Override
     public void desligar() {
          
          this.setLigado(false);
     }

     @Override
     public void abrirMenu() {
          
          System.out.println("Esta ligado" + this.getLigado());
          System.out.println("Esta tocando" + this.getTocando());
          System.out.print("Volume: " + this.getVolume() + " ");
          for (int i = 0; i <= this.getVolume(); i+=10){
               System.out.print("=");
          }

     }

     @Override
     public void fecharMenu() {
          System.out.println("Fechando menu...");
     }

     @Override
     public void maisVolume() {
          if(this.getLigado() == true){
               this.setVolume(this.getVolume() + 1);
          }else{
               System.out.println("impossivel aumentar o volume com o equipamneto desligado");
          }
     }

     @Override
     public void menosVolume() {
          if(this.getLigado() == true){
               this.setVolume(this.getVolume() - 1);
          }else{
               System.out.println("Impossivel diminiuir com o equipamneto deligado");
          }
     }

     @Override
     public void ligarMudo() {
          if(this.getVolume() > 0 && this.getLigado()){
               this.setVolume(0);
               System.out.println("Mudo");
          }else{
               System.out.println("Mudo já esta ativo");
          }
     }

     @Override
     public void desligarMudo() {
          if(this.getVolume() == 0 && this.getLigado()){
               this.setVolume(50);
               System.out.println("Volume: " + this.getVolume());
          }else{
               System.out.println("Som ligado");
          }
     }

     @Override
     public void play() {
          if(this.getLigado() && !(this.getTocando())){
               this.setTocando(true);
               System.out.println("Play");
          }
     }

     @Override
     public void pause() {
          if(this.getLigado() == false && this.getTocando()){
               this.setTocando(false);
               System.out.println("Pause");
          }
          
     }

     



     
}
