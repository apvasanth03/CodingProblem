# Cumulative Frequency of Data Classes

[Solution](https://github.com/apvasanth03/CodingProblem/blob/master/src/main/kotlin/com/vasanth/codingproblem/otherquestions/CumulativeFrequencyOfDataClasses.kt)

Write a program to analyze the statistics of employees daily commute time.

Determine the number of data classes k as the smallest integer such that 2^k >=N. Where N is the number of observations in the data sample.

Group the raw data into classes and calculate their cumulative frequencies. Classes have an equal width.

For example, if the company has 8 employees and their commute times in minutes are:
```14 15 15 14 13 19 21 10```

This data can be grouped into 3 classes because of 2^3 >= 8. So, we can define the following class limits 10-13, 14-17, and 18-21, dividing the commute time range from minimum to maximum into three subranges with equal width.

The next table shows a distribution of the data between classes, frequency and cumulative frequency for each class.

| Class Limits (minutes)        | Samples           | Frequency  | Cumulative Frequency  |
|:-----------------------------:|:-----------------:|:----------:|:---------------------:|
|           10 - 13             |    10, 13          |      2     |          2           |
|           14 - 17             |    14, 14, 15, 15  |      4     |          6           |
|           18 - 21             |    19,21           |      2     |          8           |

**Example**

```
Input

A space-separated array of integers, that represents a daily commute time in minutes. For example:
14 15 15 14 13 19 21 10

Output

A space-separated array of cumulative frequencies of data classes.

Classes are sorted in ascending order.

For example:
2 6 8
```