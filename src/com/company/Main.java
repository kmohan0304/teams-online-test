package com.company;

public class Main {

    static class Item{
        private final String value;
        private Item next;

        public Item(String value) {
            this.value = value;
        }

        public void setNext(Item next) {
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public Item getNext() {
            return this.next;
        }

        /*helper methods*/

        public static Item first(String value) {
            return new Item(value);
        }

        public Item add(String itemValue){
            Item anotherItem = new Item( itemValue );
            this.setNext(anotherItem);
            return anotherItem;
        }

    }

    public static void pr( Item item ){
        System.out.print(""+item.getValue());
        if(item.getNext() != null){
            System.out.print(",");
            pr(item.getNext());
        }
    }

    public static void main(String[] args) {
        //create a linked list using only Item class constructor, setters and getters :
        //   apple, orange, banana, cat, dog, horse

        //do the same, using not using constructor

        // print values of all items of the list using `while` loop . You can use `for` loop if you want

        //print all items without `while` loop (you may want to add another method to Item class )


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
