package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {
    public enum CompareResult{
        LESS,
        EQUAL,
        GREATER,
    }
    // Возвращает вес животного
    double getWeight();
    CompareResult compareWeight(CompareWeight smthHasWeigt);

}
