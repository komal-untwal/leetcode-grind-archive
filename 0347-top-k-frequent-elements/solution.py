class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        #maintain count of each num in a map/dict
        count ={}
        for num in nums:
            count[num] = 1 + count.get(num,0)

        #to sort convert it in list of list like [[c1,n1], [c2,n2], [c3,n3]]
        arr = []
        for n,c in count.items():
            arr.append([c,n])

        arr.sort() #it will sort in increasing order of first element of the list i.e 'c1,c2,c3,..'

        #result
        res = []
        while len(res)<k:
            res.append(arr.pop()[1]) #pop will remove elements from end & we have sorted the arr in acending order so highest will be poped out. pop()[1] indicates poping the n's from arr of [c,n]

        return res        


