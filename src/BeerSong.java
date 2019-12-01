public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle"; //вместо bottles
            }

            System.out.println(beerNum + " " + word + " beer on the wall");
            System.out.println(beerNum + " " + word + " beer");
            System.out.println("Take one");
            System.out.println("Take next maaan");
            beerNum = beerNum - 1;
            if (beerNum > 1) {
                System.out.println(beerNum + " " + word + " beer on the wall");
            }
            else {
                System.out.println("Nothing beer love all mir");
            }
        }
    }
}
