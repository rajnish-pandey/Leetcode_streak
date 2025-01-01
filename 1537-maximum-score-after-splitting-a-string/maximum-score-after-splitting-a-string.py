class Solution(object):
    def maxScore(self, s):
        # i = 0
        # j = len(s)
        # while i < j:
        if(s.count("0") == len(s) or s.count("1") == len(s) and len(s)<2):
            return 1

        x = []
        for i in range(len(s) - 1):
            p = s[0:i+1]
            q = s[i+1:]

            x.append(p.count('0') + q.count('1'))
            print(str(p.count('0')) + "  -  " + str(q.count('1')))
        print(max(x))
        return max(x)

        