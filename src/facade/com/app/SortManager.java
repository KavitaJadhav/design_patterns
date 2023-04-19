package facade.com.app;

public class SortManager {
    private Sorter bubbleSorter;
    private Sorter mergeSorter;
    private Sorter quickSorter;

    public SortManager() {
        /*Sorters are initialised in constructor to avoid creating them in every call   */
        bubbleSorter = new BubbleSort();
        mergeSorter = new MergeSort();
        quickSorter = new QuickSort();
    }

    public void bubbleSort() {
        /*Sorters are initialised in constructor to avoid creating them in every call   */
        bubbleSorter.sort();
    }

    public void mergeSort() {
        mergeSorter.sort();
    }

    public void quickSort() {
        quickSorter.sort();
    }
}
