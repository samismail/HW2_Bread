// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BreadTester {
    public static void main(String[] args) {
        Bagel bagel1 = new Bagel ("Bagel", 1.0, 0, .75, 0, 2.0, 0,1,1);
        System.out.println(bagel1);
        LoafBread loafBread1 = new LoafBread("Loaf Bread", 5.0, 1.75, 2.5, 1, 0, 2.25);
        System.out.println(loafBread1);
        Muffin blueberryMuffin = new Muffin("Blueberry Muffins", 1.5, .25, .75, 2.0, 2, 0, .75, 1, .5, 1.5, 8.0);
        System.out.println(blueberryMuffin);
        SourdoughBread bread = new SourdoughBread("Sourdough Bread", 5.0, 1.5, 2.5, 1.0, 1.0, 1.0, 1.0);
        System.out.println(bread);

    }
}