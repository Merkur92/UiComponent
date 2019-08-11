package pe.qwando.uicomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({
            R.id.btn_scrollview_vertical,
            R.id.btn_scrollview_horizontal,
            R.id.btn_android_btn,
            R.id.btn_android_image_btn,
            R.id.btn_edit_text,
            R.id.btn_checkbox,
            R.id.btn_radio_btn,
            R.id.btn_switch_btn,
            R.id.btn_toggle_btn,
            R.id.btn_rating_bar,
            R.id.btn_spinner,
            R.id.btn_progress_bar,
            R.id.btn_date_picker,
            R.id.btn_time_picker,
            R.id.btn_fab,
            R.id.btn_floating_label,
            R.id.btn_seekbar,
            R.id.btn_simple_alert_dialog,
            R.id.btn_custom_alert_dialog,
            R.id.btn_snackbar,
            R.id.btn_notification,
            R.id.btn_image_switcher,
            R.id.btn_video_view,
            R.id.btn_web_view,
            R.id.btn_search_view_activity,
            R.id.btn_calendar
    })
    public void goTo(View v){
        switch (v.getId()){
            case R.id.btn_scrollview_vertical: startAct(ScrollVertical.class); break;
            case R.id.btn_scrollview_horizontal: startAct(ScrollHorizontal.class); break;
            case R.id.btn_android_btn: startAct(AndroidBtnActivity.class); break;
            case R.id.btn_android_image_btn: startAct(AndroidImageBtnActivity.class); break;
            case R.id.btn_edit_text: startAct(EditTextActivity.class); break;
            case R.id.btn_checkbox: startAct(CheckBoxActivity.class); break;
            case R.id.btn_radio_btn: startAct(RadioBtnActivity.class); break;
            case R.id.btn_switch_btn: startAct(SwitchBtnActivity.class); break;
            case R.id.btn_toggle_btn: startAct(ToggleBtnActivity.class); break;
            case R.id.btn_rating_bar: startAct(RatingBarActivity.class); break;
            case R.id.btn_spinner: startAct(SpinnerActivity.class); break;
            case R.id.btn_progress_bar: startAct(ProgressBarActivity.class); break;
            case R.id.btn_date_picker: startAct(DatePickerActivity.class); break;
            case R.id.btn_time_picker: startAct(TimePickerActivity.class); break;
            case R.id.btn_fab: startAct(FabActivity.class); break;
            case R.id.btn_floating_label: startAct(FloatingLabelsActivity.class); break;
            case R.id.btn_seekbar: startAct(SeekBarActivity.class); break;
            case R.id.btn_simple_alert_dialog: startAct(SimpleAlertDialogActivity.class); break;
            case R.id.btn_custom_alert_dialog: startAct(CustomAlertDialogActivity.class); break;
            case R.id.btn_snackbar: startAct(SnackBarActivity.class); break;
            case R.id.btn_notification: startAct(NotificationActivity.class); break;
            case R.id.btn_image_switcher: startAct(ImageSwitcherActivity.class); break;
            case R.id.btn_video_view: startAct(VideoViewActivity.class); break;
            case R.id.btn_web_view: startAct(WebViewActivity.class); break;
            case R.id.btn_search_view_activity: startAct(SearchViewActivity.class); break;
            case R.id.btn_calendar: startAct(CalendarActivity.class); break;
        }
    }

    public void startAct(Class v){
        startActivity(new Intent(this,v));
    }



}
