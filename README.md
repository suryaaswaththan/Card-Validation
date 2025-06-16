# Credit Card Validator

A Java-based console application that validates credit card numbers using the Luhn algorithm and standard issuer prefix rules.

## 🔍 Features

- Verifies card number length (13 to 16 digits)
- Checks for valid prefixes (Visa, MasterCard, Discover, AmEx)
- Implements the Luhn algorithm to validate checksum

## 🛠 How It Works

1. Takes card number input from the user.
2. Validates the format:
   - Length: 13–16 digits
   - Prefix: Starts with 4, 5, 6, or 37
3. Runs the number through the Luhn algorithm.
4. Displays whether the card number is valid or not.

