### Description
You are given a **0-indexed** integer array `nums`. Rearrange the values of `nums` according to the following rules:

1. Sort the values at odd indices of nums in **decreasing** order.
    - For example, if `nums = [3,`**<u>`2`</u>**`,1,`**<u>`4`</u>**`]` before this step, it becomes `[3,`**<u>`4`</u>**`,1,`**<u>`2`</u>**`]` after. The values at odd indices `1` and `3` are sorted in **decreasing** order.
2.  Sort the values at even indices of nums in **increasing** order.
    - For example, if `nums = [`**<u>`3`</u>**`,2,`**<u>`1`</u>**`,4]` before this step, it becomes `[`**<u>`1`</u>**`,2,`**<u>`3`</u>**`,4]` after. The values at even indices `0` and `2` are sorted in **increasing** order.

Return the array formed after rearranging the values of `nums`.


 

### Example 1
```
nums = [3,2,1,4]
```
Output
```
[1,4,3,2]
```
Explanation: 
First, we sort the values present at odd indices (1 and 3) in decreasing order.
So, nums changes from `[3,2,1,4]` to `[3,4,1,2]`.

Next, we sort the values present at even indices (0 and 2) in increasing order.
So, nums changes from `[3,4,1,2]` to `[1,4,3,2]`.

Thus, the array formed after rearranging the values is `[1,4,3,2]`.




### Example 2
```
nums = [2,1]
```
Output
```
[2,1]
```
Explanation: 
Since there is exactly one odd index and one even index, no rearrangement of values takes place.

The resultant array formed is `[2,1]`, which is the same as the initial array. 