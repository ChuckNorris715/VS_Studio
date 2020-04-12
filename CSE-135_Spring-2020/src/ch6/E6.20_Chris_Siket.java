package ch6;

import java.util.ArrayList;
import java.util.List;

class ArraylistMerge {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Integer> listA = new ArrayList<Integer>();
        ArrayList<Integer> listB = new ArrayList<Integer>();
        listA.add(1);
        listA.add(4);
        listA.add(9);
        listA.add(16);

        listB.add(9);
        listB.add(7);
        listB.add(4);
        listB.add(9);
        listB.add(11);

        ArrayList<ArrayList> lists = new ArrayList<ArrayList>();

        lists.add(listA);
        lists.add(listB);

        ArrayList<Integer> listIndex = new ArrayList<Integer>();
        int numOfElements = 0;
        for (int i = 0; i < lists.size(); i++) {
            listIndex.add(0);
            numOfElements += lists.get(i).size();
        }

        ArrayList<Integer> resultList = mergeLists(lists, listIndex, numOfElements);
        System.out.println(resultList.toString());
    }

    /*
     * Function takes in ArrayList of lists, List containing indexes to use, and
     * total number of elements Returns a mergedList
     */

    private static ArrayList<Integer> mergeLists(List<ArrayList> lists, List<Integer> indices, int totalSize) {
        int currentMin = -1;
        int currentValue;
        int currentIndex;
        int indexToUpdate = 0;
        int currentCount;
        int currentElement = 0;

        ArrayList<Integer> resultList = new ArrayList<Integer>(totalSize);
        ArrayList<Integer> currentList = new ArrayList<Integer>();

        while (currentElement < totalSize) {

            for (int i = 0; i < lists.size(); i++) {
                currentList = lists.get(i);
                currentIndex = indices.get(i);

                if (currentIndex < currentList.size()) {

                    currentValue = currentList.get(currentIndex);

                    if (currentMin == -1) {
                        currentMin = currentValue;
                        indexToUpdate = i;
                    } else if (currentValue < currentMin) {
                        currentMin = currentValue;
                        indexToUpdate = i;
                    }
                }
            }
            resultList.add(currentMin);
            currentCount = indices.get(indexToUpdate);
            // currentCount++;
            indices.set(indexToUpdate, ++currentCount);
            currentElement++;
            currentMin = -1;
        }
        return resultList;
    }
}