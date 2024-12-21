import java.util.Scanner;

public class ClockAngle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] time = sc.nextLine().split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);

        int N = sc.nextInt();
        sc.nextLine(); // consume the newline character

        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.nextLine(); // consume the newline character

        int P = sc.nextInt();
        int Q = sc.nextInt();
        sc.nextLine(); // consume the newline character

        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.nextLine(); // consume the newline character

        int[] angles = new int[N];
        for (int i = 0; i < N; i++) {
            angles[i] = sc.nextInt();
        }

        int totalCost = 0;

        // Calculate the current angle between hour and minute hands
        double hourAngle = (hours % 12) * 30 + (minutes * 0.5);  // 30 degrees per hour + 0.5 degrees per minute
        double minuteAngle = minutes * 6; // 6 degrees per minute

        for (int query : angles) {
            // Calculate the difference between the current angle and the target angle
            double currentAngle = Math.abs(hourAngle - minuteAngle);
            if (currentAngle > 180) {
                currentAngle = 360 - currentAngle; // use the smaller angle
            }

            double targetAngle = query;
            double angleDifference = Math.abs(targetAngle - currentAngle);
            if (angleDifference > 180) {
                angleDifference = 360 - angleDifference; // use the smaller angle
            }

            // Compute the costs for both clockwise and counterclockwise movement for both hands
            int minCost = Integer.MAX_VALUE;

            // Hour hand clockwise
            double hourCostClockwise = computeHourMoveCost(hourAngle, targetAngle, true, P, Q);
            // Hour hand counterclockwise
            double hourCostCounterclockwise = computeHourMoveCost(hourAngle, targetAngle, false, A, B);

            // Minute hand clockwise
            double minuteCostClockwise = computeMinuteMoveCost(minuteAngle, targetAngle, true, X, Y);
            // Minute hand counterclockwise
            double minuteCostCounterclockwise = computeMinuteMoveCost(minuteAngle, targetAngle, false, A, B);

            // Calculate total costs for both clockwise and counterclockwise movements
            double totalClockwiseCost = hourCostClockwise + minuteCostClockwise;
            double totalCounterClockwiseCost = hourCostCounterclockwise + minuteCostCounterclockwise;

            // Take the minimum of both the directions
            totalCost += Math.min(totalClockwiseCost, totalCounterClockwiseCost);
        }

        System.out.println(totalCost);
    }

    static double computeHourMoveCost(double hourAngle, double targetAngle, boolean clockwise, int P, int Q) {
        double hourMove = (clockwise ? targetAngle - hourAngle : hourAngle - targetAngle);
        if (hourMove < 0) hourMove += 360;
        return (hourMove <= 90 ? hourMove * P : (90 * P) + ((hourMove - 90) * Q));
    }

    static double computeMinuteMoveCost(double minuteAngle, double targetAngle, boolean clockwise, int X, int Y) {
        double minuteMove = (clockwise ? targetAngle - minuteAngle : minuteAngle - targetAngle);
        if (minuteMove < 0) minuteMove += 360;
        return (minuteMove <= 90 ? minuteMove * X : (90 * X) + ((minuteMove - 90) * Y));
    }
}
