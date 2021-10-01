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

        /*helper methods for chain call*/

        public static Item first(String value) {
            return new Item(value);
        }

        public Item add(String itemValue){
            Item anotherItem = new Item( itemValue );
            this.setNext(anotherItem);
            return anotherItem;
        }

        public static void printList( Item item ){
            do{
                System.out.print(item.value);
                item = item.getNext();
                if(item != null){
                    System.out.print(",");
                }
            }while( item != null );
        }

    }

    public static void main(String[] args) {
        //Task 0. Example
        // Please, create a linked list of Item with following values, using only its constructor,
        // setters and getters:
        // "apple", "orange", "banana", "cat", "dog", "horse"

        Item apple = new Item("apple");
        Item orange = new Item("orange");
        Item banana = new Item("banana");
        Item cat = new Item("cat");
        Item dog = new Item("dog");
        Item horse = new Item("horse");
        apple.setNext(orange);
        orange.setNext(banana);
        banana.setNext(cat);
        cat.setNext(dog);
        dog.setNext(horse);

        Item.printList( apple );

        //Task 1. Understanding helper methods
        //do the same, but not using the Item constructor, preferably in one line of code

        //Task 2.
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
