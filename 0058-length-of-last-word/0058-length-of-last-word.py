class Solution:
    def lengthOfLastWord(self, s):
        s=s.strip()
        pos = s.rfind(' ')
        return len(s) - pos - 1   