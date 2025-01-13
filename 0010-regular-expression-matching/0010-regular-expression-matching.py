class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        # Create a memoization dictionary
        memo = {}

        def posMatch(i: int, j: int) -> bool:
            # Check if the result is already computed
            if (i, j) in memo:
                return memo[(i, j)]

            if i == len(s):
                if j == len(p):
                    memo[(i, j)] = True
                elif j + 1 < len(p) and p[j + 1] == '*':
                    memo[(i, j)] = posMatch(i, j + 2)
                else:
                    memo[(i, j)] = False
                return memo[(i, j)]

            if j == len(p):
                memo[(i, j)] = False
                return False

            if s[i] == p[j] or p[j] == '.':
                if j + 1 < len(p) and p[j + 1] == '*':
                    memo[(i, j)] = posMatch(i + 1, j) or posMatch(i, j + 2)
                else:
                    memo[(i, j)] = posMatch(i + 1, j + 1)
            else:
                if j + 1 < len(p) and p[j + 1] == '*':
                    memo[(i, j)] = posMatch(i, j + 2)
                else:
                    memo[(i, j)] = False

            return memo[(i, j)]

        # Start the recursive matching from (0, 0)
        return posMatch(0, 0)
