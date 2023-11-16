package lab4.utils;

import java.util.ArrayList;

public class GetArrayString {

    private GetArrayString(){}

//    public static String getArrayString(ArrayList<?> strings) {
//        String s = "";
//        if (strings.size() == 1) {
//            return " " + strings.get(0);
//        } else if (strings.size() == 2) {
//            return " " + strings.get(0) + " и " +
//                    strings.get(1);
//        } else {
//            for (String string : strings.subList(0, strings.size() - 2)) {
//                s += string + ", ";
//            }
//            s +=  strings.get(strings.size() - 2) +
//                    " и " + strings.get(strings.size() - 1);
//            return s;
//        }
//    }

    public static String getArrayString(ArrayList<?> objects) {
        String s = "";
        if (objects.isEmpty()) return s;
        if (objects.size() == 1) {
            return " " + objects.get(0).toString();
        } else if (objects.size() == 2) {
            return " " + objects.get(0).toString() + " и " +
                    objects.get(1).toString();
        } else {
            for (Object action : objects.subList(0, objects.size() - 2)) {
                s += action.toString() + ", ";
            }
            s +=  objects.get(objects.size() - 2).toString() +
                    " и " + objects.get(objects.size() - 1).toString();
            return s;
        }
    }
}
