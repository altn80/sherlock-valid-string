/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.sherlock.valid.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author kbos
 */
public class Solution {

    public static String isValid(String s) {
        Map<Character, Integer> counts = new HashMap();
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        for (char c : sArray) {
            if (counts.containsKey(c)) {
                counts.put(c, (counts.get(c) + 1));
            } else {
                counts.put(c, 1);
            }
        }
        Set<Integer> setQuantities = new HashSet<>(counts.values());
        List<Integer> listQuantities = new ArrayList<>(setQuantities);

        boolean hasSameQuantities = listQuantities.size() == 1;

        if (hasSameQuantities) {
            return "YES";
        }

        if (listQuantities.size() == 2
                && counts.values().stream().filter(num -> num.equals(1)).count() == 1L) {
            return "YES";
        }

        int max = counts.values().stream().max((a, b) -> a.compareTo(b)).get();
        int min = counts.values().stream().min((a, b) -> a.compareTo(b)).get();
        if (listQuantities.size() == 2
                && max - min == 1L
                && counts.values().stream().filter(num -> num.equals(max)).count() == 1L) {
            return "YES";
        }

        return "NO";

    }

}
