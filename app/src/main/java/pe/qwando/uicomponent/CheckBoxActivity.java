package pe.qwando.uicomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CheckBoxActivity extends AppCompatActivity {

    @BindView(R.id.cb_argentina)
    CheckBox cbArgentina;
    @BindView(R.id.cb_belgica)
    CheckBox cbBelgica;
    @BindView(R.id.cb_brasil)
    CheckBox cbBrasil;
    @BindView(R.id.cb_francia)
    CheckBox cbFrancia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        ButterKnife.bind(this);
    }

    public void checkBox(View v){
        if (cbArgentina.isChecked() && cbBrasil.isChecked() && !cbBelgica.isChecked() && !cbFrancia.isChecked()){
            Toast.makeText(CheckBoxActivity.this, "Paises sudamericanos", Toast.LENGTH_SHORT).show();
        }
        if (cbBelgica.isChecked() && cbFrancia.isChecked() && !cbArgentina.isChecked() && !cbBrasil.isChecked()){
            Toast.makeText(CheckBoxActivity.this, "Paises europeos", Toast.LENGTH_LONG).show();
        }
    }
}
