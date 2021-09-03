package com.company;

public class Main {

    static class Item{
        private final String value;
        private Item next;

        public Item(String value) {
            this.value = value;
        }

        public void add(Item next) {
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public Item getNext() {
            return this.next;
        }


    }

    public static Item list( String firstValue, Item nextItem  ){
        Item newItem = new Item( firstValue);
        newItem.add(nextItem);
        return newItem;
    }

    public static void main(String[] args) {
        //create 1, 2, 3, apple, orange, banana (not using constructor)

        // print all items of the list using for() loop

        //print all items without for loop (you may add a new method to Main or to Item or whatever you need )

        //turn this into a tree (of course, significant changes in Item are needed):
        //            root
        //    numbers     fruits
        //  1    2    3   apple orange banana

        //go over the tree and print all items, depth first

        //same but now breadth first

        //define a graph of air flights using Item:
        //Los Angeles <-> San Francisco
        //Los Angeles <-> New York
        //San Francisco <-> New York
        //San Francisco <-> Boulder


        // add length of each flight in hours

        // calculate the total length of flight for all connections between two cities
        // test for Boulder -> New York


    }
}
