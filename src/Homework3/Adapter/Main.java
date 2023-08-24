package Homework3.Adapter;

public class Main {
    public static void main(String[] args) {
        Electricity electricity = new ElectricSocket();
        AutoElectricity autoElectricity = new USAElectricSocket();
        System.out.println(electricity.supplyElectricity(220));
        Electricity electricityAdapter = new USPlugAdapter(autoElectricity);
        System.out.println(electricityAdapter.supplyElectricity(110));
    }
}
