
def isValidSubsequence(array, sequence):
    # Write your code here.
    secondArrPosition = 0

    for idx, element in enumerate(array):
        if element == sequence[secondArrPosition]:
            secondArrPosition+=1

    pass