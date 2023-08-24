package Homework3.Adapter;

/**
 * Европейская розетка
 */
public class ElectricSocket implements Electricity {

    @Override
    public String supplyElectricity(double voltage) {
        return "Электричество обычной розетки c напряжением " + voltage + " V" ;
    }

    @Override
    public void on() {
        System.out.println("Включено");
    }

    @Override
    public void off() {
        System.out.println("Отключено");
    }
}
