import collections

count = int(input())
for _ in range(count):
    nums = 0
    srts = int(input())
    srt_s = []
    for _ in range(srts):
        srt_s.append(input().lower())
    counter = collections.Counter(srt_s)
    a = list(counter)
    print(len(a))
