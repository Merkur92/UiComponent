package pe.qwando.uicomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

public class SwitchBtnActivity extends AppCompatActivity {

    @BindView(R.id.textView1)
    TextView txt1;

    @BindView(R.id.textView2)
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_btn);
        ButterKnife.bind(this);
    }

    @OnCheckedChanged({R.id.switch1, R.id.switch2})
    public void onChecked(CompoundButton button, boolean checked){
        if (checked) {
            switch (button.getId()){
                case R.id.switch1: txt1.setText("SW ON");break;
                case R.id.switch2: txt2.setText("SW ON");break;
            }
        } else {
            switch (button.getId()){
                case R.id.switch1: txt1.setText("SW OFF");break;
                case R.id.switch2: txt2.setText("SW OFF");break;
            }
        }
    }

}
