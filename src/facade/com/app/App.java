//Structural design pattern
//Facade meaning - The front wall of a large building that you see from the outside

//used to create interface to connect with external libraries
//reduce complexity (by avoiding direct code changes in core models)
//Facade pattern(layer) can only integrate part of the library used in application


//Imagine sort algorithms(sorters) are provided by a library (bubble, selection, merge, quick, redix)
//We are only concern about bubble, merge, quick
//We want to avoid calling sorters directly in App as library can be replaced later

//Solution
// App - SortManager - Sorters(bubble)
//                   - Merge(bubble)
//                   - Quick(bubble)

package facade.com.app;

public class App {
    public static void main(String[] args) {
        SortManager sortManager = new SortManager();
        sortManager.bubbleSort();
        sortManager.mergeSort();
        sortManager.quickSort();
    }
}

//Sorter interface(sort method)
//BubbleSort, MergeSort implements sorter
//SortingManager(to initialize sorters and provide methods to consume sorter)