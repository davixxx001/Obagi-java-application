public class HybridVehicle {
    String name;
    double cityMPG;
    double highwayMPG;
    String batteryType;
    double batterySize;

    public HybridVehicle(String name, double cityMPG, double highwayMPG, String batteryType, double batterySize) {
        this.name = name;
        this.cityMPG = cityMPG;
        this.highwayMPG = highwayMPG;
        this.batteryType = batteryType;
        this.batterySize = batterySize;
    }

    public void display() {
        System.out.println("Vehicle: " + name);
        System.out.println("City MPG: " + cityMPG);
        System.out.println("Highway MPG: " + highwayMPG);
        System.out.println("Battery Type: " + batteryType);
        System.out.println("Battery Size: " + batterySize + " kWh");
        System.out.println();
    }

    public static void main(String[] args) {
        HybridVehicle[] vehicles = {
            new HybridVehicle("Toyota Prius", 58, 53, "Lithium-ion", 1.3),
            new HybridVehicle("Honda Accord Hybrid", 48, 47, "Lithium-ion", 1.3),
            new HybridVehicle("Hyundai Ioniq", 58, 60, "Lithium-ion polymer", 1.56),
            new HybridVehicle("Ford Escape Hybrid", 44, 37, "Lithium-ion", 1.1)
        };

        for (HybridVehicle car : vehicles) {
            car.display();
        }
    }
}
