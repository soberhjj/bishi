package com.hjj.jianzhioffer;

/**
 * @author soberhjj  2020/1/18 - 22:54
 */
//题目：跳台阶
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。
// 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
public class Problem_9 {
    public int JumpFloor(int target) {
        if (target <= 0)
            return 0;
        if (target == 1)
            return 1;
        if (target == 2)
            return 2;
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}
//分析：首先我们考虑最简单的情况。如果只有1级台阶，那显然只有一种跳法。
//如果有2级台阶，那就有两种跳的方法了：一种是分两次跳，每次跳1级；另外一种就是一次跳2级。
//现在我们再来讨论一般情况。我们把n级台阶时的跳法看成是n的函数，记为f(n)。
// 当n>2时，第一次跳的时候就有两种不同的选择：
// 一是第一次只跳1级，此时跳法数目等于后面剩下的n-1级台阶的跳法数目，即为f(n-1)；
// 另外一种选择是第一次跳2级，此时跳法数目等于后面剩下的n-2级台阶的跳法数目，即为f(n-2)。
// 因此n级台阶时的不同跳法的总数f(n)=f(n-1)+(f-2)。
//      /    1               n=1
//f(n)= ——   2               n=2
//      \    f(n-1)+(f-2)    n>2
//可以看出本题是斐波那契数列的应用。
