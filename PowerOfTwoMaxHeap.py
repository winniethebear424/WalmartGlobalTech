class PowerOfTwoMaxHeap(self, child_degree):
    def __init__(self):
        self.heap = []
        
    def insert(self, value):
        self.heap.append(value)
        
    def pop(self):
        return self.heap.pop()
    
    def FunctionName(args):
        