package inheritance;

public class SistemBloku {
    private String marka;

    public SistemBloku(String marka) {
        this.marka = marka;
    }
    public void getInfo(){
        System.out.println("Marka: " + marka);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "SistemBloku{" +
                "marka='" + marka + '\'' +
                '}';
    }
}
