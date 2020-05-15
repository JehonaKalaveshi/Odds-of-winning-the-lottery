# Odds-of-winning-the-lottery
This code will let the user find the chances of winning the lottery.
I wrote an application that calculates the odds of a person winning the lottery
by guessing correctly all m numbers drawn from a range of 1..n. The formula
that calculates the probability is
probability = m! / product((n-m)+1, n)
where m! is the factorial of m as seen earlier, and product(a,b) is the iterated
product from a up to b, which is defined as follows:
product(a, b) = a * (a+1) * (a+2) * ... * b
