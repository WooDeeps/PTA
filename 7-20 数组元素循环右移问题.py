num, times = input().split()
num = int(num)
times = int(times)
nums = input().split()
out = nums.copy()
for i in range(len(nums) - 1, len(nums) - 1 - times, -1):
    out.insert(0, nums[i])
for i in range(num):
    print(out[i], end="")
    if i != num-1:
        print(" ",end="")
