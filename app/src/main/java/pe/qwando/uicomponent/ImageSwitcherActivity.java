package pe.qwando.uicomponent;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ImageSwitcherActivity extends AppCompatActivity {

    private int imageSwitcherImages[] = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
    };

    private int counter = 0;

    @BindView(R.id.image_switcher)
    ImageSwitcher imgSw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher);
        ButterKnife.bind(this);

        imgSw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView switcherImageView = new ImageView(getApplicationContext());
                switcherImageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT
                ));
                switcherImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                if(imageSwitcherImages.length > 0)
                    switcherImageView.setImageResource(imageSwitcherImages[0]);
                return switcherImageView;
            }
        });

        Animation animationOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        imgSw.setOutAnimation(animationOut);

        Animation animationIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        imgSw.setInAnimation(animationIn);


    }

    public void prevImageButton(View view) {
        counter--;
        if (counter == -1)
            counter = imageSwitcherImages.length - 1;

        imgSw.setImageResource(imageSwitcherImages[counter]);
    }

    public void nextImageButton(View view) {
        counter++;
        if (counter == imageSwitcherImages.length)
            counter = 0;

        imgSw.setImageResource(imageSwitcherImages[counter]);
    }

}
