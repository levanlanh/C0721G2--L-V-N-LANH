package bai23_behavioral_design_pattern.thuchanh.strategy;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}

