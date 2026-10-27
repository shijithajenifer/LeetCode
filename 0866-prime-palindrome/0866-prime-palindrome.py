class Solution(object):
    def is_prime(self, num):
        if num < 2: return False
        # Check divisibility up to the square root of num
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                return False
        return True

    def primePalindrome(self, n):
        # Handle small primes and the only even-length prime palindrome (11)
        if 8 <= n <= 11:
            return 11
        if n <= 2: return 2
        if n <= 3: return 3
        if n <= 5: return 5
        if n <= 7: return 7

        # We only generate odd-length palindromes.
        # Length 1 is covered by the 'if n <= 7' checks above.
        # length=2 (halves 10-99) generates palindromes of length 3 (e.g., 101)
        # length=3 (halves 100-999) generates palindromes of length 5 (e.g., 10001)
        for length in range(1, 6): 
            for i in range(10**(length - 1), 10**length):
                s = str(i)
                # This creates an odd-length palindrome
                # Example: if s = "123", s[-2::-1] is "21", result is "12321"
                candidate = int(s + s[-2::-1])
                
                if candidate >= n and self.is_prime(candidate):
                    return candidate
        return -1