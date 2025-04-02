# 1) Utworzyc liste liczb naturalnych od 1 do 20.
# 2) Nastepnie za pomoca mechanizmu list skladanych utworzyc liste liczb nieparzystych.

# 1)
natural_numbers = list(range(1, 21))

# 2)
odd_numbers = [num for num in natural_numbers if num % 2 != 0]

print("Natural numbers:", natural_numbers)
print("Odd numbers:", odd_numbers)