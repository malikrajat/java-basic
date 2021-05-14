package Encapsulation;

public class BMW {
    private String name;
    private String model;
    private int doors;
    private int horsePower;

    public BMW() {
    }

    public BMW(String name, String model, int doors, int horsePower) {
        this.name = name;
        this.model = model;
        this.doors = doors;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors < 1) {
            System.out.println("Invalid door operation");
            return;
        }
        this.doors = doors;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        if(horsePower < 1) {
            System.out.println("Invalid horsePower operation");
            return;
        }
        this.horsePower = horsePower;
    }
}
