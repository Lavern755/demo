package com.example.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author liwen
 */
public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());

//        List<Powder> snow2 = Arrays.asList(new Light(), new Heavy());
//        Collections.addAll(snow2, new Crusty());

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy());

        // 显示声明集合类型,不是必须的
        List<Snow> snow2 = Arrays.<Snow>asList(new Light(), new Heavy());
        Collections.addAll(snow2, new Crusty());
    }
}


class Snow {}
class Powder extends Snow {}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
