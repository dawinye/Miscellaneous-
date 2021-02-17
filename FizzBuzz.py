#This program simulates a game of Fizz Buzz. The game goes by two players taking turns counting numbers, except if the
#number is divisible by 3, the player says Fizz, if it's divisible by 5, then it's Buzz, and if it's
#divisible by both then it becomes FizzBuzz. The user gets to choose which number to play to.


def main():
    limit = int(input("Enter a number to play to"))
    fizzCounter = 0
    buzzCounter = 0
    fizzBuzzCounter = 0
    for x in range(1,limit+1):
        if (x % 3 == 0 and x % 5 == 0):
            print("Fizz Buzz")
            print("Fizz")
            fizzCounter += 1
        elif x % 5 == 0:
            print("Buzz")
            buzzCounter += 1
        elif x % 3 == 0:
            print("Fizz")
            fizzBuzzCounter += 1
        else:
            print(x)


    print("There were:", fizzCounter, "fizzes.")
    print("There were:", buzzCounter, "buzzes.")
    print("There were:", fizzBuzzCounter, "fizzbuzzes.")
    print("Thank you for playing FizzBuzz")


if __name__ == "__main__":
    main()
    


            
