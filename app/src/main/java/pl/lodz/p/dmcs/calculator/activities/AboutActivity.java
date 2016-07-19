package pl.lodz.p.dmcs.calculator.activities;

import android.app.Activity;
import android.os.Bundle;

import pl.lodz.p.dmcs.calculator.R;

/**
 * @author Mateusz Wieczorek
 */
public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }
}
