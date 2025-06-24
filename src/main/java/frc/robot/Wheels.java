package frc.robot;

public class Wheels {
    double pos;
    String name;



    public Wheels(String name, double position) {
        pos = position;
        this.name = name;
    }

    public void printConfig() {
        System.out.println("Wheel name: " + name + " Position: " + pos);
    }
}
