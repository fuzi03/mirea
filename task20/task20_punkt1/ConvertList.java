package task20.task20_punkt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertList {
    public static <T> List<T> convertToList(T array[])

    {

        List<T> list = new ArrayList<>();

        Collections.addAll(list, array);

        return list;

    }
}
