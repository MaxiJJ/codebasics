public class IfElse {
    public static String normalizerUr1(String adres) {
        if (adres.startsWith("http://")) {
            return adres;
        } else {
            return "http://" + adres;
        }
    }
}
