### Binary Search

**Binary Search** is an efficient algorithm for finding an item from a sorted list of items. It works by repeatedly dividing the search interval in half. If the value of the search key is less than the item in the middle of the interval, the search continues in the lower half, or if it's greater, it continues in the upper half. The process is repeated until the search interval is empty or the item is found.

#### How Binary Search Works:

1. **Initial Setup:** Start with two pointers: `low` at the beginning of the array and `high` at the end.
2. **Find the Middle:** Calculate the middle index of the current interval: `mid = low + (high - low) / 2`.
3. **Compare:**
   - If the target value equals the middle element, the search is successful, and the index is returned.
   - If the target value is less than the middle element, narrow the interval to the lower half: set `high = mid - 1`.
   - If the target value is greater than the middle element, narrow the interval to the upper half: set `low = mid + 1`.
4. **Repeat:** Continue the process until the item is found or the interval is empty (`low > high`).

#### Example:

Suppose we have a sorted array: `[2, 4, 7, 10, 23, 45, 78]` and we want to find the index of the number `23`.

- **Step 1:** Start with `low = 0` and `high = 6`. Calculate `mid = 0 + (6 - 0) / 2 = 3`. The middle element is `10`.
- **Step 2:** Since `23 > 10`, move the `low` pointer to `mid + 1 = 4`.
- **Step 3:** Now, `low = 4` and `high = 6`. Calculate `mid = 4 + (6 - 4) / 2 = 5`. The middle element is `45`.
- **Step 4:** Since `23 < 45`, move the `high` pointer to `mid - 1 = 4`.
- **Step 5:** Now, `low = 4` and `high = 4`. Calculate `mid = 4 + (4 - 4) / 2 = 4`. The middle element is `23`.
- **Step 6:** Since `23 == 23`, the search is successful, and the index `4` is returned.

#### Time Complexity:

- **Best Case:** O(1) – The element is found at the first middle comparison.
- **Average and Worst Case:** O(log n) – The search space is halved with each comparison.

This algorithm is highly efficient for large, sorted datasets and significantly reduces the time complexity compared to a linear search.
