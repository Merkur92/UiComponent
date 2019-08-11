package pe.qwando.uicomponent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SnackBarActivity extends AppCompatActivity {

    @BindView(R.id.constraint_layout)
    ConstraintLayout principal_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        ButterKnife.bind(this);
    }

    public void showSnackbar(View view){
        // Texto informativo
        Snackbar mySnackbar = Snackbar.make(principal_layout,
                "Hola", Snackbar.LENGTH_SHORT);
        //Link
        mySnackbar.setAction("Text Bottom", new MyUndoListener());
        mySnackbar.show();
    }

    public class MyUndoListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            finish();
        }
    }


}
