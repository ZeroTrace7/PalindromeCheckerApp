# 1) confirm you're in the correct repo
git rev-parse --show-toplevel
git remote -v

# 2) make sure remote is your repo (only if needed)
git remote set-url origin https://github.com/ZeroTrace7/PalindromeCheckerApp.git

# 3) create UC2 branch from latest develop
git checkout develop
git pull origin develop
git checkout -b feature/UC2

# 4) commit your UC2 file
git add src/PalindromeCheckerApp/UseCase2PalindromeCheckerApp.java
git commit -m "UC2: Print hardcoded palindrome result"

# 5) push to GitHub
git push -u origin feature/UC2
