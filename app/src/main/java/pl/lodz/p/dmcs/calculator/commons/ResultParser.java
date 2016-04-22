package pl.lodz.p.dmcs.calculator.commons;

import java.math.BigDecimal;

/**
 * @author Mateusz Wieczorek
 */
public class ResultParser {

    static public String parseResult(BigDecimal resultNumber) {
        int index = 0;
        for (int i = resultNumber.toPlainString().length()-1; i >= 0; --i) {
            if (resultNumber.toPlainString().charAt(i) == '0') {
                ++index;
            } else if (resultNumber.toPlainString().charAt(i) == '.') {
                return resultNumber.toPlainString().substring(0, resultNumber.toPlainString().length() - (index + 1));
            } else {
                return resultNumber.toPlainString().substring(0, resultNumber.toPlainString().length() - index);
            }
        }
        return resultNumber.toPlainString();
    }

    static public String parseResult(double number) {
        String resultNumber = Double.toString(number);
        int index = 0;
        for (int i = resultNumber.length()-1; i >= 0; --i) {
            if (resultNumber.charAt(i) == '0') {
                ++index;
            } else if (resultNumber.charAt(i) == '.') {
                return resultNumber.substring(0, resultNumber.length() - (index + 1));
            } else {
                return resultNumber.substring(0, resultNumber.length() - index);
            }
        }
        return resultNumber;
    }
}
