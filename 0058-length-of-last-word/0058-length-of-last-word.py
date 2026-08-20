class Solution:
    def lengthOfLastWord(self, s):
        s = " " + s
        s = s.strip()
        p = ""

        for i in range(len(s)):
            if s[i] != ' ':
                p = p + s[i]
            else:
                p = ""

        return len(p)