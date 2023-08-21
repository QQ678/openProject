package com.exercise.leet.array;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class Solution605 {

    public static void main(String[] args) {
        Solution605 obj = new Solution605();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        Boolean result = obj.canPlaceFlowers(flowerbed, n);
        System.out.println(JSON.toJSONString(result));
    }

    public Boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        if (length == 1) {
            if ((n <= 1 && flowerbed[0] == 0 )|| n == 0) {
                return true;
            } else {
                return false;
            }
        }
        if ((length + 1) / 2 < n) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (i == 0 || i == length - 1 || (flowerbed[i-1] + flowerbed[i+1] == 0)) {
                if(i == 0) {
                    if (flowerbed[i] + flowerbed[i+1] == 0) {
                        -- n;
                        flowerbed[i] = 1;
                    }
                } else if (i == length - 1) {
                    if (flowerbed[i] + flowerbed[i-1] == 0) {
                        -- n;
                        flowerbed[i] = 1;
                    }
                } else if (flowerbed[i-1] + flowerbed[i] + flowerbed[i+1] == 0) {
                    -- n;
                    flowerbed[i] = 1;
                }
            }
        }
        return n <= 0;
    }

}
