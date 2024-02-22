import java.util.ArrayList;

public class Algorithms {
    public int negValues(ArrayList<Integer> list) {
        int count = 0;
        for (int num: list) {
            if (num < 0) count++;
        }
        return count;
    }

    public boolean stringFound(ArrayList<String> list, String target) {
        for (String str: list) {
            if (str.equals(target)) return true;
        }
        return false;
    }

    public boolean valueFound(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        for (int i = 0; i < listOne.size(); i++) {
            for (int j = 0; j < listTwo.size(); j++) {
                if (listOne.get(i).equals(listTwo.get(j))) return true;
            }
        }
        return false;
    }

    public int intAppearance(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) return i;
        }
        return -1;
    }

    public int intFound(int[] ints, int target) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == target) return i;
        }
        return -1;
    }

}
