import java.util.*;

public class DeDup {

    public int[] randomIntegers = {1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19
            , 1, 18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6, 19,
            13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11};

    public Integer[] removeDuplicateEntriesUsingSet() {
        Set<Integer> set = new HashSet<>();
        for (int i : randomIntegers) {
            set.add(i);
        }
        return set.toArray(new Integer[set.size()]);
    }

    public Integer[] removeDuplicateEntriesUsingList() {
        List<Integer> list = new ArrayList<>();
        for (int i : randomIntegers) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
        return list.toArray(new Integer[list.size()]);
    }

    public int[] removeDuplicatesWithoutUsingCollections(){
        int end = randomIntegers.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (randomIntegers[i] == randomIntegers[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        randomIntegers[shiftLeft] = randomIntegers[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        for(int i = 0; i < end; i++){
            whitelist[i] = randomIntegers[i];
        }
        return whitelist;
    }
}

