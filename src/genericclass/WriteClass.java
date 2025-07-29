package genericclass;

public class WriteClass <Y> {

    public void write(Y[] arrays){
        for (Y element : arrays) {
            System.out.println(element);
        }
    }
}
