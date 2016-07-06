package com.wu.android.nearly.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nowy on 2016/7/6.
 */
public class TestData implements BaseData<List<String>> {
    @Override
    public List<String> getData() {
        List<String> data = new ArrayList<>();
        data.add("data1");
        data.add("data2");
        return data;
    }


}
