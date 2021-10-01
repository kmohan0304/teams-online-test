package com.company;

import java.util.*;

public class Main {

    static class Item {
        private final String value;
        private List<Item> children;

        public Item() {
            value = "";
            children = new ArrayList<>();
        }

        public Item(String value) {
            this.value = value;
            this.children = new ArrayList<>();
        }

        public List<Item> getChildren() {
            return children;
        }

        public void setChildren(List<Item> children) {
            this.children = children;
        }

        public String getValue() {
            return value;
        }


        /*helper methods*/

        public static Item first(String value) {
            return new Item(value);
        }

        public Item addChildren(List<Item> children) {
            this.children.addAll(children);
            return this;
        }


        public Item add(String itemValue) {
            Item anotherItem = new Item(itemValue);
            return anotherItem;
        }

        /*public static void print(Item head) {
            System.out.print("" + head.getValue());
            if (head.getNext() != null) {
                System.out.print(",");
                pr(head.getNext());
            }
        }*/

    }

    /*public static void print(Item head) {
            System.out.print("" + head.getValue());
            if (head.getNext() != null) {
                System.out.print(",");
                pr(head.getNext());
            }
        }*/


    private static void dfs(Item root, int level) {
        if (root == null) {
            return;
        }
        System.out.println("Level: " + level + " Item :" + root.getValue());
        level++;
        for (Item child : root.children) {
            dfs(child, level);
        }
    }

    private static void bfs(Item root) {
        Queue<Item> q = new ArrayDeque<>();

        q.add(root);

        while (!q.isEmpty()) {
            Item item = q.poll();
            System.out.println(item.getValue() + ",");
            q.addAll(item.children);
        }
    }

    public static void main(String[] args) {
        //create a linked list using only Item class constructor, setters and getters :
        //   apple, orange, banana, cat, dog, horse

        /*String s = "apple";
        Item item = new Item(s);

        s = "orange";
        Item item2 = new Item(s);
        item.setNext(item2);


        s = "banana";
        Item item3 = new Item(s);
        item2.setNext(item3);


        s = "cat";
        Item item4 = new Item(s);
        item3.setNext(item4);


        s = "dog";
        Item item5 = new Item(s);
        item4.setNext(item5);

        s = "horse";
        Item item6 = new Item(s);
        item5.setNext(item6);*/


        //pr(item);


        //do the same, using not using constructor
        /*String items[] = {"apple", "orange", "banana", "cat", "dog", "horse"};
        Item head = Item.first(items[0]);

        Item next = head;
        for (int i = 1; i < items.length; i++) {
            Item node = next.add(items[i]);
            next.setNext(node);
            next = node;
        }
        Item copyHead = head;
        pr(head);
        System.out.println();
        // print values of all items of the list using `while` loop . You can use `for` loop if you want
        for (; head != null; ) {
            System.out.print(head.getValue() + ",");
            head = head.getNext();
        }
        //print all items without `while` loop (you may want to add another method to Item class )
        System.out.println();
        Item.print(copyHead);
        */

        Item root = Item.first("root");

        Item pet = root.add("pets");
        Item cat = pet.add("cat");
        Item dog = pet.add("dog");
        Item horse = pet.add("horse");
        //children of pets
        pet.addChildren(List.of(cat, dog, horse));

        Item fruits = root.add("fruits");
        // children of fruits
        Item apple = fruits.add("apple"), orange = fruits.add("orange"), banana = fruits.add("banana");
        // add children to fruits
        fruits.addChildren(List.of(apple, orange, banana));

        //adding children to root
        root.addChildren(List.of(pet, fruits));


        dfs(root, 0);
        bfs(root);

        //change Item to be able to build a tree instead of a list.
        // Create this tree:
        //                root
        //             /        \
        //            /          \
        //         pets           fruits
        //      /  |  \         /  |    \
        //  cat, dog, horse  apple orange banana

        //go over the tree and print all items, depth first

        //same but now breadth first

        //using same Item class, define a graph of air flights :
        //Los Angeles <-> San Francisco
        //Los Angeles <-> New York
        //New York <-> Boulder

        // write a code that can find a route between two cities
        // find a way from LA to boulder

        // add length of each flight in hours

        // write calculate the total length of flight for all connections between two cities
        // test for Boulder -> New York


    }
}
