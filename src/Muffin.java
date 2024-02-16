/*      1 ½ cups (195g) all-purpose flour
        3/4 cup (150g) granulated sugar, plus 1 tablespoon for muffin tops
        1/4 teaspoon fine sea salt
        2 teaspoons baking powder
        1/3 cup (80ml) neutral-flavored oil, safflower, avocado, and vegetable oil are great
        1 large egg
        1/3 to 1/2 cup (80ml to 120ml) milk, dairy and non-dairy both work
        1 ½ teaspoons vanilla extract
        6 to 8 ounces fresh or frozen blueberries, generous 1 cup
 */
public class Muffin extends Pastry{
    protected double oil;
    protected double egg;
    protected double milk;
    protected double vanilla;
    protected double fruit;

    public Muffin(String breadName, double flour, double salt, double sugar,
                  double bakingPowder, double oil, double egg,
                  double milk, double vanilla, double fruit) {
        super("Blueberry Muffins", 1.5, .25, .75, 2.0, 2);
        this.oil = oil;
        this.egg = egg;
        this.milk = milk;
        this.vanilla = vanilla;
        this.fruit = fruit;
    }

    public double getOil() {
        return oil;
    }

    public void setOil(double oil) {
        this.oil = oil;
    }

    public double getEgg() {
        return egg;
    }

    public void setEgg(double egg) {
        this.egg = egg;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public double getVanilla() {
        return vanilla;
    }

    public void setVanilla(double vanilla) {
        this.vanilla = vanilla;
    }

    public double getFruit() {
        return fruit;
    }

    public void setFruit(double fruit) {
        this.fruit = fruit;
    }
}

