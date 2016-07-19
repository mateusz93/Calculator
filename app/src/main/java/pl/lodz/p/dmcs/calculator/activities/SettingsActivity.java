package pl.lodz.p.dmcs.calculator.activities;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import pl.lodz.p.dmcs.calculator.R;

/**
 * @author Mateusz Wieczorek
 */
public class SettingsActivity extends Activity {

    private AudioManager audioManager;

    private TextView vibration;
    private TextView sound;
    private Switch vibrationSwitch;
    private Switch soundSwitch;
    private RadioGroup language;

    private static boolean vibrationStatus = true;
    private static boolean soundStatus = false;
    private static String languageStatus = "english";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        init();
        initOnClicks();
        vibrationSwitch.setChecked(vibrationStatus);
        soundSwitch.setChecked(soundStatus);
        if ("english".equals(languageStatus)) {
            language.check(1);
        } else {
            language.check(0);
        }
    }

    private void init() {
        vibrationSwitch = (Switch) findViewById(R.id.vibrationSwitch);
        soundSwitch = (Switch) findViewById(R.id.soundSwitch);
        vibration = (TextView) findViewById(R.id.vibration);
        sound = (TextView) findViewById(R.id.sound);
        language = (RadioGroup) findViewById(R.id.languageRadioGroup);
        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
    }

    private void initOnClicks() {
        vibrationSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    audioManager.setVibrateSetting(AudioManager.VIBRATE_TYPE_RINGER,
                            AudioManager.VIBRATE_SETTING_ON);
                    audioManager.setVibrateSetting(AudioManager.VIBRATE_TYPE_NOTIFICATION,
                            AudioManager.VIBRATE_SETTING_ON);
                    vibrationSwitch.setChecked(true);
                    vibrationStatus = true;
                } else {
                    audioManager.setVibrateSetting(AudioManager.VIBRATE_TYPE_RINGER,
                            AudioManager.VIBRATE_SETTING_OFF);
                    audioManager.setVibrateSetting(AudioManager.VIBRATE_TYPE_NOTIFICATION,
                            AudioManager.VIBRATE_SETTING_OFF);
                    vibrationSwitch.setChecked(false);
                    vibrationStatus = false;
                }
            }
        });

        soundSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //TODO włączyć dzwięki klawiszy
                    soundSwitch.setChecked(true);
                    soundStatus = true;
                } else {
                    //TODO wyłączyć dzwięki klawiszy
                    soundSwitch.setChecked(false);
                    soundStatus = false;
                }
            }
        });

        language.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == 1) {

                } else {

                }
            }
        });
    }
}
