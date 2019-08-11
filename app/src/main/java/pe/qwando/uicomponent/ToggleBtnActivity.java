package pe.qwando.uicomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

public class ToggleBtnActivity extends AppCompatActivity {

    @BindView(R.id.tgtxt1)
    TextView tgtxt1;

    @BindView(R.id.tgtxt2)
    TextView tgtxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_btn);
        ButterKnife.bind(this);
    }

    @OnCheckedChanged({R.id.toggle1, R.id.toggle2})
    public void onChecked(CompoundButton button, boolean checked){
        if (checked) {
            switch (button.getId()){
                case R.id.toggle1: tgtxt1.setText("Toggle ON");break;
                case R.id.toggle2: tgtxt2.setText("Toggle ON");break;
            }
        } else {
            switch (button.getId()){
                case R.id.toggle1: tgtxt1.setText("Toggle OFF");break;
                case R.id.toggle2: tgtxt2.setText("Toggle OFF");break;
            }
        }
    }
}
