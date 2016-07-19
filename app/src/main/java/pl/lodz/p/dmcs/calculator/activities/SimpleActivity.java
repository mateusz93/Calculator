package pl.lodz.p.dmcs.calculator.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

import pl.lodz.p.dmcs.calculator.R;
import pl.lodz.p.dmcs.calculator.commons.ResultParser;

/**
 * @author Mateusz Wieczorek
 */
public class SimpleActivity extends Activity {

    private Button backSpaceButton;
    private Button clearButton;
    private Button plusMinusButton;
    private Button divisionButton;
    private Button nineButton;
    private Button eightButton;
    private Button sevenButton;
    private Button multiplyButton;
    private Button sixButton;
    private Button fiveButton;
    private Button fourButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button minusButton;
    private Button zeroButton;
    private Button pointButton;
    private Button equalButton;
    private Button plusButton;
    private TextView result;
    private BigDecimal memory;
    private String operation;
    private boolean operationFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple);
        initButtons();
        initOnClickReactions();
        result.setText(String.valueOf(0));
        memory = new BigDecimal(0);
        operation = "";
        operationFlag = false;
    }

    private void initOnClickReactions() {
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                if (!operationFlag) {
                    if (!"0".equals(result.getText().toString())) {
                        result.setText(result.getText().toString() + '0');
                    }
                } else {
                    result.setText(String.valueOf(0));
                    operationFlag = false;
                }
            }
        });

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                if (!operationFlag) {
                    if (!"0".equals(result.getText().toString())) {
                        result.setText(result.getText().toString() + '1');
                    } else {
                        result.setText(String.valueOf(1));
                    }
                } else {
                    result.setText(String.valueOf(1));
                    operationFlag = false;
                }
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                if (!operationFlag) {
                    if (!"0".equals(result.getText().toString())) {
                        result.setText(result.getText().toString() + '2');
                    } else {
                        result.setText(String.valueOf(2));
                    }
                } else {
                    result.setText(String.valueOf(2));
                    operationFlag = false;
                }
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                if (!operationFlag) {
                    if (!"0".equals(result.getText().toString())) {
                        result.setText(result.getText().toString() + '3');
                    } else {
                        result.setText(String.valueOf(3));
                    }
                } else {
                    result.setText(String.valueOf(3));
                    operationFlag = false;
                }
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                if (!operationFlag) {
                    if (!"0".equals(result.getText().toString())) {
                        result.setText(result.getText().toString() + '4');
                    } else {
                        result.setText(String.valueOf(4));
                    }
                } else {
                    result.setText(String.valueOf(4));
                    operationFlag = false;
                }
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                if (!operationFlag) {
                    if (!"0".equals(result.getText().toString())) {
                        result.setText(result.getText().toString() + '5');
                    } else {
                        result.setText(String.valueOf(5));
                    }
                } else {
                    result.setText(String.valueOf(5));
                    operationFlag = false;
                }
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                if (!operationFlag) {
                    if (!"0".equals(result.getText().toString())) {
                        result.setText(result.getText().toString() + '6');
                    } else {
                        result.setText(String.valueOf(6));
                    }
                } else {
                    result.setText(String.valueOf(6));
                    operationFlag = false;
                }
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                if (!operationFlag) {
                    if (!"0".equals(result.getText().toString())) {
                        result.setText(result.getText().toString() + '7');
                    } else {
                        result.setText(String.valueOf(7));
                    }
                } else {
                    result.setText(String.valueOf(7));
                    operationFlag = false;
                }
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                if (!operationFlag) {
                    if (!"0".equals(result.getText().toString())) {
                        result.setText(result.getText().toString() + '8');
                    } else {
                        result.setText(String.valueOf(8));
                    }
                } else {
                    result.setText(String.valueOf(8));
                    operationFlag = false;
                }
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                if (!operationFlag) {
                    if (!"0".equals(result.getText().toString())) {
                        result.setText(result.getText().toString() + '9');
                    } else {
                        result.setText(String.valueOf(9));
                    }
                } else {
                    result.setText(String.valueOf(9));
                    operationFlag = false;
                }
            }
        });

        backSpaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                CharSequence r = result.getText();
                if (result.getText().length() == 1 || (result.getText().length() == 2 && result.getText().toString().startsWith("-"))) {
                    result.setText("0");
                } else if (".".equals(result.getText().charAt(result.getText().toString().length()-2))) {
                    result.setText(r.subSequence(0, r.length() - 2));
                } else {
                    result.setText(r.subSequence(0, r.length() - 1));
                }
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                result.setText(String.valueOf(0));
                memory = new BigDecimal(0);
                operation = "";
            }
        });

        plusMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                if (!"0".equals(result.getText().toString())) {
                    if (result.getText().toString().startsWith("-")) {
                        result.setText(result.getText().toString().substring(1, result.getText().toString().length()));
                    } else {
                        result.setText("-" + result.getText().toString());
                    }
                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                memory = new BigDecimal(result.getText().toString());
                operation = "-";
                operationFlag = true;
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                memory = new BigDecimal(result.getText().toString());
                operation = "+";
                operationFlag = true;
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                memory = new BigDecimal(result.getText().toString());
                operation = "/";
                operationFlag = true;
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                memory = new BigDecimal(result.getText().toString());
                operation = "*";
                operationFlag = true;
            }
        });

        pointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                if (!result.getText().toString().contains(".")) {
                    result.setText(result.getText().toString() + '.');
                }
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vb.vibrate(30);
                BigDecimal number, resultNumber;
                switch (operation) {
                    case "*":
                        number = new BigDecimal(result.getText().toString());
                        resultNumber = memory.multiply(number);
                        result.setText(ResultParser.parseResult(resultNumber));
                        operationFlag = false;
                        operation = "";
                        memory = new BigDecimal(0);
                        break;
                    case "/":
                        number = new BigDecimal(result.getText().toString());
                        if (number.intValue() == 0) {
                            vb.vibrate(500);
                            Toast.makeText(SimpleActivity.this, "Nie dziel przez 0!", Toast.LENGTH_LONG).show();
                            break;
                        }
                        resultNumber = memory.divide(number, 40, 1);
                        result.setText(ResultParser.parseResult(resultNumber));
                        operationFlag = false;
                        operation = "";
                        memory = new BigDecimal(0);
                        break;
                    case "+":
                        number = new BigDecimal(result.getText().toString());
                        resultNumber = memory.add(number);
                        result.setText(ResultParser.parseResult(resultNumber));
                        operationFlag = false;
                        operation = "";
                        memory = new BigDecimal(0);
                        break;
                    case "-":
                        number = new BigDecimal(result.getText().toString());
                        resultNumber = memory.subtract(number);
                        result.setText(ResultParser.parseResult(resultNumber));
                        operationFlag = false;
                        operation = "";
                        memory = new BigDecimal(0);
                        break;
                    default:
                        break;
                }
            }
        });

    }

    private void initButtons() {
        backSpaceButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.backSpaceButton);
        clearButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.clearButton);
        plusMinusButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.plusMinusButton);
        divisionButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.divisionButton);
        nineButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.nineButton);
        eightButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.eightButton);
        sevenButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.sevenButton);
        multiplyButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.multiplyButton);
        sixButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.sixButton);
        fiveButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.fiveButton);
        fourButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.fourButton);
        oneButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.oneButton);
        twoButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.twoButton);
        threeButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.threeButton);
        minusButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.minusButton);
        zeroButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.zeroButton);
        pointButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.pointButton);
        equalButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.equalButton);
        plusButton = (Button) findViewById(pl.lodz.p.dmcs.calculator.R.id.plusButton);
        result = (TextView) findViewById(pl.lodz.p.dmcs.calculator.R.id.result);
    }
}
