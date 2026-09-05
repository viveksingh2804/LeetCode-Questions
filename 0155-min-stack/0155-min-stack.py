class MinStack:

    def __init__(self):
        self.s = []
        self.minele = 0

    def push(self, x: int) -> None:
        if not self.s:
            self.s.append(x)
            self.minele = x

        elif x < self.minele:
            self.s.append(2 * x - self.minele)
            self.minele = x

        else:
            self.s.append(x)

    def pop(self) -> None:
        if not self.s:
            return

        if self.s[-1] < self.minele:
            self.minele = 2 * self.minele - self.s[-1]

        self.s.pop()

    def top(self) -> int:
        if not self.s:
            return -1

        if self.s[-1] < self.minele:
            return self.minele

        return self.s[-1]

    def getMin(self) -> int:
        if not self.s:
            return -1

        return self.minele