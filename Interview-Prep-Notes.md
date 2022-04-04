# Tips
- Always take care of overflows - when adding/multiplying number check if you can cleverly subtract/divide or not. Example for binary search `mid = low + (high - low)/2`, for checking square root use `sqrt == target/sqrt`.
- 

# Problems
## Binary Search
- Matrix median
	+ Two binary searches. First identify the window of numbers in matrix - `min, max`. Run binary search in that window. count elements less than the mid in each row. If `count <= required` update `ans = mid`.
- 

## Math
- Fibonacci
	+ Matrix exponentiation leads to quicker results. `M = [[1, 1], [1, 0]]`. We can M^n will give `[[Fn+1, Fn], [Fn, Fn-1]]`.
- Binomial coefficient = n!/k!(n-k)!
- Mod of negative numbers - keep adding mod value until you get a positive number and then take a mod again.


## Arrays
- Try divide and conquer (merge sort), then treeset, then min-max.
- Next permutation is a number trick. From right to left find when the number decreases - `idx`. Swap `idx` with the next smallest number on the right of `idx` and sort the array from `idx + 1` to `n`
- Flip
	+ Flip 0s and 1s to get max number of 1s in string. return start and end index. Kadane's algorithm - increment flipCount by 1 when 0 decrement by 1 when 1. If flipCount less than zero, reset it to zero and move left pointer to i + 1. Keep track of maxFlipped and set bounds to left pointer and current value of i when reached
- Continuous Sum Array
	+ Maintain a prefix sum of nums so far. Take modulo and check if remainder is in HashMap of `remainder -> index`. If exists, check difference of `currIndex - index >= 2` -> return true. Else loop finishes and return false
-  Maximum occurring element with equal probability
	+  

## Two pointers
- Container with most water
	+ Keep two pointers one on the start and other on the end of the array. Keep the pointer on the tallest (maximum) of two and increment/decrement the other. For example, if `a[start] > a[end] -> end-- else start++`. Keep computing max area (volume) as you go.

## Stacks & Queues
- Largest area histogram 
	+ add values to a stack and identify prev min and next min for each index. In order to do that pop values until values are greater than current. Default is -1 for left and n for right.

- Sliding window maximum 
	+ use deque (linkedlist), fill the window. When adding value, remove all elements less than current and then add current. repeat the process as you move forward. Store with indices only. When queue is full, remove indices less than `i-k`.

- minStack
	+ Insert `(2*newMin-oldMin)` to stack which will be less than `newMin`. When popping the element `e`, if less than `min` then compute the `oldMin = 2*min - e` and return `min`.

- Windowed Stream of numbers median
	+ Use max heap to store smaller elements and min heap to store larger elements. Keep balancing them when the height of the two differs by more than 1.
	+ Median = one of the roots of min or max heap depending on size or average of roots in case the size is equal.


## Tree
- Post order traversal
	+ Use 2 stacks. While s1 is non empty, as you pop tree nodes off, add left and right of popped node to s1. Always push values of popped node to s2. Use s2 to construct post order output.
- Level order traversal reverse depth
	+ Add nodes to queue in reverse order - right and then left.
	+ Add values to output list as you remove from the queue.
	+ Reverse output list
- Lowest Common Ancestor
	+ Find both values in the tree. If both exist then search else -1
	+ BST - If both less than current then left; If both greater than current then right; return current;
	+ Binary Tree - If root == val1 || root == val2 then root else check left and right. If left and right are both not null then root. If left == null then right else left
- Diameter of Binary Tree
	+ Get height of left subtree and right subtree. Get diameter of left and right subtree. Return `Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter))`.
- Diameter of N-ary Tree
	+ For each child, get height of the child. Get top two tallest children. For each child get max diameter. Return maximum of either maxDiameter of one of the children or `maxHeightChild + secondMaxHeightChild + 1`.
- Insert in BST
	+ Always insert a leaf node. Traverse and keep track of previous node. Create a new node and make it child of right/left leaf of previous based on value.
- Delete from BST
	+ In case of leaf node, simply delete the node. In case of node with single child, replace node with child subtree. In case of node with two children, copy contents of inorder successor to the node.
- Smallest Subtree with all the Deepest Nodes
	+ Run DFS for the left and right nodes. When `root == null`, return `<null,0>`. Else compare left distance and right distance. When the two distances are same, then current node is deepest node, return `<node, dist + 1>`. Otherwise return `<L or R, L.dist or R.dist>`.

## Strings
- Haystack Needle
	+ KMP
		* Build LPS array for the `pattern`. Start with `i = 1, len = 0, lps[0] = 0`. If `lps[i] == lps[len]` then `len++, lps[i] = len, i++` else -- if `len != 0` -> `lps[len] = lps[len - 1]` else `lps[i] = len, i++`
		* start by matching `pattern` and `txt`. Increment `i` & `j` if match. If `j` approaches `pattern.length` return true. If mismatch between characters at `i` & `j`, check if `j != 0` -> update `j = lps[j - 1]` else `i++`

- Convert string to Palindrome by insertions in the beginning
	+ `lpsInput = str + "$" + reverse str`. Build LPS array for `lpsInput` and then `output = str.length() - lps[lpsInput.length() - 1]`

- Convert string to palindrome by insertions in the end
	+ start with `left = 0, right = n - 1`. if characters match, then increment `matched`. If they don't match, check if `matched > 0`, set `r = r + matched`, reset `matched = 0`, `count = count++`. If `matched = 0` then increment `count` and `l`.

- Minimum Window Substring
	+ Construct a map of characters of the pattern to lookup in the string. Use sliding window to move the right pointer and characters to window count map. Use a counter `formed` which keeps track of keys that have matched on counts for both lookup and window maps. When `formed` equals `required`, check for min length based on left and right pointers and update ans. Run a while loop to shrink the left-right window by moving left up and decrementing formed when the count differs.
	

## Dynamic Programming
- Partition Equal Subset Sum
	+ Can be done through recursion + memoization. Compute cumulative sum of entire array. If `sum % 2 != 0` return false. Otherwise create a `lookup[n+1][sum+1]` with default value equal to -1. start populating it for each index starting from `n - 1`. Recursion - Look for `sum/2`. If `current element > target` return false.

## Greedy
- Task Scheduler
	+ Use task counts and add them to priority queue sorted in descending order. Create `time` and create a cooldown queue. Increment `time`, pick a task from priority queue, decrement `taskCount` and add it to dq with time when it will be out of cooldown `(taskCount, time+cooldown)`. Iterate through priority queue and queue until both are empty. return time. 

## Graph
- Course Schedule - Check if we can finish courses
	+ Same as detect a cycle in a graph. Will have to create a graph and traverse it through DFS. If you encounter any node that's marked as visiting during DFS, then return false.
- Shortest Bridge - Length of 0s between two islands of 1s
	+ Start with `0,0` and run dfs for the first 1 encountered. Add indices of 1s to the queue and set the 1s to -1 to mark them visited. Initialize levle to 0. Run bfs starting at each -1 and add all 0s, ignore -1s. Return level when you encounter first 1.
