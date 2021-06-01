#Author: Sacha Ponniah
#Date: 10/12/20

def quickSelect(k, aList):
    if len(aList) == 1:
        return aList[0]
    
    pivot = aList[0]
    # print("pivot:",pivot)
    leftPart = []
    rightPart = []
    
    for item in aList[1:]:
        if item < pivot:
            leftPart.append(item)
        else:
            rightPart.append(item)
    # print("leftPart", leftPart)
    # print("rightPart", rightPart)
    if len(leftPart) >= k:
       return quickSelect(k, leftPart)
    elif len(leftPart) == (k-1):
        return pivot
    else:
        return quickSelect((k - len(leftPart) -1), rightPart)

theList = [9, 32, 20, 16, 23, 26, 8, 20, 18, 3]
target = 8
print("The ", target,"th smallest item is: ", quickSelect(target, theList), sep='')
print(sorted(theList))