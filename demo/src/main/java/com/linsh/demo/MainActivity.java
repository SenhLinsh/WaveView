package com.linsh.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.linsh.waveview.Wave;
import com.linsh.waveview.WaveView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WaveView waveView = (WaveView) findViewById(R.id.waveview);
        waveView.setOrientation(WaveView.Orientation.DOWN);

        int color = Color.parseColor("#55303F9F");
        Wave wave1 = new Wave(1080, 30, 5, 45, color);
        Wave wave2 = new Wave(1620, 26, -6, 50, color);
        Wave wave3 = new Wave(2080, 3, 3, 300, color);
        waveView.addWave(wave1);
        waveView.addWave(wave2);
        waveView.addWave(wave3);

//        LinearGradient shader = new LinearGradient(0, 0, 0, 1920, Color.parseColor("#303F9F"), Color.parseColor("#553F51B5"), Shader.TileMode.CLAMP);
//        PercentWave wave1 = new PercentWave(1.50f, 0.03f, 0.018f, 0.11f, shader);
//        PercentWave wave2 = new PercentWave(1.28f, 0.02f, -0.02f, 0.12f, shader);
//        PercentWave wave3 = new PercentWave(2.08f, 0.01f, 0.01f, 0.20f, shader);
//        waveView.addWave(wave1);
//        waveView.addWave(wave2);
//        waveView.addWave(wave3);
    }
}
