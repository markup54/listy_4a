package pl.zabrze.zs10.listy4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button buttonDodaj;
    ListView listView;
    EditText editTextProdukt;
    ArrayList<String> listaProduktow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonDodaj = findViewById(R.id.button);
        listView = findViewById(R.id.listView);
        editTextProdukt = findViewById(R.id.editTextTextPersonName);
        listaProduktow = new ArrayList<>();
        listaProduktow.add("Mleko");
        listaProduktow.add("Mąka");
        listaProduktow.add("Masło");
        listaProduktow.add("Cukier");
        listaProduktow.add("Drożdże");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,listaProduktow);
        listView.setAdapter(adapter);

        buttonDodaj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String produkt = editTextProdukt.getText().toString();
                        listaProduktow.add(produkt);
                        adapter.notifyDataSetChanged();
                    }
                }
        );

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        listaProduktow.remove(i);
                        adapter.notifyDataSetChanged();
                    }
                }
        );

    }
}