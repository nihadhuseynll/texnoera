package generic;

public class Main {
    public static void main(String[] args) {
        PairList<String, Integer> nameAgeList = new PairList<>();
        nameAgeList.addPair("Nihad", 21);
        nameAgeList.addPair("Aylin", 19);
        nameAgeList.addPair("Kamran", 25);

        nameAgeList.printAllPairs(); // (Nihad, 21), (Aylin, 19), ...
        System.out.println("Sayı: " + nameAgeList.size());

        try {
            Pair<String, Integer> second = nameAgeList.getPair(10);
            System.out.println("2-ci cütlük: " + second.getFirst() + " - " + second.getSecond());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("aksmasklmdklasdml");
        }catch (IndexOutOfBoundsException ex){
            System.out.println("alksdmlasmdlkmasd");
        }

//        List<String> names = new ArrayList<>();
//        names.add("Nihad");
//        names.add("Aylin");
//        names.add("Kamran");
//
//        DataProcessor<String> nameProcessor = new DataProcessor<>(names);
//        nameProcessor.printAll();
//        System.out.println("First name: " + nameProcessor.getFirst());
//        System.out.println("Total: " + nameProcessor.count());
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//
//        DataProcessor<Integer> numberProcessor = new DataProcessor<>(numbers);
//        numberProcessor.printAll();
//        System.out.println("First number: " + numberProcessor.getFirst());
//        System.out.println("Total: " + numberProcessor.count());
    }
}
