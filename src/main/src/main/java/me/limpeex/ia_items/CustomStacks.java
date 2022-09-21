package me.limpeex.ia_items;

import dev.lone.itemsadder.api.CustomStack;

import java.util.HashSet;

public class CustomStacks {
    public static HashSet<CustomStack> list = new HashSet<>();
    static CustomStack stack1 = CustomStack.getInstance("itemsadder:black_coupon");
    static CustomStack stack2 = CustomStack.getInstance("itemsadder:purple_coupon");
    static CustomStack stack3 = CustomStack.getInstance("itemsadder:red_coupon");
    static  CustomStack stack4 = CustomStack.getInstance("itemsadder:green_coupon");
    static CustomStack stack5 = CustomStack.getInstance("itemsadder:white_coupon");
    static CustomStack stack6 = CustomStack.getInstance("itemsadder:turquoise_coupon");
    static CustomStack stack7 = CustomStack.getInstance("itemsadder:light_blue_coupon");
    static CustomStack stack8 = CustomStack.getInstance("itemsadder:golden_coupon");
    public static void addingComponents() {
        list.add(stack1);
        list.add(stack2);
        list.add(stack3);
        list.add(stack4);
        list.add(stack5);
        list.add(stack6);
        list.add(stack7);
        list.add(stack8);
    }
}
