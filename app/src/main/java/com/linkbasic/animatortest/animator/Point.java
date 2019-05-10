package com.linkbasic.animatortest.animator;

/**
 * Created by linkbasic on 2019/5/8.
 */

public class Point {

    // 设置两个变量用于记录控件距离左侧和上侧控件的边距
    private int x;
    private int y;

    // 构造方法用于设置边距
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // get方法用于获取边距
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
