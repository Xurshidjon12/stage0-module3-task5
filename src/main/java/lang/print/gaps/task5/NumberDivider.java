package lang.print.gaps.task5;

import java.util.logging.Logger;

public class NumberDivider {
    void divide(int toBeDivided) {
        int result = toBeDivided / 5;
        System.out.println(result);
    }

    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        int numberToDivide = 25;
        divider.divide(numberToDivide);
    }
}
