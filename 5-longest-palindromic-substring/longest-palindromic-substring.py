class Solution:
    def expandAroundCenter(self,s:str,left:int,right:int) -> int:
        while left>=0 and right<=len(s)-1 and s[left]==s[right]:
            left=left-1
            right=right+1
        return right-left-1
    def longestPalindrome(self, s: str) -> str:
        maxlen=len1=len2=end=start=0
        for i in range(0,len(s)):
            len1=self.expandAroundCenter(s,i,i)
            len2=self.expandAroundCenter(s,i,i+1)
            maxlen=max(len1,len2)
            if maxlen>end-start:
                start=i-(maxlen-1)//2
                end=i+(maxlen)//2
        return s[start:end+1]


        