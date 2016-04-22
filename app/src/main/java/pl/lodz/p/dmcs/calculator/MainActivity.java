package pl.lodz.p.dmcs.calculator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;

import static pl.lodz.p.dmcs.calculator.R.id.aboutButton;
import static pl.lodz.p.dmcs.calculator.R.id.advancedButton;
import static pl.lodz.p.dmcs.calculator.R.id.exitButton;
import static pl.lodz.p.dmcs.calculator.R.id.simpleButton;
import static pl.lodz.p.dmcs.calculator.R.id.settingsButton;

/**
 * @author Mateusz Wieczorek
 */
public class MainActivity extends Activity {

    private Button simpleButt;
    private Button advancedButt;
    private Button settingsButt;
    private Button aboutButt;
    private Button exitButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
//        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.click_clack);
//        mediaPlayer.start();
        initButtons();
        initOnClickReactions();
    }

    private void initButtons() {
        simpleButt = (Button) findViewById(simpleButton);
        advancedButt = (Button) findViewById(advancedButton);
        settingsButt = (Button) findViewById(settingsButton);
        aboutButt = (Button) findViewById(aboutButton);
        exitButt = (Button) findViewById(exitButton);
    }

    private void initOnClickReactions() {

        simpleButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                Intent intent = new Intent(MainActivity.this, SimpleActivity.class);
                startActivity(intent);
            }
        });

        advancedButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                Intent intent = new Intent(MainActivity.this, AdvancedActivity.class);
                startActivity(intent);
            }
        });

        settingsButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        aboutButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        exitButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                finish();
                System.exit(0);
            }
        });


        settingsButt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
                return true;
            }
        });
    }
}
