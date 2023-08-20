package com.exercise.leet.array;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1431 {

    public static void main(String[] args) {
        Solution1431 obj = new Solution1431();
        int[] candies = { 12,1,12 };
        int extraCandies = 10;
        List<Boolean> result = obj.kidsWithCandies(candies, extraCandies);
        System.out.println(JSON.toJSONString(result));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }

}
