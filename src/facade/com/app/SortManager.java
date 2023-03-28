package facade.com.app;

public class SortManager {
    private Sorter bubbleSorter;
    private Sorter mergeSorter;
    private Sorter quickSorter;

    public SortManager() {
        bubbleSorter = new BubbleSort();
        mergeSorter = new MergeSort();
        quickSorter = new QuickSort();
    }

    public void bubbleSort() {
        bubbleSorter.sort();
    }

    public void mergeSort() {
        mergeSorter.sort();
    }

    public void quickSort() {
        quickSorter.sort();
    }
}
