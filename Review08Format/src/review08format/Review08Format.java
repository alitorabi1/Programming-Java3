package review08format;

public class Review08Format {

    public static void main(String[] args) {
        double d1 = 43.1415923443;
        int i1 = -1341234872;
        String s1 = "Jerry Terry";
        //
        System.out.printf("d1 is: %10.3f\n", d1);
        System.out.printf("d1 is: %.3f\n", d1);
        System.out.printf("Names are: |%3s|\n", s1);
        System.out.printf("Names are: |%30s|\n", s1);
        System.out.printf("Names are: |%-30s|\n", s1);
        System.out.printf("i1: |%3d|\n", i1);
        System.out.printf("i1: |%30d|\n", i1);
        System.out.printf("i1: |%-30d|\n", i1);
        
        System.out.printf("i1: %15d, d1: %.3f, names: %s\n", i1, d1, s1);
        
        // this is why we don't use float/double for money
        double dOne = 1;
        for (int i = 0; i<10; i++) {
            System.out.println("dOne is: " + dOne);
            dOne -= 0.1;
        }
        System.out.println("dOne is: " + dOne);
        
    }
    
}
