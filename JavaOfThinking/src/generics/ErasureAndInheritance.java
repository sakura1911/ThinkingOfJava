package generics;

/**
 * @program: ThinkingOfJava
 * @description:
 * @author: Mr.Sakura
 * @create: 2021-09-17 17:20
 **/

class GenericBase<T> {
    private T element;

    public T get() {
        return element;
    }

    public void set(T arg) {
        element = arg;
    }
}

class Derived1<T> extends GenericBase<T> {}

class Derived2 extends GenericBase {}

public class ErasureAndInheritance {

    public static void main(String[] args) {
//        Derived2 d2 = new Derived2();
//        Object obj = d2.get();
//        d2.set(obj);

        Solution solution = new Solution();
        int[] arr = {-10,11,-1,0,1,2,12,-3};
        System.out.println(solution.maxSubArray(arr));

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.maxSubArray(arr));
    }

}

class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}

class Solution2 {
    public class Status {
        public int lSum, rSum, mSum, iSum;

        public Status(int lSum, int rSum, int mSum, int iSum) {
            this.lSum = lSum;
            this.rSum = rSum;
            this.mSum = mSum;
            this.iSum = iSum;
        }
    }

    public int maxSubArray(int[] nums) {
        return getInfo(nums, 0, nums.length-1).mSum;
    }

    public Status getInfo(int[] a, int l, int r) {
        if (l == r) {
            return new Status(a[l], a[l],a[l], a[l]);
        }

        int m = (l + r) >> 1;
        Status lSub = getInfo(a, 1, m);
        Status rSub = getInfo(a, m+1, r);
        return pushUp(lSub, rSub);
    }

    public Status pushUp(Status l, Status r) {
        int iSum = l.iSum + r.iSum;
        int lSum = Math.max(l.lSum, l.iSum + r.lSum);
        int rSum = Math.max(r.rSum, r.iSum + l.rSum);
        int mSum = Math.max(Math.max(l.mSum, r.mSum), l.rSum + r.lSum);
        return new Status(lSum, rSum, mSum, iSum);
    }

}

