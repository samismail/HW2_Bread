/*
5 cups (540g to 600g) King Arthur Unbleached Bread Flour
1 tablespoon (11g) granulated sugar
2 1/4 teaspoons instant yeast
2 1/2 teaspoons (15g) table salt
1 2/3 cups (379g) water, lukewarm (90°F to 110°F)
yellow cornmeal, for coating the pan
 */

public class LoafBread extends Bread{

    public LoafBread(String breadName, double flour, double water, double salt, double sugar, double bakingPowder, double yeast) {
        super("Loaf Bread", 5.0, 1.75, 2.5, 1, 0, 2.25);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + '\n';
    }

    @Override
    public String toString() {
        return super.toString()  + '\n' +
                "1. Stir together all of the ingredients in a large bowl starting with 4 1/2 cups of the flour. " + '\n' +
                "   Use a sturdy spoon, or your stand mixer equipped with the beater paddle. " + '\n' +
                "   Mix until everything comes together in a rough, shaggy mass of dough."  + '\n' +
                "2. If you’re kneading the dough by hand, turn it out onto a lightly floured surface, using some of the additional 1/2 cup of flour called for. " + '\n' +
                "   Fold the far edge of the dough back over on itself towards you, then press it away from you with the heels of your hands. Rotate the dough 90°. " + '\n' +
                "   Repeat this fold-press-rotate process with a rhythmic, rocking motion for about 6 minutes. When fully kneaded, the dough will be bouncy and smooth." + '\n' +
                "3. If you’re using your stand mixer, switch to the dough hook and knead the dough at medium speed for about 7 minutes, until it’s smooth, elastic, and feels a bit bouncy. " + '\n' +
                "   If the dough doesn’t form a ball that clears the sides of the bowl, sprinkle in just enough of the additional flour to make this happen." + '\n' +
                "4. Place the dough in a bowl that’s been lightly greased with vegetable oil or cooking spray; the bowl you started with is fine. " +
                "   Cover the bowl with plastic wrap or another airtight cover, and let the dough rise at room temperature until it's doubled in size, about 1 to 2 hours. " + '\n' +
                "5. Gently deflate the dough and cut it in half. Pat each half into a rough 6” x 8” oval." + '\n' +
                "6. Working with one piece of dough at a time, grab a short side and fold the dough like a business letter" + '\n' +
                "7. Place the loaves, seam-side down, on a baking sheet and let the loaves rise for 45 minutes" + '\n' +
                "8. Preheat the oven to 450 and Bake the bread for 20 to 25 minutes, until the crust is golden brown. " + '\n';
    }
}
