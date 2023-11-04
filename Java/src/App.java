public class App {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Matheus", "'Brasil'", 25, 1.78f, 55f, 15, 4, 2);
        l[1] = new Lutador("suado", "'argentina'", 25, 1.78f, 60f, 15, 4, 2);
        l[2] = new Lutador("Matheus", "'Brasil'", 25, 1.78f, 95f, 15, 4, 2);
        l[3] = new Lutador("Matheus", "'Brasil'", 25, 1.78f, 81f, 15, 4, 2);
        l[4] = new Lutador("Matheus", "'Brasil'", 25, 1.78f, 110.2f, 15, 4, 2);
        l[5] = new Lutador("Matheus", "'Brasil'", 25, 1.78f, 114.5f, 15, 4, 2);

        l[3].status();

}

}
