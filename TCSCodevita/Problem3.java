import java.util.*;
// third code


public class Problem3 {

    public static double[] rotatePoint(double x, double y, double theta) {
        double rad = Math.toRadians(theta);
        double cosTheta = Math.cos(rad);
        double sinTheta = Math.sin(rad);
        return new double[] {cosTheta * x - sinTheta * y, sinTheta * x + cosTheta * y};
    }

    public static double[] calculateBoundingBox(List<double[]> points) {
        double minX = Double.MAX_VALUE, maxX = Double.MIN_VALUE;
        double minY = Double.MAX_VALUE, maxY = Double.MIN_VALUE;
        
        for (double[] point : points) {
            minX = Math.min(minX, point[0]);
            maxX = Math.max(maxX, point[0]);
            minY = Math.min(minY, point[1]);
            maxY = Math.max(maxY, point[1]);
        }
        
        return new double[] {maxX - minX, maxY - minY};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        List<double[]> vertices = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            vertices.add(new double[] {x, y});
        }
        
        double minWaste = Double.MAX_VALUE;
        double bestWidth = 0, bestHeight = 0;
        
        for (double angle = 0; angle < 180; angle++) {
            List<double[]> rotatedVertices = new ArrayList<>();
            for (double[] vertex : vertices) {
                double[] rotated = rotatePoint(vertex[0], vertex[1], angle);
                rotatedVertices.add(rotated);
            }
            
            double[] boundingBox = calculateBoundingBox(rotatedVertices);
            double width = boundingBox[0];
            double height = boundingBox[1];
            
            double waste = width * height;
            if (waste < minWaste) {
                minWaste = waste;
                bestWidth = width;
                bestHeight = height;
            }
        }
        
        if (bestWidth > bestHeight) {
            System.out.printf("%.0f %.0f\n", bestHeight, bestWidth);
        } else {
            System.out.printf("%.0f %.0f\n", bestWidth, bestHeight);
        }
        
        sc.close();
    }
}
