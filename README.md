# Sorting Performance Analyzer

This Java program analyzes the performance of various sorting algorithms on different datasets. It measures the time taken by each algorithm to sort the datasets and also reports memory usage.

## How to Use

1. Clone the repository or download the source code.
2. Compile the Java source files using `javac SortingPerformanceAnalyzer.java`.
3. Run the program using `java SortingPerformanceAnalyzer`.

## Sorting Algorithms Implemented

The program implements the following sorting algorithms:

- Insertion Sort
- Selection Sort
- Bubble Sort
- Merge Sort
- Quick Sort

## Dataset Sizes

- Small Dataset: 10 random integers
- Medium Dataset: 100 random integers
- Large Dataset: 1000 random integers

## Output

The program displays the following information for each sorting algorithm:

- Dataset before sorting
- Dataset after sorting
- Time elapsed for sorting (in milliseconds)
- Memory usage (in bytes, kilobytes, megabytes, gigabytes, or terabytes)

## Sample Output

[Sample output screenshots or text]

## What I Have to Work On

After testing the program, there are some areas that still need improvement:

- **Fastest Algorithm Reporting**: Currently, the program incorrectly reports the fastest algorithm as "Insertion Sort" even when it's not always the fastest. This needs to be fixed to accurately reflect the fastest algorithm.
- **Time Elapsed Accuracy**: The program does not always correctly record the time elapsed in milliseconds. This aspect needs to be addressed to ensure accurate performance measurement.

## Contributors

- [Eliezer](https://github.com/EliezerFioti)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
