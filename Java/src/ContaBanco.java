public class ContaBanco {
     //Atributos da conta
     public int numConta;
     protected String tipo;
     private String dono;
     private float saldo;
     private boolean status;

     //Metodos Personalizados
     public void estadoAtual(){
          System.out.println("Conta: " + this.getNumConta());
          System.out.println("Saldo: " + this.getSaldo());
     }
     public void abrirConta(String tipo){
          this.setTipo(tipo);
          if(tipo == "CC"){
               this.setSaldo(50);
          }else if(tipo == "CP"){
               this.setSaldo(150);
          }
     }

     public void fecharConta(){
          if(this.getSaldo() == 0){
               this.setStatus(false);
               System.out.println("Conta encerrada");
          }else if(this.getSaldo() > 0 ){
               System.out.println("Favor efetuar a retirada do seu saldo de " + this.getSaldo() + "para encerra a conta");
          }else if(this.getSaldo() < 0 ){
               System.out.println("Voce possui debitos a serem pagos no valor de " + this.getSaldo() );
          }
     }

     public void depositar(float valorDepositado){
          if(isStatus()){
               this.setSaldo(this.getSaldo() + valorDepositado);
               System.out.println("Deposito no valor de "+ valorDepositado +" realizado com sucesso na conta " + this.getNumConta() );
          }else{
               System.out.println("Sua conta está desativada");
          }

     }


     public void sacar(float valorSacar){
          if(this.isStatus()){
               if(getSaldo() >= valorSacar){
               this.setSaldo(this.getSaldo() - valorSacar);
               System.out.println("Você realizou o saque de R$" + valorSacar);
          }else{
               System.out.println("Seu saldo é insuficiente para esse saque");
          }

          }else{
               System.out.println("Sua conta esta desativada!!");
          }
     }

     public void pagarMensal( float mensalidade){
          mensalidade = 0;
          if(getTipo() == "CC"){
               mensalidade = 12;
          }else if(getTipo() == "CP"){
               mensalidade = 20;
          }
          if(isStatus()){
               this.setSaldo(this.getSaldo() - mensalidade);
          }
     }

     //Metodos Especiais
     public  ContaBanco(){
          this.setSaldo(0);
          this.setStatus(false);
     }

     public void setNumConta(int n){
          this.numConta = n;
     }

     public int getNumConta(){
          return numConta;
     }

     public String getTipo(){
          return tipo;
     }

     public void setTipo(String tipo){
          this.tipo = tipo;
     }

     public String getDono(){
          return dono;
     }

     public void setDono(String dono){
          this.dono = dono;
     }

     public float getSaldo(){
          return saldo;
     }

     public void setSaldo(float saldo){
          this.saldo = saldo;

     }

     public boolean isStatus(){
          return status;
     }

     public void setStatus(boolean status){
          this.status = status;
     }

     

     
}
