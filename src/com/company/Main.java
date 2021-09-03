package com.company;

import java.util.*;
import java.util.function.Consumer;

public class Main {

    static class Item{
        private final String value;
        private final List<Item> children = new ArrayList<>();

        public Item(String value) {
            this.value = value;
        }

        public void add(Item child) {
            this.children.add( child );
        }

        public String getValue() {
            return value;
        }

        public List<Item> getChildren() {
            return Collections.unmodifiableList(children);
        }

        public void applyToAll(Consumer<Item> consumer){
            consumer.accept(this);
            children.forEach(kid -> kid.applyToAll(consumer));
        }

        public void applyBreadthFirst(Consumer<Item> consumer){
            Queue<Item> toProcess = new LinkedList<>();
            toProcess.add(this);
            Item next = null;
            while ((next =toProcess.poll()) != null){
                toProcess.addAll(next.getChildren());
                consumer.accept(next);
            }

        }

    }

//    public static Item list( String firstValue, Item nextItem  ){
//        Item newItem = new Item( firstValue);
//        newItem.setNext(nextItem);
//        return newItem;
//    }
//

    public static Item tree( String value, Item ... children ){
        Item root = new Item(value);
        Arrays.stream(children).sequential().forEach(root::add);
        return root;
    }

    public static void main(String[] args) {
//	    //create 1, 2, 3, apple, orange, banana
//        Item head = list("1", list("2", list("3", list("apple", list("orange", list("banana", null))))));
//        // print all items of the list using for loop
//
//        for( Item item = head; item != null; item = item.getNext() ){
//            System.out.println(item.getValue());
//        }
//
//        //print all items without for loop
//        head.forEach(i -> System.out.println(i.getValue()));

        //turn this into a tree:
        //            root
        //    numbers     fruits
        //  1    2    3   apple orange banana

        Item root = tree("root",
                        tree("numbers",
                                new Item("1"), new Item("2"), new Item("3")),
                        tree( "fruits",
                                new Item("apple"), new Item("orange"), new Item("banana"))
                );

        root.applyBreadthFirst(i -> System.out.println(i.getValue()));

    }
}
