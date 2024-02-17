public class Muffin extends Pastry{
    protected double oil;
    protected double egg;
    protected double milk;
    protected double vanilla;
    protected double fruit;

    public Muffin(String breadName, double flour, double water, double salt, double sugar,
                  double bakingPowder, double yeast, double oil, double egg,
                  double milk, double vanilla, double fruit) {
        super("Blueberry Muffins", 1.5, .25, .75, 2.0, 2, yeast);
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

    @Override
    public String bake() {
        return super.bake();
    }

    @Override
    public String getIngredients() {
        return flour + " cups of flour" + '\n' +
                water + " cups of water" + '\n' +
                salt + " teaspoons of salt" + '\n' +
                sugar + " teaspoons of sugar" + '\n' +
                bakingPowder + " teaspoons baking powder" + '\n' +
                oil + " neutral-flavored oil" + '\n' +
                egg + " egg" + '\n' +
                milk + " cups of milk" + '\n' +
                vanilla + " teaspoons of vanilla extract" + '\n' +
                fruit + " ounces fresh or frozen blueberries" + '\n';
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "1. Heat oven to 400° Fahrenheit" + '\n' +
                "2. Whisk the flour, sugar, baking powder, and salt in a large bowl. "+ '\n' +
                "3. Add oil, milk and the egg to a measuring jug that holds at least 1 cup " + '\n' +
                "   then add vanilla and whisk to combine." + '\n' +
                "4. Finally mix milk mixture to the bowl with dry ingredients " + '\n' +
                "   then use a fork to combine. Do not over mix. batter will be thick" + '\n' +
                "5. Divide the batter between muffin cups." + '\n' +
                "6. Bake muffins 15 to 20 minutes or until tops are no longer wet and a toothpick inserted " + '\n' +
                "   into the middle of a muffin comes out with crumbs, not wet batter." + '\n' + bake() + '\n';
    }
}


