public class Negation {
    public static void main(String[] args) {
        isNeutralSoldier("yellow", "black");
    }
    public static boolean isNeutralSoldier(String colorArmor, String colorShield) {
        return colorArmor != "red" && colorShield == "black";
}
}
