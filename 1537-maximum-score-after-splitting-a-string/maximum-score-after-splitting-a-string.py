class Solution(object):
    def maxScore(self, s):
        # if(s.count("0") == len(s) or s.count("1") == len(s) and len(s)<2):
        #     return 1

        x = []
        for i in range(len(s) - 1):
            p = s[0:i+1]
            q = s[i+1:]
            x.append(p.count('0') + q.count('1'))
        return max(x)

        