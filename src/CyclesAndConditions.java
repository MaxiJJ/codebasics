public class CyclesAndConditions {
    public static String shouter(String str) {
        int length = str.length();
        String result = "";
        if (length > 5) {
            int counter = 0;
            while (counter != 100) {
                result += str;
                counter += 1;
            }
        }
        if (length > 0 && length <5) {
            return str;
        }
        else if (length == 5) {
            return str; //.repeat(10) повторённую 10 раз
        }
        return result;
    }
}
