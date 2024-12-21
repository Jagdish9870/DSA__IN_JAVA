import java.util.*;

public class problem5 {

    static class Wire {
        int x1, y1, x2, y2;

        Wire(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    static boolean isBetween(int a, int b, int c) {
        return (a <= b && b <= c) || (c <= b && b <= a);
    }

    static boolean intersects(Wire wire1, Wire wire2) {
        if (wire1.x1 == wire1.x2 && wire2.y1 == wire2.y2) {
            return isBetween(wire1.x1, wire2.x1, wire2.x2) && isBetween(wire2.y1, wire1.y1, wire1.y2);
        } else if (wire1.y1 == wire1.y2 && wire2.x1 == wire2.x2) {
            return isBetween(wire1.y1, wire2.y1, wire2.y2) && isBetween(wire2.x1, wire1.x1, wire1.x2);
        }
        return false;
    }

    static int calculateTouchCells(Wire wire, int intersectionX, int intersectionY) {
        if (wire.x1 == wire.x2) {
            return Math.abs(wire.y1 - intersectionY) + Math.abs(wire.y2 - intersectionY);
        } else {
            return Math.abs(wire.x1 - intersectionX) + Math.abs(wire.x2 - intersectionX);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Wire> wires = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            wires.add(new Wire(x1, y1, x2, y2));
        }

        sc.nextLine();
        String[] animalsInput = sc.nextLine().split(" ");
        Map<String, Integer> animalThresholds = new HashMap<>();
        for (String animalData : animalsInput) {
            String[] parts = animalData.split(":");
            String animalName = parts[0];
            int threshold = Integer.parseInt(parts[1]);
            animalThresholds.put(animalName, threshold);
        }

        String touchedAnimal = sc.nextLine();

        Map<String, Integer> intersectionVoltage = new HashMap<>();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (intersects(wires.get(i), wires.get(j))) {
                    int intersectionX = wires.get(i).x1;
                    int intersectionY = wires.get(i).y1;

                    int minTouchCells = Math.min(
                        calculateTouchCells(wires.get(i), intersectionX, intersectionY),
                        calculateTouchCells(wires.get(j), intersectionX, intersectionY)
                    );

                    int voltage = 2 * minTouchCells;
                    intersectionVoltage.put(intersectionX + "," + intersectionY, voltage);
                }
            }
        }

        int voltageAtTouch = intersectionVoltage.getOrDefault(touchedAnimal, 0);
        boolean animalDies = voltageAtTouch > animalThresholds.get(touchedAnimal);
        System.out.println(animalDies ? "Yes" : "No");

        double totalAnimals = animalThresholds.size();
        double dyingAnimals = 0;
        for (String animalName : animalThresholds.keySet()) {
            int animalVoltage = intersectionVoltage.getOrDefault(animalName, 0);
            if (animalVoltage > animalThresholds.get(animalName)) {
                dyingAnimals++;
            }
        }

        double probability = dyingAnimals / totalAnimals;
        System.out.println(String.format("%.2f", probability));
    }
}
