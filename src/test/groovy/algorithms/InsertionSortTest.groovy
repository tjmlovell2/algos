package algorithms

import spock.lang.Specification
import spock.lang.Subject

class InsertionSortTest extends Specification {

    @Subject
    InsertionSort sorter

    def setup() {
        sorter = new InsertionSort()
    }

    def "should return an array of numbers sorted in nondecreasing order"() {
        given: "an array of numbers"
        int[] numbers = [34, 1212, 2, 142, 53, 5]
        when: "the array is passed to the insertionSort method"
        int[] result = sorter.insertionSort(numbers)
        then: "the result is an array in nondecreasing order"
        Arrays.toString(result) == "[2, 5, 34, 53, 142, 1212]"
    }
}
