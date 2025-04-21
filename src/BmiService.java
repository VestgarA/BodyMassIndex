public class BmiService {
    public double count(double weight, double height) {

        double imt = height / (weight * weight);
        return (int) imt;
    }
}
