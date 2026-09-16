# Java Pattern Programs

A collection of **21 Java pattern programs** using nested loops, conditional statements, and simple number/character logic.

---

## 1. Rectangle Pattern

### Pattern

```text
******
******
******
```

### Logic

* Outer loop → controls rows.
* Inner loop → prints `*` for each column.
* Rows and columns are independent.

---

## 2. Square Pattern

### Pattern

```text
*****
*****
*****
*****
*****
```

### Logic

* Outer loop → runs `n` times for rows.
* Inner loop → runs `n` times for columns.
* Print `*` in every position.

---

## 3. Right-Angle Triangle

### Pattern

```text
*
**
***
****
*****
```

### Logic

* Outer loop → controls rows.
* Inner loop → runs from `1` to current row number.
* Number of stars increases by one in every row.

---

## 4. Rhombus Pattern

### Pattern

```text
    *****
   *****
  *****
 *****
*****
```

### Logic

* Print spaces first: `n - i`.
* Then print `n` stars.
* Spaces decrease as the row number increases.

---

## 5. Inverted Right-Angle Triangle

### Pattern

```text
*****
****
***
**
*
```

### Logic

* Outer loop → controls rows.
* Inner loop → prints `n - i + 1` stars.
* Number of stars decreases by one in every row.

---

## 6. Pyramid Pattern

### Pattern

```text
    *
   ***
  *****
 *******
*********
```

### Logic

* Print `n - i` spaces.
* Print `2 * i - 1` stars.
* Spaces decrease while stars increase symmetrically.

---

## 7. Inverted Pyramid

### Pattern

```text
*********
 *******
  *****
   ***
    *
```

### Logic

* Print `i - 1` spaces.
* Print `2 * n - 2 * i + 1` stars.
* Spaces increase and stars decrease in every row.

---

## 8. Hollow Rectangle

### Pattern

```text
******
*    *
*    *
******
```

### Logic

Print `*` when:

* `i == 1`
* `i == row`
* `j == 1`
* `j == col`

Otherwise print a space.

---

## 9. Hollow Triangle

### Pattern

```text
*
**
* *
*  *
*****
```

### Logic

* First row → print `*`.
* Last row → print all `*`.
* Middle rows → print `*` at the beginning and end.
* Print spaces between boundary stars.

---

## 10. Hollow Pyramid

### Pattern

```text
    *
   * *
  *   *
 *     *
*********
```

### Logic

* Print `n - i` spaces before the pattern.
* First row → print one `*`.
* Last row → print `2 * i - 1` stars.
* Middle rows → print boundary stars with spaces between them.

---

## 11. Diamond Pattern

### Pattern

```text
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

### Logic

### Upper Half

* Print `n - i` spaces.
* Print `2 * i - 1` stars.

### Lower Half

* Print increasing spaces.
* Print decreasing odd numbers of stars.

---

## 12. Hollow Diamond

### Pattern

```text
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
```

### Logic

### Upper Half

* Print leading spaces.
* Print boundary stars.
* Print spaces between the two stars.

### Lower Half

* Increase leading spaces.
* Decrease the inner spaces.
* Print boundary stars.

---

## 13. Butterfly Pattern

### Pattern

```text
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
```

### Logic

### Upper Half

* Print `i` stars.
* Print `2 * (n - i)` spaces.
* Print `i` stars again.

### Lower Half

* Print `n - i + 1` stars.
* Print `2 * (i - 1)` spaces.
* Print `n - i + 1` stars again.

---

## 14. Number Triangle

### Pattern

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

### Logic

* Outer loop → controls rows.
* Inner loop → prints numbers from `1` to `i`.
* Number starts again from `1` on every row.

---

## 15. Repeated Number Triangle

### Pattern

```text
1
1 1
1 1 1
1 1 1 1
1 1 1 1 1
```

### Logic

* Outer loop → controls rows.
* Inner loop → prints the same number repeatedly.
* Current value is printed `i` times.

---

## 16. Alphabet Character Triangle

### Pattern

```text
A
A B
A B C
A B C D
A B C D E
```

### Logic

* Outer loop → controls rows.
* Inner loop → runs from `1` to `i`.
* Convert the position to a character using ASCII values.
* `A` corresponds to ASCII value `65`.

---

## 17. Continuous Alphabet Triangle

### Pattern

```text
A
B C
D E F
G H I J
K L M N O
```

### Logic

* Start with `char ch = 'A'`.
* Print the current character.
* Increment the character after every print.
* Character sequence continues across rows.

---

## 18. Reverse Alphabet Triangle

### Pattern

```text
E
E D
E D C
E D C B
E D C B A
```

### Logic

* Outer loop → controls rows.
* Inner loop → controls characters.
* Start from the last required alphabet.
* Character decreases according to column position.

---

## 19. Palindromic Number Triangle

### Pattern

```text
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
```

### Logic

* Print `n - i` spaces.
* First half → numbers increase from `1` to `i`.
* Second half → numbers decrease from `i - 1` to `1`.
* Creates a symmetrical number pattern.

---

## 20. Same Number Pyramid

### Pattern

```text
        1
      2 2 2
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5
```

### Logic

* Print `n - i` spaces.
* Print the current row number `2 * i - 1` times.
* Each row contains only its row number.

---

## 21. Alphabet Palindromic Triangle

### Pattern

```text
        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A
```

### Logic

* Print `n - i` spaces.
* First half → characters increase from `A` to the current character.
* Second half → characters decrease back to `A`.
* Produces a symmetrical alphabet pattern.

---

# Concepts Used

* `for` loops
* Nested loops
* Conditional statements
* `if-else`
* Number patterns
* Character patterns
* ASCII values
* Spaces and alignment
* Symmetrical patterns
* Hollow patterns

# Pattern Logic Formula

| Pattern Type      | Main Logic                           |
| ----------------- | ------------------------------------ |
| Rectangle         | Rows × Columns                       |
| Square            | `n × n`                              |
| Triangle          | Stars increase                       |
| Inverted Triangle | Stars decrease                       |
| Pyramid           | Spaces decrease + odd stars increase |
| Inverted Pyramid  | Spaces increase + odd stars decrease |
| Hollow Pattern    | Boundary condition                   |
| Diamond           | Pyramid + inverted pyramid           |
| Hollow Diamond    | Boundary stars + spaces              |
| Butterfly         | Stars + middle spaces + stars        |
| Number Triangle   | Column number                        |
| Alphabet Triangle | Character/ASCII logic                |
| Palindrome        | Increasing + decreasing sequence     |

---

## General Nested Loop Structure

```java
for(int i = 1; i <= n; i++)
{
    for(int j = 1; j <= condition; j++)
    {
        // print pattern
    }
    System.out.println();
}
```

**Outer loop = Rows**
**Inner loop = Columns / Pattern elements**
