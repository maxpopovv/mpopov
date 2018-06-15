package ru.Converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value/70;
    }

    /**
     * Конвертируем рубли в доллары
     * @param value рубли.
     * @return доллары.
     */
    public int rubleToDollar(int value) {
        return value/60;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли
     */
    public int DollarToRubels(int value) {
        return 60*value;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли
     */
    public int EuroToRubels(int value) {
        return 70*value;
}