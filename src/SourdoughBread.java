public class SourdoughBread extends Bread{

    protected double sourStarter;

    public SourdoughBread(String breadName, double flour, double water, double salt, double sugar, double bakingPowder, double yeast, double sourStarter) {
        super("Sourdough Bread", 5.0, 1.5, 2.5, 1.0, 1.0, 1.0);
        this.sourStarter = sourStarter;
    }

    public double getSourStarter() {
        return sourStarter;
    }

    public void setSourStarter(double sourStarter) {
        this.sourStarter = sourStarter;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + '\n' +
                bakingPowder + " teaspoons of baking powder" + '\n' +
                sourStarter + " cup of ripe sourdough starter"  + '\n';
    }

    @Override
    public String toString() {
        return super.toString() +
        "1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter."  + '\n' +
        "2. Make the dough"  + '\n' +
        "3. Bulk Rise" + '\n' +
        "4. Stretch and fold the dough"  + '\n' +
        "5. Cut and shape the dough"  + '\n' +
        "6. Second rise" + '\n' +
        "6. Preheat the oven to 450°F towards the tail end of the second rise."  + '\n' +
        "7. Spray the loaf with luke warm water."  + '\n' +
        "8. Bake the bread at 400°F for 20 minutes, until deep golden brown."  + '\n' +
        "9. Remove the bread from the oven." + '\n' +
        "10.Let the bread cool until good to eat.";
    }
}
