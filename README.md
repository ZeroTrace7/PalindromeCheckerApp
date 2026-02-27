# Palindrome Checker App

A console-based Java project that demonstrates multiple palindrome-checking techniques, from simple string logic to data-structure-driven and design-pattern-based solutions. Each use case is a focused, runnable example designed to strengthen core programming fundamentals.

## What This Repo Shows

- Multiple palindrome algorithms implemented side by side
- Data structure usage: arrays, stacks, queues, deques, linked lists
- Recursion and call stack behavior
- Object-oriented design with encapsulation
- Strategy pattern with runtime algorithm selection
- Performance benchmarking using `System.nanoTime()`

## Prerequisites

- Java 8+ (JDK)
- Command line (PowerShell / CMD / Terminal)
- Git

## Quick Start

Compile all sources:

```bash
javac -d out src/PalindromeCheckerApp/*.java
```

Run the interactive app:

```bash
java -cp out PalindromeCheckerApp
```

Run any use case:

```bash
java -cp out UseCase12PalindromeCheckerApp
```

Replace `UseCase12PalindromeCheckerApp` with any use case class name listed below.

## Use Cases Included

- UC2: Hardcoded palindrome check
- UC3: Reverse string comparison
- UC4: Two-pointer comparison on character array
- UC5: Stack-based comparison
- UC6: Queue + stack comparison
- UC7: Deque-based comparison
- UC8: Singly linked list, middle split, in-place reverse
- UC9: Recursive palindrome check
- UC10: Case-insensitive and space-ignored normalization
- UC11: Object-oriented palindrome service (`PalindromeChecker`)
- UC12: Strategy pattern (stack vs deque strategies)
- UC13: Performance comparison across multiple algorithms

## Git Workflow Guide

This project follows a clean `main` + `develop` + `feature/*` workflow. Use the steps below to configure Git and keep the history organized.

### Step 2: Git User Configuration

Check current user:

```bash
git config user.name
git config user.email
```

If the user is different, reset globally:

```bash
git config --global user.name "your GitHub username"
git config --global user.email "your GitHub email"
```

### Step 3: Git Repository Configuration (Local)

```bash
git init
git branch -M main
git remote add origin https://github.com/<your-repo>.git
git remote -v
```

Note: Replace `https://github.com/<your-repo>.git` with your actual repository URL.

Expected:

- Repo connected

### Step 4: Initial Commit

```bash
git add .
git commit -m "Base application setup"
git push origin main
```

Note: Ensure that `main` is pushed to the remote repository.

Verify branch:

```bash
git branch
```

Expected:

- `main` appears

### Step 5: Git Branching Strategy

#### 5.1 Create Develop Branch

```bash
git checkout -b develop
git push -u origin develop
```

Always make sure you are on `develop` before creating a feature branch.

Verify branch:

```bash
git branch
```

#### 5.2 Create Feature Branch (Example: UC1)

```bash
git checkout -b feature/UC1
```

Work on the use case, then commit and push:

```bash
git add .
git commit -m "UC1: Add welcome message module"
git push origin feature/UC1
```

Merge to `develop`:

```bash
git checkout develop
git pull
git merge feature/UC1
git push
```

#### UC2 Example

```bash
git checkout develop
git checkout -b feature/UC2
```

Work on the use case, then commit and push:

```bash
git add .
git commit -m "UC2: Hardcoded palindrome"
git push origin feature/UC2
```

Merge to `develop`:

```bash
git checkout develop
git pull
git merge feature/UC2
git push
```

Repeat the same flow for each use case.

## Source Layout

```
src/
  PalindromeCheckerApp/
    PalindromeCheckerApp.java
    UseCase2PalindromeCheckerApp.java
    UseCase3PalindromeCheckerApp.java
    UseCase4PalindromeCheckerApp.java
    UseCase5PalindromeCheckerApp.java
    UseCase6PalindromeCheckerApp.java
    UseCase7PalindromeCheckerApp.java
    UseCase8PalindromeCheckerApp.java
    UseCase9PalindromeCheckerApp.java
    UseCase10PalindromeCheckerApp.java
    UseCase11PalindromeCheckerApp.java
    UseCase12PalindromeCheckerApp.java
    UseCase13PalindromeCheckerApp.java
    PalindromeChecker.java
    PalindromeStrategy.java
    StackPalindromeStrategy.java
    DequePalindromeStrategy.java
    PalindromeService.java
```

## Example Output

```
Result: level is a palindrome.
```

## Notes

- Inputs are intentionally simple and hardcoded per use case to keep focus on the algorithm.
- Build output is ignored using `.gitignore` to keep the repo clean.

## License

Educational use.
