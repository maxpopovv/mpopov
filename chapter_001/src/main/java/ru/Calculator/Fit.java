package ru.Calculator;

/**программа расчета идеального веса
  */
public class Fit {
    /**идеальный вес мужчины
     * @param height Рост
     * @return идеальный вес.
     */
    public double mensWeight(double height){
        return (height-100)*1.15;
    }
    public double womensWeight(double height){
        return (height -110)*1.15;
    }
}
