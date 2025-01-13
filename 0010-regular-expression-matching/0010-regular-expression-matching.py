def posMatch(s: str, p: str, i: int, j: int) -> bool:
    #print(str(i+1)+" "+str(j+1))
    if i == len(s):
        if j==len(p):
            return True
        elif j+1<len(p) and p[j+1]=='*': 
            return posMatch(s, p, i, j+2)
        else:
            return False
    if j == len(p):
        return False
    if s[i] == p[j] or p[j] == '.':
        if(j+1 < len(p) and p[j+1]=='*'):
            return posMatch(s, p, i+1, j) or posMatch(s, p, i, j+2)
        else:
            return posMatch(s, p, i+1, j+1)
    else:
        if j+1 < len(p) and p[j+1] == '*':
            return posMatch(s, p, i, j+2)
        return False

class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        return posMatch(s, p, 0, 0)

