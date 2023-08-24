package Homework3.Adapter;

/**
 * Адаптер для американской розетки
 */
public class USPlugAdapter implements Electricity{

    private AutoElectricity autoElectricity;

    public USPlugAdapter(AutoElectricity electricity) { // ссылка на адаптируемый объект
        this.autoElectricity = electricity;
    }

    /**
     * Метод адаптера
     * @param voltage - кол-во вольт
     * @return реализацию метода интерфейса
     */
    @Override
    public String supplyElectricity(double voltage) {
        return autoElectricity.supplyElectricity(voltage);
    }

    // не поддерживаемые методы
    @Override
    public void on() {
        throw new UnsupportedOperationException("Метод не поддерживается");
    }

    @Override
    public void off() {
        throw new UnsupportedOperationException("Метод не поддерживается");
    }
}
