package interfacee;

public class PCEngineer implements IEngineer{

    private boolean militaryService;

    @Override
    public void militaryService() {

        if (militaryService) {
            System.out.println("Military Service");
        }else {
            System.out.println("Not Military Service");
        }
    }

    @Override
    public String examResult(double grade) {
        return "Ortalama " + grade;
    }

    @Override
    public void workExperience(String[] array) {

        System.out.println("I work this company for java developer");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
