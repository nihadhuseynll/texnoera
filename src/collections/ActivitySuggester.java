package collections;

//public class ActivitySuggester {
//
//    public static void suggestActivity(String day) {
//        DayActivity activity = DayActivity.fromString(day);
//        if (activity != null) {
//            System.out.println(capitalize(day) + " activity: " + activity.getActivity());
//        } else {
//            System.out.println("Unknown day");
//        }
//    }
//
//    private static String capitalize(String input) { //moNDay  //monday  //M  //onday  //Monday
//        if (input == null || input.isEmpty()) return input;
//        input = input.toLowerCase();
//        return input.substring(0,1).toUpperCase() + input.substring(1);
//    }
//}