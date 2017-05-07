/**
 * Created by zhanysh1995 on 2017/4/19.
 */

public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 0;
                result += daysRented * 3;

        return result;
    }
}
