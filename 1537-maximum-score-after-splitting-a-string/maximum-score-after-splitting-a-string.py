class Solution(object):
    def maxScore(self, s):
        x = []
        for i in range(len(s) - 1):
            p = s[0:i+1]
            q = s[i+1:]
            x.append(p.count('0') + q.count('1'))
        return max(x)

        