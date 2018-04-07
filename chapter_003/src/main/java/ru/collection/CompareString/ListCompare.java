package ru.collection.CompareString;
/**
 * компоратор для стринга
 */

import java.util.Comparator;
public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        for (int i = 0; i < left.length() && i < right.length(); i++){
            if (Character.compare(left.charAt(i), right.charAt(i)) == -1){
                result =  -1;
                break;
            } else  if (Character.compare(left.charAt(i), right.charAt(i)) == 1)
                result =  1;
            break;
        }
        return result;
    }

}