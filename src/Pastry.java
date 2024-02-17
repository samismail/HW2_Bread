public class Pastry extends Bread{

    public Pastry(String breadName, double flour, double water, double salt, double sugar, double bakingPowder, double yeast) {
        super(breadName, flour, water, salt, sugar, bakingPowder, yeast);
    }

    @Override
    public String bake() {
        return super.bake();
    }

    @Override
    public String getIngredients() {
        return super.getIngredients();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
