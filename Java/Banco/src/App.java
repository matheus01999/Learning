public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(12345);
        p1.setDono("Matheus");
        
        p1.estadoAtual();
    }
}
