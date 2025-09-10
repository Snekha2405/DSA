class Solution:
    def firstUniqChar(self, s: str) -> int:
        d={}
        for c in s:
            if c not in d:
                d[c]=1
            else:
                d[c]=d[c]+1
       
        for i in range(0,len(s)):
            c=s[i]
            if d[c]==1:
                return i





        return -1
        