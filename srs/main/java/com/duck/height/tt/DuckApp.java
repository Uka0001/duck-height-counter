package com.duck.height.tt;

/*
задача:
Данные - это N резиновых уток, которые должны быть сложены в ряд.
Каждая утка имеет определенную высоту и ширину.
Нам нужно расположить уток таким образом, чтобы сумма высоты используемых уток
была как можно больше, а их общая ширина не превышала максимальную ширину ряда.
Вход: В первой строке стандартного ввода есть два целых числа N, M (1 <= N, M <= 50),
разделенных одиночными интервалами, обозначающими соответственно: количество доступных уток
и максимальную ширину строки. В каждой последующей строке N есть два целых числа w, s (1 <= w, s <=9),
разделенных одним интервалом, указывающим высоту (w) и ширину (s) вывода утки: Ваша программа должна
вывести на стандартный вывод максимально доступную сумму высоты уток, используемых для их установки в ряд.
* */

import com.duck.height.tt.service.CountDuckHeight;

public class DuckApp {
    private static CountDuckHeight countDuckHeight = new CountDuckHeight();

    public static void main(String[] args) {
        int totalHeight = countDuckHeight.getTotalHeightHungrySorting();
        int totalHeightAlternative = countDuckHeight.getTotalHeightMyCustomSorting();
        System.out.println(totalHeight);
        System.out.println(totalHeightAlternative);
    }
}
