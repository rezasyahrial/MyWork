package MyPolynomial;

public class MyPolynomial {
    
    private double[] coeffs;
    
    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }
    
    public int getDegree(){
        return coeffs.length-1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length-1; i >= 0; i--) {
            sb.append(coeffs[i]).append(i != 0 ? "*x^" + i + " + " : "");
        }
        return sb.toString();
    }
}
