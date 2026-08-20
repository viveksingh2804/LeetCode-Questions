class Solution:
    def merge(self, n):

        n.sort(key=lambda x: x[0])

        list = []

        r = len(n)

        start = n[0][0]
        end = n[0][1]

        for i in range(1, r):

            if n[i][0] > end:
                list.append([start, end])

                start = n[i][0]
                end = n[i][1]

            else:
                start = min(start, n[i][0])
                end = max(end, n[i][1])

        list.append([start, end])

        return list