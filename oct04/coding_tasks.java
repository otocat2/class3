package oct04;
import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class coding_tasks {




        public static void main(String[] args) {
            ArrayList<String> colors = new ArrayList<>();
            colors.add("Blue");
            colors.add("Green");
            colors.add("White");
            colors.add("Pink");
            System.out.println(colors);

            // iterate the list
            for (int i = 0; i < colors.size(); i++) {
                System.out.println(colors.get(i));
            }

            // insert an element into the array list at the first position.
            colors.add(1, "Black");
            System.out.println(colors);

            //retrieve an element (at a specified index) from a given array list.
            System.out.println("Get index 1: " + colors.get(1));

            //update specific array element by given element
            colors.set(1, "Light Black");
            System.out.println("Updated List : " + colors);

            //remove the third element from a array list.
            System.out.println("Before remove: " + colors);
            colors.remove(3);
            System.out.println("After remove: " + colors);

            //search an element in a array list.
            System.out.println("Search if array contains pink: " + colors.contains("Pink"));

            //sort a given array list
            Collections.sort(colors);
            System.out.println(colors);

            //copy one array list into another
            ArrayList<String> newColors = colors;
            System.out.println("New color list is: " + newColors);

            //shuffle elements in a array list.
            Collections.shuffle(newColors);
            System.out.println("Shuffled list is: " + newColors);

            //reverse elements in a array list.
            Collections.reverse(newColors);

            //compare two array lists.
            System.out.println("Colors list is equals to new colors? : " + colors.equals(newColors));

            //swap two elements in an array list.
            System.out.println("Before swap : " + colors);
            Collections.swap(colors, 3, 1); // swapping element at index 3 i.e. 40 and index 1 i.e. 20
            System.out.println("After swap " + colors);

            //join two array lists.
            colors.addAll(newColors);
            System.out.println("joined with new colors list " + colors);

            //empty an array list.
            colors.removeAll(colors);
            System.out.println("Empty colors list" + colors);

            //test an array list is empty or not
            System.out.println("Is color list empty? " + colors.isEmpty());

            //replace the second element of a ArrayList with the specified element.
            colors.add("Only red");
            colors.add("pink blue");
            colors.add("reddish orange");
            System.out.println(colors);

            colors.set(0, "Red");
            System.out.println(colors);

            //print all the elements of a ArrayList using the position of the elements.
            for (int k = 0; k < colors.size(); k++) {
                System.out.println("Position of: " + k + " is " + colors.get(k));
            }

        }//end main
    //end class

}
