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

        /*helper method for chain calls*/
        public Item add(String itemValue){
            Item anotherItem = new Item( itemValue );
            this.setNext(anotherItem);
            return anotherItem;
        }
    }

    public static void printList( Item item ){
        System.out.print("[");
        do{
            System.out.print(item.value);
            item = item.getNext();
            if(item != null){
                System.out.print(",");
            }
        }while( item != null );
        System.out.println("]");
    }

    public static void main(String[] args) {
        //Task 0. Example
        // Please, create a linked list of Item with following values, using only its constructor
        // and setNext() method:
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

        printList( apple );

        // Task 1. Understanding API
        // Please, create the same list, but now without using setNext() method.
        // Preferably do it in two lines of code.

        // Task 2. Navigating the list
        // Please, print all items of the list form Task 1 using `while` loop.
        // You can use `for` loop if you want.

        // Task 3. More elegant navigating
        // Please, print all items without using any loop.
        // You may want to add another method to Item class.


        // Task 4. More complex data structure.
        // Please, change the Item class to be able to build a tree instead of a list.
        // Using it, please create the following tree:
        //                root
        //             /        \
        //            /          \
        //         pets           fruits
        //      /  |  \         /  |    \
        //  cat, dog, horse  apple orange banana

        // Task 5. Navigating the tree
        // Please, implement a separate static method that goes
        // over the tree and print all items, depth first

        // Task 6. Navigating the tree, another strategy
        // Please, implement another method that does the same, but now breadth first.

        // Task 7. "Visitor" Pattern
        // Please, modify the method from Task 6 to be able to apply any code to every item in the
        // tree, without changing the method.
        // To test, use this method that goes over all items and print
        // only values longer than 3 characters.

        // Task 8. Graph data structure
        // Here is the information about cities connected by direct flights:
        // Los Angeles <-> San Francisco
        // Los Angeles <-> New York
        // New York <-> Boulder
        // Before you start coding, please, answer this question:
        // "Do you need any changes in Item class to be able to store this information?"
        // Please, create a data structure using Item class to capture this information.

        // Task 9. Navigating the graph.
        // Please, write a separate method that can find a route between two given cities using data
        // structure from Task 7.
        // Using this method, find a way from SF to Boulder.



    }
}
