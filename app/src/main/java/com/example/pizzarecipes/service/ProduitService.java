package com.example.pizzarecipes.service;


import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProduitService implements IDao<Produit> {

    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() {
        seed();
    }


    public static ProduitService getInstance() {
        if (INSTANCE == null) INSTANCE = new ProduitService();
        return INSTANCE;
    }


    private void seed() {
        data.add(new Produit("BARBECUED CHICKEN PIZZA", 3, R.mipmap.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves (6 ounces each)\n- 1/4 teaspoon pepper\n- 1 cup barbecue sauce, divided\n- 1 tube (13.8 ounces) refrigerated pizza crust\n- 2 teaspoons olive oil\n- 2 cups shredded Gouda cheese\n- 1 small red onion, halved and thinly sliced\n- 1/4 cup minced fresh cilantro",
                "So fast and so easy with refrigerated pizza crust, these saucy, smoky pizzas make quick fans with their hot-off-the-grill, rustic flavor. —Alicia Trevithick, Temecula, California",
                "STEP 1:\n\n  Sprinkle chicken with pepper; place on an oiled grill rack over medium heat. Grill, covered, until a thermometer reads 165°, 5-7 minutes per side, basting frequently with 1/2 cup barbecue sauce during the last 4 minutes. Cool slightly. Cut into cubes.\n\nSTEP 2:\n\n  Divide dough in half. On a well-greased large sheet of heavy-duty foil, press each portion of dough into a 10x8-in. rectangle; brush lightly with oil. Invert dough onto grill rack; peel off foil. Grill, covered, over medium heat until bottom is lightly browned, 1-2 minutes.\n\nSTEP 3:\n\n  Remove from grill. Spread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill, covered, until bottom is lightly browned and cheese is melted, 2-3 minutes. Sprinkle with cilantro."));


        data.add(new Produit("BRUSCHETTA PIZZA", 5, R.mipmap.pizza2, "35 min",
                "- 1/2 pound reduced-fat bulk pork sausage\n- 1 prebaked 12-inch pizza crust\n- 1 package (6 ounces) sliced turkey pepperoni\n- 2 cups shredded part-skim mozzarella cheese\n- 1-1/2 cups chopped plum tomatoes\n- 1/2 cup fresh basil leaves, thinly sliced\n- 1 tablespoon olive oil\n- 2 garlic cloves, minced",
                "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes, it's bound to become a family favorite. —Debra Kell, Owasso, Oklahoma",
                "STEP 1:\n\n  In a small skillet, cook sausage over medium heat until no longer pink; drain. Place crust on an ungreased baking sheet. Top with pepperoni, sausage and cheese. Bake at 450° for 10-12 minutes or until cheese is melted.\n\nSTEP 2:\n\n  In a small bowl, combine the tomatoes, sliced basil, oil, garlic, thyme, vinegar, salt and pepper. Spoon over pizza."));


        data.add(new Produit("SPINACH PIZZA", 2, R.mipmap.pizza3, "25 min",
                "- 1 package (6-1/2 ounces) pizza crust mix\n- 1/2 cup Alfredo sauce\n- 2 medium tomatoes\n- 4 cups chopped fresh spinach\n- 2 cups shredded Italian cheese blend",
                "This tasty pizza is so easy to prepare. My family, including my young daughter, loves it. —Dawn Bartholomew, Raleigh, North Carolina",
                "STEP 1:\n\n  Prepare pizza dough according to package directions. With floured hands, press dough onto a greased 12-in. pizza pan.\n\nSTEP 2:\n\n  Spread Alfredo sauce over dough to within 1 in. of edges. Thinly slice or chop tomatoes; top pizza with spinach, tomatoes and cheese.\n\nSTEP 3:\n\n  Bake at 450° for 10-15 minutes or until cheese is melted and crust is golden brown."));


        data.add(new Produit("DEEP-DISH SAUSAGE PIZZA", 8, R.mipmap.pizza4, "45 min",
                "- 1 package (1/4 ounce) active dry yeast\n- 2/3 cup warm water\n- 1-3/4 to 2 cups all-purpose flour\n- 1/4 cup vegetable oil\n- 1 teaspoon each dried oregano, basil and marjoram\n- 1/2 teaspoon garlic salt",
                "My Grandma made the tastiest snacks for us when we stayed the night at her farm. —Michele Madden, Washington Court House, Ohio",
                "STEP 1:\n\n  In a mixing bowl, dissolve yeast in water. Add 1 cup flour, oil and seasonings; beat until smooth. Add enough remaining flour to form a soft dough. Knead until smooth and elastic, 6-8 minutes. Place in a greased bowl; cover and let rise until doubled, about 1 hour.\n\nSTEP 2:\n\n  Punch dough down; roll out into a 15-in. circle. Transfer to a well-greased 12-in. heavy ovenproof skillet. Sprinkle with 1 cup mozzarella. Layer with sausage, onion, green peppers and tomatoes. Fold crust over to form an edge. Bake at 400° for 20 minutes. Sprinkle with pepperoni and remaining mozzarella. Bake 10-15 minutes longer."));


        data.add(new Produit("HOMEMADE PIZZA", 4, R.mipmap.pizza5, "50 min",
                "- 1 package (1/4 ounce) active dry yeast\n- 1 teaspoon sugar\n- 1-1/4 cups warm water\n- 1/4 cup canola oil\n- 1 teaspoon salt\n- 3-1/2 cups all-purpose flour\n- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 can (15 ounces) tomato sauce",
                "This recipe is a hearty, zesty main dish with a crisp, golden crust. —Marianne Edwards, Lake Stevens, Washington",
                "STEP 1:\n\n  Dissolve yeast and sugar in water; let stand for 5 minutes. Add oil and salt. Stir in flour until a soft dough forms.\n\nSTEP 2:\n\n  Knead until smooth and elastic, about 2-3 minutes. Place in a greased bowl, cover and let rise until doubled, about 45 minutes. Meanwhile, cook beef and onion over medium heat until no longer pink; drain.\n\nSTEP 3:\n\n  Punch down dough; divide in half. Press each into a greased 12-in. pizza pan. Top with tomato sauce, beef mixture, green pepper and cheese.\n\nSTEP 4:\n\n  Bake at 400° for 25-30 minutes or until crust is lightly browned."));


        data.add(new Produit("PESTO CHICKEN PIZZA", 3, R.mipmap.pizza6, "50 min",
                "- 2 teaspoons active dry yeast\n- 1 cup warm water\n- 2-3/4 cups bread flour\n- 1 tablespoon olive oil\n- 1 tablespoon sugar\n- 1/2 pound boneless skinless chicken breasts\n- 1 small onion, halved and thinly sliced\n- 3 tablespoons prepared pesto\n- 1-1/2 cups shredded part-skim mozzarella cheese",
                "This is the only pizza I make now. We love it! —Heather Thompson, Woodland Hills, California",
                "STEP 1:\n\n  Dissolve yeast in warm water. Beat in 1 cup flour, oil, sugar and 1 teaspoon salt. Add remaining flour.\n\nSTEP 2:\n\n  Knead until smooth and elastic, 6-8 minutes. Let rise until doubled, about 1 hour.\n\nSTEP 3:\n\n  Cook chicken, onion, peppers and mushrooms in oil until done.\n\nSTEP 4:\n\n  Roll dough into a 15-in. circle. Transfer to pizza pan. Spread with pesto. Top with chicken mixture and cheese.\n\nSTEP 5:\n\n  Bake at 400° for 18-20 minutes or until crust and cheese are lightly browned."));


        data.add(new Produit("LOADED MEXICAN PIZZA", 3, R.mipmap.pizza7, "30 min",
                "- 1 can (15 ounces) black beans, rinsed and drained\n- 1 medium red onion, chopped\n- 1 small sweet yellow pepper, chopped\n- 3 teaspoons chili powder\n- 3/4 teaspoon ground cumin\n- 3 medium tomatoes, chopped\n- 1 prebaked 12-inch thin pizza crust\n- 2 cups chopped fresh spinach",
                "My husband is a picky eater, but this healthy pizza has lots of flavor, and he actually looks forward to it. —Mary Barker, Knoxville, Tennessee",
                "STEP 1:\n\n  In a small bowl, mash black beans. Stir in the onion, yellow pepper, chili powder and cumin.\n\nSTEP 2:\n\n  Place crust on an ungreased 12-in. pizza pan; spread with bean mixture. Top with tomato mixture and spinach. Sprinkle with cilantro, pepper sauce and cheeses.\n\nSTEP 3:\n\n  Bake at 400° for 12-15 minutes or until cheese is melted."));


        data.add(new Produit("BACON CHEESEBURGER PIZZA", 2, R.mipmap.pizza8, "20 min",
                "- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 prebaked Italian bread shell crust (1 pound)\n- 1 can (8 ounces) pizza sauce\n- 6 bacon strips, cooked and crumbled\n- 20 dill pickle coin slices\n- 2 cups shredded mozzarella cheese\n- 2 cups shredded cheddar cheese",
                "Kids of all ages love pizza and cheeseburgers, and this recipe combines them both. —Cherie Ackerman, Lakeland, Minnesota",
                "STEP 1:\n\n  In a skillet, cook beef and onion over medium heat until meat is no longer pink; drain and set aside.\n\nSTEP 2:\n\n  Place crust on an ungreased 12-in. pizza pan. Spread with pizza sauce. Top with beef mixture, bacon, pickles and cheeses. Sprinkle with pizza seasoning. Bake at 450° for 8-10 minutes or until cheese is melted."));


        data.add(new Produit("PIZZA MARGHERITA", 1, R.mipmap.pizza9, "30 min",
                "- 3 teaspoons active dry yeast\n- 1 cup warm water\n- 2 tablespoons olive oil\n- 1 teaspoon sugar\n- 1 teaspoon salt\n- 3 cups bread flour",
                "A classic Pizza Margherita, named for Queen Margherita of Italy, shows off the colors of the Italian flag with red tomatoes, white mozzarella and fresh green basil. —Loretta Lawrence, Myrtle Beach, South Carolina",
                "STEP 1:\n\n  Dissolve yeast in warm water. Add the oil, sugar, salt and 1 cup flour. Beat until smooth. Stir in enough remaining flour to form a soft dough.\n\nSTEP 2:\n\n  Knead until smooth and elastic, about 6-8 minutes. Let rise until doubled, about 1 hour.\n\nSTEP 3:\n\n  Divide in half. Roll each portion into a 13-in. circle. Transfer to two 14-in. pizza pans.\n\nSTEP 4:\n\n  Spoon tomatoes over crusts. Top with basil, cheese, oregano, pepper flakes, salt and pepper. Drizzle with oil. Bake at 450° for 15-20 minutes."));


        data.add(new Produit("PEPPERONI-SAUSAGE STUFFED PIZZA", 5, R.mipmap.pizza10, "45 min",
                "- 1 package (1/4 ounce) active dry yeast\n- 1-1/4 cups warm water\n- 2 tablespoons olive oil\n- 1-1/2 teaspoons salt\n- 1 teaspoon sugar\n- 3-1/2 to 4 cups all-purpose flour",
                "For 30 years, friends have been telling me to open a pizzeria using this recipe. It even freezes well. —Elizabeth Wolff, Carmel, Indiana",
                "STEP 1:\n\n  Dissolve yeast in warm water. Combine oil, salt, sugar, yeast mixture and 1 cup flour; beat on medium speed until smooth. Stir in enough remaining flour to form a stiff dough.\n\nSTEP 2:\n\n  Knead until smooth and elastic, about 6-8 minutes. Let rise until doubled, about 1 hour.\n\nSTEP 3:\n\n  Preheat oven to 425°. Press dough into a 13x9-in. baking pan. Top with mozzarella, cheddar, sausage, mushrooms and pepperoni.\n\nSTEP 4:\n\n  Cover with remaining dough, crimping edges to seal. Bake 10 minutes. Reduce to 375°. Spread pizza sauce over cheese. Bake 30-35 minutes longer."));

    }


    @Override public Produit create(Produit p) { data.add(p); return p; }


    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) { data.set(i, p); return p; }
        }
        return null;

    }


    @Override public boolean delete(long id) { return data.removeIf(x -> x.getId() == id); }


    @Override
    public Produit findById(long id) {
        for (Produit p : data) if (p.getId() == id) return p;
        return null;
    }


    @Override public List<Produit> findAll() { return Collections.unmodifiableList(data); }
}