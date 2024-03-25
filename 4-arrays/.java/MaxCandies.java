
import java.util.ArrayList;

import java.util.List; // Import List from java.util package

public class MaxCandies {
    public static void main(String[] args) {
        // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
        // here are n kids with candies. You are given an integer array candies, where
        // each candies[i] represents the number of candies the ith kid has, and an
        // integer extraCandies, denoting the number of extra candies that you have.
        // Return a boolean array result of length n, where result[i] is true if, after
        // giving the ith kid all the extraCandies, they will have the greatest number
        // of candies among all the kids, or false otherwise.

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println((kidsWithCandies(candies, extraCandies)));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int max = candies[0];
        // Find the maximum number of candies
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        // Check if each kid can have the greatest number of candies after adding extraCandies
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
