#
# Write a function that takes in a non-empty array of distinct integers and an
# integer representing a target sum. The function should find all triplets in
# the array that sum up to the target sum and return a two-dimensional array of
# all these triplets. The numbers in each triplet should be ordered in ascending
# order, and the triplets themselves should be ordered in ascending order with
#     respect to the numbers they hold.
#
# Sample Input
# array = [12, 3, 1, 2, -6, 5, -8, 6]
# targetSum=0
# Sample Output
# [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
# O(nlogn)

def threeNumberSum(array, targetSum):
    # Write your code here.
    array.sort()
    result = []
    # l, r = 0, len(array) - 1
    # for i, a in enumerate(array):
    for i in range(len(array) - 2):
        l = i + 1
        r = len(array) - 1
        while l < r:
            three_sum = array[i] + array[l] + array[r]
            if three_sum == targetSum:
                result.append([array[i], array[l], array[r]])
                l += 1
                r -= 1
            elif three_sum < targetSum:
                l += 1
            elif three_sum > targetSum:
                r -= 1

    return result


result = threeNumberSum([12, 3, 1, 2, -6, 5, -8, 6], 0)
print(result)
#   i   l                 r
# [-8, -6, 1, 2, 3, 5, 6, 12]