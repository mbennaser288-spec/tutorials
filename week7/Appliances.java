abstract class Appliance {
    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand : " + brand);
    }

    public void turnOn() {
        System.out.println("Power ON");
    }

    public void turnOff() {
        System.out.println("Power OFF");
    }

    public abstract void operate();
}

class WashingMachine extends Appliance {
    public WashingMachine(String brand) { super(brand); }
    @Override public void operate() { System.out.println("Washing clothes..."); }
}

class Refrigerator extends Appliance {
    public Refrigerator(String brand) { super(brand); }
    @Override public void operate() { System.out.println("Storing food and beverages..."); }
}

class AirConditioner extends Appliance {
    public AirConditioner(String brand) { super(brand); }
    @Override public void operate() { System.out.println("Cooling the room..."); }
}

class Microwave extends Appliance {
    public Microwave(String brand) { super(brand); }
    @Override public void operate() { System.out.println("Heating food..."); }
}

