package Homework3.Adapter;

/**
 * Интерфейс электричества европейского стандарта
 */
public interface Electricity {

     String supplyElectricity(double voltage);

     void on();

     void off();
}
