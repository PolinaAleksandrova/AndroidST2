package aleksandrova.PZPI_19_6_LB_2;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int Red = 0;
    private int Green = 0;
    private int Blue = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar first_seek_bar = findViewById(R.id.seekBar1);
        SeekBar second_seek_bar = findViewById(R.id.seekBar2);
        SeekBar third_seek_bar = findViewById(R.id.seekBar3);

        ImageView imageView = findViewById(R.id.main_image_view);

        first_seek_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                Red = progress;
                imageView.setBackgroundColor(Color.rgb(Red, Green, Blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        second_seek_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                Green = progress;
                imageView.setBackgroundColor(Color.rgb(Red, Green, Blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        third_seek_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                Blue = progress;
                imageView.setBackgroundColor(Color.rgb(Red, Green, Blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}