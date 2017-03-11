package com.linsh.demo;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.linsh.waveview.PercentWave;
import com.linsh.waveview.WaveView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WaveView waveView = (WaveView) findViewById(R.id.waveview);
        waveView.setOrientation(WaveView.Orientation.DOWN);

        LinearGradient shader = new LinearGradient(0, 0, 0, 600, Color.parseColor("#303F9F"), Color.parseColor("#773F51B5"), Shader.TileMode.CLAMP);
        PercentWave wave1 = new PercentWave(1.50f, 0.03f, 0.018f, 0.26f, shader);
        PercentWave wave2 = new PercentWave(1.28f, 0.02f, -0.02f, 0.28f, shader);
        PercentWave wave3 = new PercentWave(2.08f, 0.01f, 0.01f, 0.49f, shader);
        waveView.addWave(wave1);
        waveView.addWave(wave2);
        waveView.addWave(wave3);
    }
}
