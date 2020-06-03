package search;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    private int desiredValue;

    public int getDesiredValue() {
        return desiredValue;
    }

    public void setDesiredValue(int desiredValue) {
        this.desiredValue = desiredValue;
    }

    public int searchFirstIndex (List<Integer> numbers) {
        int indexOfFirstSearchNumber = -1;
        for (Integer number : numbers) {
            if (number == desiredValue) {
                indexOfFirstSearchNumber = numbers.indexOf(number);
                break;
            }
        }
        return indexOfFirstSearchNumber;
    }

    public List<Integer> searchAllIndex (List<Integer> numbers) {
        List<Integer> indexesOfSearchNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == desiredValue) {
                indexesOfSearchNumbers.add(i);
            }
        }
        return indexesOfSearchNumbers;
    }
}
