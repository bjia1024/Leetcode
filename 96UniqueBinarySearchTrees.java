// Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

// For example,
// Given n = 3, there are a total of 5 unique BST's.

//    1         3     3      2      1
//     \       /     /      / \      \
//      3     2     1      1   3      2
//     /     /       \                 \
//    2     1         2                 3

// Refer: http://fisherlei.blogspot.com/2013/03/leetcode-unique-binary-search-trees.html
// 以i为根节点的树，其左子树由[0, i-1]构成， 其右子树由[i+1, n]构成。
import java.util.*;

public class Solution {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public int numTrees(int n) {
        if(n == 0 || n == 1) return 1;
        if(map.containsKey(n)) return map.get(n);

        int result = 0;
        for (int i = 1; i <= n; i++) {
        	result += numTrees(i-1)*numTrees(n-i);
        }
        map.put(n, result);
        return result;
    }
}