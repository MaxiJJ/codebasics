public class ErrorsVariables {
    public static void main(String[] args) {
//Error: java: cannot find symbol
//symbol: variable greeting (Говорит о том, что переменная не определнна)
        String family = "Targaryen";
        String pet = "Dragon";
        System.out.print(family);
        System.out.print(" and ");
        System.out.print(pet);

    }
}
