# Java Array Practice - Array-02

A beginner-friendly collection of 30 Java programs for learning arrays, loops, conditions, and basic number manipulation.

Each program is independent. Open a file to read its problem description, example, and implementation.

## Quick Start

### Requirements

- Java Development Kit (JDK) 8 or later
- A terminal or any Java IDE, such as VS Code or IntelliJ IDEA

Verify Java is installed:

```bash
java -version
javac -version
```

### Compile and Run

Open a terminal in this directory and replace `Example01` with the program you want to run:

```bash
javac Example01.java
java Example01
```

Example:

```bash
javac Example30.java
java Example30
```

## Program Index

| File | Program | Main idea |
|---|---|---|
| [Example01.java](Example01.java) | Forward and backward display | Traverse an array from index `0` forward and from `length - 1` backward |
| [Example02.java](Example02.java) | Sum of elements | Add every array value |
| [Example03.java](Example03.java) | Average of elements | Divide the total sum by the array length |
| [Example04.java](Example04.java) | Sum of odd elements | Filter odd values, then calculate their sum |
| [Example05.java](Example05.java) | Odd/even averages | Calculate separate averages for odd and even values |
| [Example06.java](Example06.java) | Elements above average | Find the average, then display values greater than it |
| [Example07.java](Example07.java) | Shift first element to last | Move `A[0]` to the final position |
| [Example08.java](Example08.java) | Shift last element to first | Move `A[length - 1]` to the first position |
| [Example09.java](Example09.java) | Swap first and last elements | Exchange the values at both ends |
| [Example10.java](Example10.java) | Swap first/last without temporary variable | Exchange end values using arithmetic |
| [Example11.java](Example11.java) | Shift left without temporary variable | Move the first element to the last position |
| [Example12.java](Example12.java) | Shift right without temporary variable | Move the last element to the first position |
| [Example13.java](Example13.java) | Reverse array without temporary variable | Swap elements from the outside toward the middle |
| [Example14.java](Example14.java) | Maximum element | Track and return the largest value |
| [Example15.java](Example15.java) | Second maximum element | Track the largest and second-largest values |
| [Example16.java](Example16.java) | Maximum of random values | Generate random integers and find the largest |
| [Example17.java](Example17.java) | Pair with a given sum | Use nested loops to find two values that equal a target |
| [Example18.java](Example18.java) | Triplet with a given sum | Use three indexes to find values that equal a target |
| [Example19.java](Example19.java) | Replace with first digit | Keep only the first digit of each number |
| [Example20.java](Example20.java) | Replace with first and last digits | Combine the first and last digits of each number |
| [Example21.java](Example21.java) | Move first digit to last | Rotate one number from left to right |
| [Example22.java](Example22.java) | Move last digit to first | Rotate one number from right to left |
| [Example23.java](Example23.java) | Replace with digit sum | Replace each number with the sum of its digits |
| [Example24.java](Example24.java) | Replace with digit average | Replace each number with the average of its digits |
| [Example25.java](Example25.java) | Reverse each element | Reverse the digits of every number |
| [Example26.java](Example26.java) | Replace with highest digit | Keep the highest digit of each number |
| [Example27.java](Example27.java) | Append digit sum | Add the digit sum to the end of each number |
| [Example28.java](Example28.java) | Divisibility case study | Replace values based on divisibility by 4 and 5 |
| [Example29.java](Example29.java) | Divisibility/digit case study | Replace values based on divisibility by 6 or a contained digit 6 |
| [Example30.java](Example30.java) | Adjacent differences | Find the absolute difference between neighboring elements |

## Learn by Topic

### Array basics

Start with `Example01` through `Example06`.

You will learn:

- Reading array size and values with `Scanner`
- Looping through an array
- Calculating sums and averages
- Filtering odd/even values
- Comparing values with an average

### Shifting and swapping

Continue with `Example07` through `Example13`.

You will learn:

- Moving values between array positions
- Swapping elements
- Using a temporary variable
- Swapping and shifting without a temporary variable
- In-place array reversal

### Searching and combinations

Practice `Example14` through `Example18`.

You will learn:

- Finding maximum and second-maximum values
- Generating random array values
- Using nested loops
- Finding pairs with a target sum
- Finding triplets with a target sum

### Digit manipulation

Practice `Example19` through `Example27`.

You will learn:

- Extracting digits with `% 10`
- Removing the final digit with `/ 10`
- Calculating digit sums and averages
- Reversing a number
- Finding the largest digit
- Rotating a number's first or last digit

### Case studies

Study `Example28` and `Example29`.

These programs combine array traversal, conditions, divisibility, and digit checks:

- `Example28`: divisible by 4 and/or 5
- `Example29`: divisible by 6 and/or contains the digit 6

| Result | Example28 rule | Example29 rule |
|---|---|---|
| `-1` | Divisible by 4 | Divisible by 6 |
| `-2` | Divisible by 5 | Contains digit 6 |
| `-3` | Divisible by both 4 and 5 | Divisible by 6 and contains digit 6 |
| Original value | Matches no rule | Matches no rule |

Finally, `Example30` calculates adjacent differences. For:

```text
[15, 23, 18, 26]
```

the result is:

```text
[8, 5, 8]
```

## Common Java Ideas Used

```java
int size = array.length; // Number of elements
array[0];                // First element
array[array.length - 1]; // Last element
```

Loop through an array:

```java
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}
```

Extract the final digit:

```java
int digit = number % 10;
number = number / 10;
```

Check divisibility:

```java
if (number % 4 == 0) {
    // Number is divisible by 4
}
```
