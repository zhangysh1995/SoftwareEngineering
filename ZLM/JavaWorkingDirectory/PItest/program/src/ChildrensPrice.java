/**
 * Created by zhanysh1995 on 2017/4/19.
 */

public class ChildrensPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 0;

        result += 1.5;
        if (daysRented > 3) result += (daysRented -3) * 1.5;

        return result;
    }
}

