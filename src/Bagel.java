/*
1 cup All Purpose Flour (unbleached, whole wheat or gluten-free mix, 5 oz in weight)
2 teaspoons Baking Powder (make sure it 's not expired or it wo n't rise)
¾ teaspoon Kosher Salt (use less if using table salt)
1 cup Non-Fat Greek Yogurt (not regular yogurt, it will be too sticky, Stonyfield)
1 Whole Egg (or egg white, beaten)
 */

public class Bagel extends Bread{
    protected double egg;
    protected double yogurt;

    public Bagel(String breadName, double flour, double water, double salt,
                 double sugar, double bakingPowder, double yeast, double egg, double yogurt) {
        super("Bagel", 1.0, water, .75, sugar, 2.0, yeast);
        this.egg = egg;
        this.yogurt = yogurt;
    }

    public double getEgg() {
        return egg;
    }

    public void setEgg(double egg) {
        this.egg = egg;
    }

    public double getYogurt() {
        return yogurt;
    }

    public void setYogurt(double yogurt) {
        this.yogurt = yogurt;
    }

    @Override
    public String bake() {
        return super.bake();
    }

    @Override
    public String getIngredients() {
        return "Ingredients of " + breadName + " are:" + '\n' +
                flour + " cups of flour" + '\n' +
                bakingPowder + " cups of baking powder" + '\n' +
                salt + " tsps of salt" + '\n' +
                yogurt + " cup of Non-Fat Greek yogurt" + '\n' +
                egg + " whole egg";
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "1. Preheat oven to 375F. Place parchment paper or a silpat on a baking sheet. " + '\n' +
                "   If using parchment paper, spray with oil to avoid sticking." + '\n' +
                "2. In a medium bowl combine the flour, baking powder and salt and whisk well. " + '\n' +
                "   Add the yogurt and mix with a fork or spatula until well combined, it will look like small crumbles." + '\n' +
                "3. Lightly dust flour on a work surface and remove dough from the bowl, knead the dough a few times until dough is tacky, " + '\n' +
                "   but not sticky, about 15 turns (it should not leave dough on your hand when you pull away)." + '\n' +
                "4. Divide into 4 equal balls. Roll each ball into 3/4-inch thick ropes and join the ends to form bagels. " + '\n' +
                "   (or you can make a ball and poke a hole in the center then stretch it slightly)" + '\n' +
                "5. Top with egg wash and sprinkle both sides with seasoning of your choice if desired. " + '\n'+
                "   Bake on the top rack of the oven for 25 minutes." + '\n';
    }
}
