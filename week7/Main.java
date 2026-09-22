public class Main {
    private static void demonstrate(Appliance appliance) {
        appliance.displayBrand();
        appliance.turnOn();
        appliance.operate();
        appliance.turnOff();
        System.out.println();
    }

    public static void main(String[] args) {
        demonstrate(new WashingMachine("LG"));
        demonstrate(new Refrigerator("Panasonic"));
        demonstrate(new AirConditioner("Daikin"));
        demonstrate(new Microwave("Samsung"));
    }
}

