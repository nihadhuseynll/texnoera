package interfacee;

public class MechanicalEngineer implements IEngineer,Test{
    @Override
    public void militaryService() {
        System.out.println("asdfghjkloiuytrewazxcvbnj");
    }

    @Override
    public String examResult(double grade) {
        return "Ortalam " +grade;
    }

    @Override
    public void workExperience(String[] array) {

        System.out.println("I work this company for java developer");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public void getReferance(String [] array){

        System.out.println("referance");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    @Override
    public void test() {
        System.out.println("test methodu ishledi ");
    }
}
