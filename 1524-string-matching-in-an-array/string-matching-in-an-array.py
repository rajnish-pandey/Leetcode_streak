class Solution(object):
    def stringMatching(self, words):
        answer = []
        for i in words:
            for j in words:
                if (i in j) and (i != j):
                    answer.append(i)
                    break
        return answer
            
        