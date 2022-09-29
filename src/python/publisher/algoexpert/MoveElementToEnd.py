

# You're given an array of integers and an integer. Write a function that moves
# all instances of that integer in the array to the end of the array and returns
# the array.
#
# Sample Input
# "array": [2, 1, 2, 2, 2, 3, 4, 2],
# "toMove": 2
#
# Sample Output:
# [1, 3, 4, 2, 2, 2, 2, 2]
#
# // the numbers 1, 3, and 4 could be ordered differently

def moveElementToEnd(array, toMove):
    # Write your code here.

    right = len(array)-1
    left = 0
    while left < right:

        while left < right and array[right] == toMove:
            right -= 1

        if array[left] == toMove:
            temp = array[right]
            array[right] = array[left]
            array[left] = temp
            right -= 1

        left += 1

    return array

       # l                 r
array = [2, 1, 2, 2, 2, 3, 4, 2]
toMove = 2
output = [4, 1, 3, 2, 2, 2, 2, 2]

retult = moveElementToEnd(array, toMove)
print(retult)
print(output)