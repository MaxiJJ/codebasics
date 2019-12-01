public class Immutability {
    public static void main(String[] args) {
        String str = "a mind needs books as a sword needs a whetstone, if it is to keep its edge.";
        str = str.toUpperCase();
        System.out.print(str);
    }
}

//Функция Math.round вернула новые данные, но не изменила переданные в неё данные.
//Важнее, что она не могла это сделать в принципе, потому что аргументы функций в Java — неизменяемы.