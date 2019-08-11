package pe.qwando.uicomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnItemClick;

public class RatingBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        ButterKnife.bind(this);
    }

    @BindView(R.id.ratingBar)
    RatingBar ratingBar;

    @OnClick(R.id.button)
    public void getRating(View v){
        String ratingValue = String.valueOf(ratingBar.getRating());
        Toast.makeText(this, ratingValue, Toast.LENGTH_LONG).show();
    }


}
