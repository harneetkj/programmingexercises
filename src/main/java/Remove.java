/*Given an array nums and a value val, remove all instances of that value in-place and return the new length.*/
public class Remove {
    public int length(int[] num, int value) {
        int i = 0;
        for (int j = 0; j < num.length; j++) {
            if (num[j] != value) {
                num[i] = num[j];
                i++;
            }
        }
        return i;
    }

}
