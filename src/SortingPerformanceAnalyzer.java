import java.util.Random;

public class SortingPerformanceAnalyzer {
    
    public static void main(String[] args) {  
        int[] smallDataSet = generateRandomDataSet(10);
        int[] mediumDataSet = generateRandomDataSet(100);
        int[] largeDataSet = generateRandomDataSet(1000);
        
        // Messure performance of sorting algorithms on three different datasets
        System.out.println("Small Data Set\n");
        System.out.println("Insertion Sort");
        measurePerformance("Insertion Sort", smallDataSet.clone());
        System.out.println("Selection Sort");
        measurePerformance("Selection Sort", smallDataSet.clone());
        System.out.println("Bubble Sort");
        measurePerformance("Bubble Sort", smallDataSet.clone());
        System.out.println("Merge Sort");
        measurePerformance("Merge Sort", smallDataSet.clone());
        System.out.println("Quick Sort");
        measurePerformance("Quick Sort", smallDataSet.clone());
        printLeaderBoard(smallDataSet);
        
        System.out.println("__________________________________________\n");
        
        System.out.println("Medium Data Set\n");
        System.out.println("Insertion Sort");
        measurePerformance("Insertion Sort", mediumDataSet.clone());
        System.out.println("Selection Sort");
        measurePerformance("Selection Sort", mediumDataSet.clone());
        System.out.println("Bubble Sort");
        measurePerformance("Bubble Sort", mediumDataSet.clone());
        System.out.println("Merge Sort");
        measurePerformance("Merge Sort", mediumDataSet.clone());
        System.out.println("Quick Sort");
        measurePerformance("Quick Sort", mediumDataSet.clone());
        printLeaderBoard(mediumDataSet);
        
        System.out.println("__________________________________________\n");
              
        System.out.println("Large Data Set\n");
        System.out.println("Insertion Sort");
        measurePerformance("Insertion Sort", largeDataSet.clone());
        System.out.println("Selection Sort");
        measurePerformance("Selection Sort", largeDataSet.clone());
        System.out.println("Bubble Sort");
        measurePerformance("Bubble Sort", largeDataSet.clone());
        System.out.println("Merge Sort");
        measurePerformance("Merge Sort", largeDataSet.clone());
        System.out.println("Quick Sort");
        measurePerformance("Quick Sort", largeDataSet.clone());
        printLeaderBoard(largeDataSet);
        
        System.out.println("__________________________________________\n");
    }
    
    public static int[] generateRandomDataSet(int size) {
        int[] data = new int[size];
        Random rand = new Random();
        for(int i = 0; i < size; i++) {
            data[i] = rand.nextInt(size * 10) + 1;
        }
        return data;
    }
    
    public static int measurePerformance(String algorithm, int[] dataSet) {
    	long StartTime = System.currentTimeMillis();
    	
    	switch(algorithm) {
    		case "Insertion Sort":
    			System.out.println("Dataset before sorting:");
    	        printArray(dataSet);
    			insertionSort(dataSet);
    			System.out.println("Dataset after sorting:");
    	        printArray(dataSet);
    			break;
    		case "Selection Sort":
    			System.out.println("Dataset before sorting:");
    	        printArray(dataSet);
    	        selectionSort(dataSet);
    			System.out.println("Dataset after sorting:");
    	        printArray(dataSet);
    	        break;
    		case "Bubble Sort":
    			System.out.println("Dataset before sorting:");
    	        printArray(dataSet);
    	        selectionSort(dataSet);
    			System.out.println("Dataset after sorting:");
    	        printArray(dataSet);
    	        break;
    		case "Merge Sort":
    			System.out.println("Dataset before sorting:");
    	        printArray(dataSet);
    	        mergeSort(dataSet, 0, dataSet.length - 1);
    			System.out.println("Dataset after sorting:");
    	        printArray(dataSet);
    	        break;
    		case "Quick Sort":
    			System.out.println("Dataset before sorting:");
    	        printArray(dataSet);
    	        quickSort(dataSet, 0, dataSet.length - 1);
    			System.out.println("Dataset after sorting:");
    	        printArray(dataSet);
    	        break;
    	}
    	
    	long finshTime = System.currentTimeMillis();
    	long timeElapsed = finshTime - StartTime;
    	long totalMemoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    	
    	System.out.println();
    	
    	if(timeElapsed < 1000) {
    		System.out.println("Time elapsed: " + timeElapsed + " milliseconds");
    	}
    	else if(timeElapsed > 1000) {
    		System.out.println("Time elapsed: " + (timeElapsed / 1000) + " milliseconds");
    	}
    	
    	if(totalMemoryUsage < 1024) {
    		String formattedMemory = String.format("%.2f", totalMemoryUsage);
    		System.out.println("Memory usage: " + formattedMemory + " bytes");
    	}
    	else if(totalMemoryUsage >= 1024 && totalMemoryUsage < Math.pow(1024, 2)) {
    		double memoryInKilobytes = totalMemoryUsage / 1024.0;
    		String formattedMemory = String.format("%.2f", memoryInKilobytes);
    		System.out.println("Memory usage: " + formattedMemory + " kilobytes");
    	}
    	else if(totalMemoryUsage >= Math.pow(1024, 2) && totalMemoryUsage < Math.pow(1024, 3)) {
    		double memoryInMegabytes = totalMemoryUsage / Math.pow(1024, 2);
    		String formattedMemory = String.format("%.2f", memoryInMegabytes);
    		System.out.println("Memory usage: " + formattedMemory + " megabytes");
    	}
    	else if(totalMemoryUsage >= Math.pow(1024, 3) && totalMemoryUsage < Math.pow(1024, 4)) {
    		double memoryIngigabytes = totalMemoryUsage / Math.pow(1024, 3);
    		String formattedMemory = String.format("%.2f", memoryIngigabytes);
    		System.out.println("Memory usage: " + formattedMemory + " gigabytes");
    	}
    	else if(totalMemoryUsage >= Math.pow(1024, 4) && totalMemoryUsage < Math.pow(1024, 5)) {
    		double memoryInTerabytes = totalMemoryUsage / Math.pow(1024, 4);
    		String formattedMemory = String.format("%.2f", memoryInTerabytes);
    		System.out.println("Memory usage: " + formattedMemory + " terabytes");
    	}
    	System.out.println();
		return 0;	
    }
    
    public static void insertionSort(int[] arr) {
    	for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void selectionSort(int[] arr) {
    	for(int i = 0; i < arr.length; i++) {
    		int minIndex = i;
    		for(int j = i + 1; j < arr.length; j++) {
    			if(arr[j] < arr[minIndex]) {
    				minIndex = j;
    			}
    		}		
    		
    		int temp = arr[minIndex];
    		arr[minIndex] = arr[i];
    		arr[i] = temp;
    	}
    }
    
    public static void bubbleSort(int[] arr) {
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = i + 1; j < arr.length - i - 1; j++) {
    			if(arr[j] < arr[j + 1]) {
    				int temp = arr[j];
    	    		arr[j] = arr[j + 1];
    	    		arr[j + 1] = temp;
    			}
    		}		
    	}
    }
    
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    public static void printLeaderBoard(int[] arr) {
    	int[] timing = new int[5];
    	String[] algorithms = {"Insertion Sort", "Selection Sort", "Bubble Sort", "Merge Sort", "Quick Sort"};
    	
    	long minTime = Long.MAX_VALUE;
        String fastestAlgorithm = "";
        for (int i = 0; i < algorithms.length; i++) {
            if (timing[i] < minTime) {
                minTime = timing[i];
                fastestAlgorithm = algorithms[i];
            }
        } 
        System.out.println("Fastest Algorithm: " + fastestAlgorithm + " (Time: " + minTime + " milliseconds)");
        System.out.println();
    }
    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}