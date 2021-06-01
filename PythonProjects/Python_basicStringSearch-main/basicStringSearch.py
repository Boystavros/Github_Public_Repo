def basicStringSearch(searchString, target):
    
    searchIndex = 0
    while (searchIndex + len(target) <= len(searchString)):
        targetIndex = 0
        while (targetIndex < len(target)) and (target[targetIndex] == searchString[searchIndex + targetIndex]):
            targetIndex = targetIndex + 1
        if targetIndex == len(target):
            return searchIndex
        searchIndex = searchIndex + 1
    return -1
    #test comment for git location


#Test inputs
print(basicStringSearch('per ardua ad alta', 'per')) #should return 0
print(basicStringSearch('per ardua ad alta', 'lta')) #should return 14
print(basicStringSearch('per ardua ad alta', 'ad')) #should return 10
print(basicStringSearch('per ardua ad alta', 'astra')) #should return -1


            