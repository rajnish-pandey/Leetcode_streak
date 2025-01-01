class Solution(object):
    def maxScore(self, s):
        # x = []
        ans = 0
        for i in range(len(s) - 1):
            p = s[0:i+1]
            q = s[i+1:]
            # x.append(p.count('0') + q.count('1'))
            curr_ans = p.count('0') + q.count('1')
            if ans < curr_ans:
                ans =  curr_ans
        # return max(x)
        return ans

        