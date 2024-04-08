Problems and Solutions
This document outlines ten problems along with their corresponding solutions implemented in Java using recursion.

**Problem 1: Finding the Minimum Element in an Array**

**Description:** Given a number \( n \) and an array of \( n \) elements, write a function that returns the minimum element in the array.

**Input:** `n` (int): Number of elements in the array, `array` (int[]): Array of integers.

**Output:** `int`: Minimum element in the array.

**Solution:** Perform a simple traversal of the array while keeping track of the current minimum element.

---

**Problem 2: Calculating the Average of Array Elements**

**Description:** Given a number \( n \) and an array of \( n \) elements, write a function that returns the average of the array elements.

**Input:** `n` (int): Number of elements in the array, `array` (int[]): Array of integers.

**Output:** `double`: Average of the array elements.

**Solution:** Compute the sum of array elements and divide by the number of elements to get the average.

---

**Problem 3: Checking if a Number is Prime**

**Description:** Given a number \( n \), write a function to check if \( n \) is a prime number.

**Input:** `n` (int): Number to be checked.

**Output:** `String`: "Prime" if the number is prime, "Composite" otherwise.

**Solution:** Check divisibility of \( n \) by numbers from 2 up to \( \sqrt{n} \).

---

**Problem 4: Computing the Factorial of a Number**

**Description:** Given a number \( n \), write a program to compute \( n! \) (n factorial) using recursion.

**Input:** `n` (int): Number for which factorial needs to be computed.

**Output:** `int`: Factorial of the given number \( n \) (\( n! \)).

**Solution:** Use a recursive approach where \( n! = n \times (n-1)! \) with base case \( 0! = 1 \).

---

**Problem 5: Finding the \( n \)-th Fibonacci Number**

**Description:** Given a number \( n \), write a function to find the \( n \)-th Fibonacci number using recursion.

**Input:** `n` (int): Position of the Fibonacci number to be found.

**Output:** `int`: \( n \)-th Fibonacci number.

**Solution:** Recursively compute \( F(n) = F(n-1) + F(n-2) \) with base cases \( F(0) = 0 \) and \( F(1) = 1 \).

---

**Problem 6: Computing \( a^n \) (Power of a Number)**

**Description:** Given numbers \( a \) and \( n \), write a function to compute \( a^n \) using recursion.

**Input:** `a` (double): Base, `n` (int): Exponent.

**Output:** `double`: Result of \( a^n \).

**Solution:** Recursively compute \( a^n = a \times a^{n-1} \) with base case \( a^0 = 1 \).

---

**Problem 7: Reversing an Array Using Recursion**

**Description:** Given a number \( n \) and an array of \( n \) elements, write a function to reverse the array using recursion.

**Input:** `n` (int): Number of elements in the array, `array` (int[]): Array of integers.

**Output:** `void`: The array is reversed in place using recursion.

**Solution:** Use a recursive approach to swap elements of the array from the beginning and end.

---

**Problem 8: Checking if a String Consists Only of Digits**

**Description:** Given a string \( s \), write a function to check if the string consists only of digits.

**Input:** `s` (String): Input string to be checked.

**Output:** `boolean`: `true` if the string consists only of digits, `false` otherwise.

**Solution:** Recursively check each character of the string to determine if it is a digit.

---

**Problem 9: Computing the Binomial Coefficient \( C(n, k) \)**

**Description:** Given numbers \( n \) and \( k \), write a function to compute the binomial coefficient \( C(n, k) \) using recursion.

**Input:** `n` (int): Total number of items, `k` (int): Number of items to choose.

**Output:** `int`: Binomial coefficient \( C(n, k) \).

**Solution:** Recursively compute \( C(n, k) = C(n-1, k-1) + C(n-1, k) \) with base cases \( C(n, 0) = C(n, n) = 1 \).

---

**Problem 10: Computing the Greatest Common Divisor (GCD) Using Recursion**

**Description:** Given numbers \( a \) and \( b \), write a function to compute the greatest common divisor (GCD) of \( a \) and \( b \) using recursion and the Euclidean algorithm.

**Input:** `a` (int): First number, `b` (int): Second number.

**Output:** `int`: GCD of \( a \) and \( b \).

**Solution:** Recursively apply the Euclidean algorithm: \( \text{GCD}(a, b) = \text{GCD}(b, a \mod b) \) with base case \( \text{GCD}(a, 0) = a \).

---

Each problem is solved using a recursive approach, providing clear documentation on input parameters, output values, and solution explanation.
