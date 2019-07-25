package com.wyfdc.go.juc.forkjoin;

import com.wyfdc.go.utils.ArrayUtils;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {

    private int THREHOLD = 10;
    private int[] src;
    private Integer left;
    private Integer right;

    public SumTask(int[] src, Integer left, Integer right) {
        this.src = src;
        this.left = left;
        this.right = right;
    }

    @Override
    protected Integer compute() {

        if ((right - left) < THREHOLD) {
            Integer sum = 0;
            System.out.println(left + " to " + right);
            for (int i = left; i <= right; i++)
                sum += src[i];
            return sum;
        }
        //拆分数组
        Integer mid = (left + right) >> 1;
        SumTask leftTask = new SumTask(src, left, mid);
        SumTask rightTask = new SumTask(src, mid + 1, right);
/*        // 执行子任务
        leftTask.fork();
        rightTask.fork();

        // 等待任务执行结束合并其结果
        int leftResult = leftTask.join();
        int rightResult = rightTask.join();

        // 合并子任务
        Integer res = leftResult + rightResult;
        return res;*/

        invokeAll(leftTask, rightTask);
        return leftTask.join() + rightTask.join();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //生成单独数据
        int[] a = ArrayUtils.makeArray(45);
        System.out.println("单线程执行结果: " + ArrayUtils.sum(a));
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        SumTask task = new SumTask(a, 0, a.length - 1);
        ForkJoinTask<Integer> result = forkJoinPool.submit(task);
        System.out.println("fork.join执行结果: " + result.get());
    }
}
