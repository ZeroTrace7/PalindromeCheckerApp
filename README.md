# Palindrome Checker App

A console-based Java project that explores multiple palindrome-checking techniques, from basic string logic to linked lists, recursion, and strategy patterns. Each use case is a focused, runnable example that highlights a specific concept or data structure.

## Highlights

- Multiple algorithms implemented side by side for easy comparison
- Clean, single-responsibility demos per use case
- Strategy pattern for runtime algorithm selection
- Performance benchmarking with `System.nanoTime()`

## Use Cases Included

- UC8: Linked List (fast/slow pointers + in-place reverse)
- UC9: Recursion (base condition + call stack)
- UC10: Case-insensitive, space-ignored checking
- UC11: Object-oriented palindrome service
- UC12: Strategy pattern (stack vs deque)
- UC13: Performance comparison across approaches

## Project Structure

```
src/
  PalindromeCheckerApp/
    PalindromeCheckerApp.java
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

## How To Run

From the project root:

```bash
javac -d out src/PalindromeCheckerApp/*.java
java -cp out UseCase11PalindromeCheckerApp
```

Replace `UseCase11PalindromeCheckerApp` with any use case class name to run a different demo.

## Example Output

```
Result: level is a palindrome.
```

## Notes

- Input strings are hardcoded per use case for clarity.
- Build outputs are ignored via `.gitignore`.

## License

Educational use.
