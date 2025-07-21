package interfacee;

public class Main {

    public static void main(String[] args) {

        IEngineer pc = new PCEngineer();
        System.out.println(pc.examResult(52.1));
        pc.militaryService();
        String [] array = {"Volvo","KB","ABB","Crossover"};
        pc.workExperience(array);

        System.out.println("1234567890-=");

        MechanicalEngineer mc = new MechanicalEngineer();

        String [] array2 = {"Volvo","KB","ABB","Crossover"};
        mc.workExperience(array2);
        String [] array3 = {"Volvo","KB","ABB","Crossover"};
        mc.workExperience(array3);
        mc.militaryService();
        mc.test();
    }
}
