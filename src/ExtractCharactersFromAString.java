public class ExtractCharactersFromAString {
    public static void main(String[] args) {
        String one = "Naharis";
        String two = "Mormont";
        String three = "Sand";
        System.out.print(one.charAt(2) + " ");
        System.out.print(two.charAt(1) + " ");
        System.out.print(three.charAt(3) + " ");
        System.out.print(two.charAt(4) + " ");
        System.out.print(two.charAt(2));
    }
}
//charAt(int index) - специальный метод извлечения символа из строки.
//Индекс - позиция символа внутри строки. Индексы начинаются с 0, поэтому чтобы получить первый символ, нужно указать 0.