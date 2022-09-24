"""Implement quick sort in Python.
Input a list.
Output a sorted list."""


def quickSort(alist):
    quickSortHelper(alist, 0, len(alist) - 1)


def quickSortHelper(alist, first, last):
    if first < last:
        splitpoint = partition(alist, first, last)

        quickSortHelper(alist, first, splitpoint - 1)
        quickSortHelper(alist, splitpoint + 1, last)


def partition(alist, first, last):
    pivotal = alist[first]

    leftmark = first + 1
    rightmark = last

    done = False
    # while not done:

    while leftmark <= rightmark and alist[leftmark] <= pivotal:
        leftmark = leftmark + 1

    while alist[rightmark] >= pivotal and rightmark >= leftmark:
        rightmark = rightmark - 1

    if rightmark < leftmark:
        done = True
    else:
        temp = alist[leftmark]
        alist[leftmark] = alist[rightmark]
        alist[rightmark] = temp

    temp = alist[first]
    alist[first] = alist[rightmark]
    alist[rightmark] = temp

    return rightmark


alist = [54, 26, 93, 17, 77, 31, 44, 55, 20]
quickSort(alist)
print(alist)

test = [21, 4, 1, 3, 9, 20, 25, 6, 21, 14]
quickSort(test)
print(test)
