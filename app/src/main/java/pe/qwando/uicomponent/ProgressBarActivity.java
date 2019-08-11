package pe.qwando.uicomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

public class ProgressBarActivity extends AppCompatActivity {

    private EditText numbertext;
    private ProgressBar progressbar1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        numbertext = (EditText) findViewById(R.id.numberText);
        progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
        progressbar1.setProgress(30);
    }

    public void show(View view){
        int value = Integer.parseInt(numbertext.getText().toString());
        progressbar1.setProgress(value);
    }

}
