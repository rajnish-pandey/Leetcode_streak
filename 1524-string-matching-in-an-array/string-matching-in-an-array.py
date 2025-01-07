class Solution(object):
    def stringMatching(self, words):
        answer = []
        for i in words:
            for j in words:
                if i in j and i != j:
                    answer.append(i)
                    break
        return answer

        # answer = []
        # n = len(words)
        # for i in range(n):
        #     for j in range(n):
        #         if i != j and words[i] in words[j]:
        #             answer.append(words[i])
        #             break
        # return answer
            
        