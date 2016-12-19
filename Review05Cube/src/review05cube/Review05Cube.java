package review05cube;

public class Review05Cube {

    static double [][][] inputCube() {
        double [][][] cube = new double[2][2][2];
        // TODO: Ask user for 8 values and put them into 3D array
        cube[0][0][0] = 2.11;
        cube[0][0][1] = 3.11;
        cube[0][1][0] = 4.11;
        cube[0][1][1] = 1.11;
        cube[1][0][0] = 2.31;
        cube[1][0][1] = 3.71;
        cube[1][1][0] = 4.41;
        cube[1][1][1] = 1.21;
        
        return cube;
    }
    
    static double getCubeMax(double [][][] cube) {
        
    } 
    
    public static void main(String[] args) {
        double [][][] ccc = inputCube();
        System.out.println("Max is " + getCubeMax(ccc));
    }
    
}
