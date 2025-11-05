# Day 2 — Prime Number Checker

This folder contains a simple Java program that checks whether a given integer is prime.

## Files
- `Prime.java` — Reads an integer from standard input and prints whether it is a prime number, non-prime, or neither (for 0 and 1).

## Requirements
- Java JDK installed (openjdk or Oracle JDK).
- Workspace root: `/workspaces/Java-BootCamp`

## How to build and run
Open a terminal in the `Day 2` folder and run:

```bash
# compile
javac Prime.java

# run
java Prime
```

Type an integer when prompted. Example:

Input:
```
Enter the number: 17
```

Output:
```
17 is a Prime Number
```

## Notes
- The program treats 0 and 1 as "neither prime nor a composite number".
- To avoid committing compiled `.class` files to git, add a `.gitignore` entry (`*.class`) at the repo root and untrack any already-tracked `.class` files:

```bash
# at repo root (/workspaces/Java-BootCamp)
echo "*.class" >> .gitignore
git add .gitignore
git commit -m "Ignore .class files" || true

# remove tracked .class files from git index (keeps local files)
find . -name "*.class" -print0 | xargs -0 git rm --cached --ignore-unmatch
git add -A
git commit -m "Stop tracking .class files"
```