//Structural design pattern
//used to create interface to connect with external libraries
//reduce complexity (by avoiding direct code changes in core models)


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