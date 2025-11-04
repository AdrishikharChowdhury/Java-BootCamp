# Day 1 — Simple Calculator

This folder contains a small console-based Java calculator (introductory exercise).

## Files

- `Calculator.java` — Java source implementing a simple interactive calculator. It prompts for two numbers and an operation, then prints the result. The program loops until you choose to exit.
- `Calculator.class` — (optional) compiled class file produced by `javac`.

## Requirements

- Java Development Kit (JDK) installed (Java 8+).
- `javac` and `java` on your PATH.

## Compile

From this folder (where `Calculator.java` is located) run:

```bash
javac Calculator.java
```

This produces `Calculator.class`.

## Run

Run the program with:

```bash
java Calculator
```

The program runs interactively in the terminal. It expects two numeric inputs (floats) and then an integer choice for the operation.

## Supported operations

1. Addition
2. Subtraction
3. Multiplication
4. Division (division by zero is handled)
5. Exit

## Example session

A sample terminal interaction looks like:

```
Enter 1st number: 10
Enter 2nd number: 5
Enter your operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Your choice: 1
The result is 15.0

Enter 1st number: 8
Enter 2nd number: 0
Enter your operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Your choice: 4
You cannot divide a number by 0

Enter 1st number: 0
Enter 2nd number: 0
Enter your operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Your choice: 5
Thank you for using this calculator
```

## Notes

- The program reads numbers using `Scanner.nextFloat()` and the menu choice with `Scanner.nextInt()`. Provide valid numeric input to avoid runtime InputMismatchException.
- Choose `5` to exit gracefully.

---

If you'd like, I can add a small script or Makefile to build/run this automatically, or create a unit-test scaffold (JUnit) for the arithmetic logic extracted into separate methods. Let me know which you'd prefer.