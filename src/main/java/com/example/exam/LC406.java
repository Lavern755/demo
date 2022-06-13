package com.example.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liwen
 */
public class LC406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> {
            if (o1[1] - o2[1] != 0) {
                return o1[1] - o2[1];
            }
            if (o1[0] - o2[0] != 0) {
                return o1[0] - o2[0];
            }
            return 0;
        });

        List<int[]> peopleList = new ArrayList<>(Arrays.asList(people));
        int pos = 1;
        while (pos < peopleList.size()) {
            while (pos < people.length && peopleList.get(pos)[1] == peopleList.get(pos - 1)[1]) {
                pos++;
            }
            if (pos == peopleList.size()) {
                return getInts(peopleList);
            }
            int newTargetCount = peopleList.get(pos)[1];
            int count = 0;
            int insertPos = 0;
            while (insertPos < pos && count <= newTargetCount) {
                if (peopleList.get(insertPos)[0] >= peopleList.get(pos)[0]) {
                    count++;
                }
                insertPos++;
            }
            if (insertPos < pos || count > newTargetCount) {
                int[] removePer = peopleList.remove(pos);
                peopleList.add(insertPos - 1, removePer);
                pos = insertPos;
            }
            pos++;
        }

        return getInts(peopleList);
    }

    private int[][] getInts(List<int[]> peopleList) {
        int[][] ans = new int[peopleList.size()][2];
        for (int i = 0; i < peopleList.size(); i++) {
            ans[i] = peopleList.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        LC406 ls406 = new LC406();
//        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
//        int[][] people = { {5, 0},{7, 0}, {6, 1},{7, 1} {5, 2}, {4, 4}};
//        int[][] people = { {5, 0},{7, 0}, {6, 1},{7, 1} {5, 2}, {4, 4}};
//        int[][] people = { {5, 0},{7, 0}, {5, 2}, {6, 1},{7, 1} {4, 4}};
//        int[][] people = { {5, 0},{7, 0}, {5, 2}, {6, 1},{7, 1} {4, 4}};
//        int[][] people = { {5, 0},{7, 0}, {5, 2}, {4, 4} {6, 1},{7, 1}};
//        System.out.println(Arrays.toString(ls406.reconstructQueue(people)));

        int[][] people2 = {{40,11},{81,12},{32,60},{36,39},{76,19},{11,37},{67,13},{45,39},{99,0},{35,20},{15,3},{62,13},{90,2},{86,0},{26,13},{68,32},{91,4},{23,24},{73,14},{86,13},{62,6},{36,13},{67,9},{39,57},{15,45},{37,26},{12,88},{30,18},{39,60},{77,2},{24,38},{72,7},{96,1},{29,47},{92,1},{67,28},{54,44},{46,35},{3,85},{27,9},{82,14},{29,17},{80,11},{84,10},{5,59},{82,6},{62,25},{64,29},{88,8},{11,20},{83,0},{94,4},{43,42},{73,9},{57,32},{76,24},{14,67},{86,2},{13,47},{93,1},{95,2},{87,8},{8,78},{58,16},{26,75},{26,15},{24,56},{69,9},{42,22},{70,17},{34,48},{26,39},{22,28},{21,8},{51,44},{35,4},{25,48},{78,18},{29,30},{13,63},{68,8},{21,38},{56,20},{84,14},{56,27},{60,40},{98,0},{63,7},{27,46},{70,13},{29,23},{49,6},{5,64},{67,11},{2,31},{59,8},{93,0},{50,39},{84,6},{19,39}};
        System.out.println(Arrays.toString(ls406.reconstructQueue(people2)));
    }
}
