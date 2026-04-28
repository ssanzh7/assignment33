import java.util.Arrays;

public class experiment {
    private sorter sorter = new sorter();
    private searcher searcher = new searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();
        long startTime = System.nanoTime();
        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }
        return System.nanoTime() - startTime;
    }

    public long measureSearchTime(int[] arr, int target) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        long startTime = System.nanoTime();
        searcher.search(copy, target);
        return System.nanoTime() - startTime;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};
        String[] types = {"Random", "Sorted"};

        for (int size : sizes) {
            System.out.println("\n--- Size: " + size + " ---");
            int[] randomArray = sorter.generateRandomArray(size);
            int[] sortedArray = randomArray.clone();
            Arrays.sort(sortedArray);

            for (String type : types) {
                int[] currentArray = type.equals("Random") ? randomArray : sortedArray;
                System.out.println("[" + type + " Dataset]");
                System.out.println("Insertion Sort: " + measureSortTime(currentArray, "basic") + " ns");
                System.out.println("Heap Sort:      " + measureSortTime(currentArray, "advanced") + " ns");
                System.out.println("Binary Search:  " + measureSearchTime(currentArray, 5000) + " ns");
                System.out.println();
            }
        }
    }
}
