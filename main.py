redBalls = int(input("Enter number of RED balls in the urn: "))
blueBalls = int(input("Enter number of BLUE balls in the urn: "))

totalBalls = redBalls + blueBalls

Pred = redBalls / totalBalls
Pblue = blueBalls / totalBalls

print("Total number of balls in the urn:", totalBalls)
print("Probability of drawing a RED ball:", Pred)
print("Probability of drawing a BLUE ball:", Pblue)