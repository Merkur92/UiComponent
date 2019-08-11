package pe.qwando.uicomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpinnerActivity extends AppCompatActivity {

    @BindView(R.id.spinner)
    Spinner spinner;
    String[] strings;
    List<String> listaPaises;
    ArrayAdapter<String> comboAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        ButterKnife.bind(this);
        listaPaises = new ArrayList<>();
        strings = new String[] {
                "Peru",
                "Argentina",
                "Brasil",
                "Uruguay"
        };

        Collections.addAll(listaPaises, strings);
        comboAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, listaPaises);
        spinner.setAdapter(comboAdapter);

    }

}
