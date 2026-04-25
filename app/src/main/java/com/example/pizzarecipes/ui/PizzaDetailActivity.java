package com.example.pizzarecipes.ui;


import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;


public class PizzaDetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_pizza_detail);


        long id = getIntent().getLongExtra("pizza_id", -1);
        Produit p = ProduitService.getInstance().findById(id);


        ImageView img = findViewById(R.id.photoDetail);
        TextView title = findViewById(R.id.titreDetail);
        TextView meta = findViewById(R.id.metaDetail);
        TextView ingredients = findViewById(R.id.ingredientsDetail);
        TextView desc = findViewById(R.id.descriptionDetail);
        TextView steps = findViewById(R.id.etapesDetail);


        if (p != null) {
            img.setImageResource(p.getImageRes());
            title.setText(p.getNom());
            meta.setText(p.getDuree() + " • " + p.getPrix() + " €");
            ingredients.setText(p.getIngredients());
            desc.setText(p.getDescription());
            steps.setText(p.getEtapes());
        } else {
            title.setText("Pizza introuvable !");
        }
    }
}