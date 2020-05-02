/*
 * Given n = 5, and version = 4 is the first bad version.
 * 
 * call isBadVersion(3) -> false call isBadVersion(5) -> true call
 * isBadVersion(4) -> true
 * 
 * Then 4 is the first bad version.
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
   public int firstBadVersion(int n) {
    int i = 1, j = n;
    while (i < j) {
        int m = i + (j-i) / 2;
        if (isBadVersion(m)) {
            j = m;
        } else {
            i = m+1;
        }
    }
 
    if (isBadVersion(i)) {
        return i;
    }
 
    return j;
}
}
}
