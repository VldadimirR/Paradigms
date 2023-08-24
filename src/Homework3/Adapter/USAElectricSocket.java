package Homework3.Adapter;
/**
 * Американская розетка
 */
public class USAElectricSocket implements AutoElectricity{
    @Override
    public String supplyElectricity(double voltage) {
        return "Электричество американской розетки с напряжением " + voltage + " V";
    }

    @Override
    public void auto() {
        System.out.println("Автовключение и отключение");
    }
}
