class Solution:
    def compress(self, chars):
        n = len(chars)
        index = 0
        i = 0

        while i < n:
            curr = chars[i]
            count = 0

            while i < n and curr == chars[i]:
                count += 1
                i += 1

            chars[index] = curr
            index += 1

            if count > 1:
                s = str(count)

                for ch in s:
                    chars[index] = ch
                    index += 1

        return index