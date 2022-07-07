class Solution:
        def reorderLogFiles(self, logs: List[str]) -> List[str]:
            ordered_lst = [logs[i] for i in range(len(logs)) if (logs[i].split()[1].isalpha())]
            ordered_lst.sort(key = lambda x : (x.split()[1 : ], x.split()[0]))
            
            ordered_lst += [logs[i] for i in range(len(logs)) if (logs[i].split()[1].isdigit())]

            return (ordered_lst)
            
