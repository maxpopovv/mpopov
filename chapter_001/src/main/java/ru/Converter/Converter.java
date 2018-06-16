package ru.Converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int RubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары
     *
     * @param value рубли.
     * @return доллары.
     */
    public int RubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвертируем доллары в рубли.
     *
     * @param value доллары.
     * @return Рубли
     */
    public int DollarToRuble(int value) {
        return 60 * value;
    }

    /**
     * Конвертируем евро в рубли.
     *
     * @param value евро.
     * @return Рубли
     */
    public int EuroToRuble(int value) {
        return 70 * value;
    }
}
