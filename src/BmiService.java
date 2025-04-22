public class BmiService {
    public int count(double weight, double height) {

        double imt = height / (weight * weight);
        return (int) imt;
    }
}
