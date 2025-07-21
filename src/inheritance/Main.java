package inheritance;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("aksklas","Red");
        SistemBloku sistemBloku = new SistemBloku("sdfsdfsdf");

        Notebook notebook = new Notebook(monitor,sistemBloku);

        System.out.println(notebook);
    }
}
