import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        double ASquared = legA * legA;
        double BSquared = legB * legB;
        double hypotenuse = Math.sqrt(ASquared + BSquared);
        return hypotenuse;
    }
}