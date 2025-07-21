package inheritance;

public class Notebook {
    private Monitor monitor;
    private SistemBloku sistemBloku;

    public Notebook(Monitor monitor, SistemBloku sistemBloku) {
        this.monitor = monitor;
        this.sistemBloku = sistemBloku;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "monitor=" + monitor +
                ", sistemBloku=" + sistemBloku +
                '}';
    }
}
