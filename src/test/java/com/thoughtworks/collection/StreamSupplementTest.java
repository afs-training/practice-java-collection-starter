package com.thoughtworks.collection;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamSupplementTest {

    @Test
    public void should_sort_from_max_to_min() {
        //order from max to min
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expectedSortedNumbers = Arrays.asList(5, 4, 3, 2, 1);

        List<Integer> actualSortedNumbers = new StreamSupplement().sortFromMaxToMin(numbers);

        assertThat(actualSortedNumbers).isEqualTo(expectedSortedNumbers);
    }

    @Test
    public void should_get_average_of_list() {
        //get the average value
        //double numberA = 1.00000001;
        //double numberB = 0.00000001;
        List<Integer> numbers = Arrays.asList(12, 34, 56, 78, 90, 21);
        double expectedAverage = 48.5;

        double actualAverage = new StreamSupplement().getAverage(numbers);

        assertThat(actualAverage).isEqualTo(expectedAverage, Offset.offset(0.0001));
    }

    @Test
    public void should_return_max_value() {
        //get the max value
        List<Integer> numbers = Arrays.asList(1, 11, 27, 20, 4, 9, 15, 4, 1, 11);
        int expectedMaxValue = 27;

        int actualMaxValue = new StreamSupplement().getMaxValue(numbers);

        assertThat(actualMaxValue).isEqualTo(expectedMaxValue);
    }
}
