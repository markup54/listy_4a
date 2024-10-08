package pl.zabrze.zs10.listy4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivityRecycler extends AppCompatActivity {
    Button button;
    ListView listView;
    EditText editText;
    ArrayList<Produkt> produkty = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);
        produkty.add(new Produkt("jabłka",3.98,10));
        produkty.add(new Produkt("gruszki",5.98,3));
        produkty.add(new Produkt("woda",2,6));
        produkty.add(new Produkt("sok",2,6));
        produkty.add(new Produkt("mleko",2,6));
        produkty.add(new Produkt("jaja",2,6));
        produkty.add(new Produkt("banany",2,6));



    }
}