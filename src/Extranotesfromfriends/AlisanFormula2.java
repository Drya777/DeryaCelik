package Extranotesfromfriends;

public class AlisanFormula2 {
        public static void main(String[] args) {
            //Arraylist <DataType> VariableName = new ArrayList<>(); formula of ArrayList
            ArrayList<Integer>MyNewArray = new ArrayList<>();//how to create formula

/*
Basic operations of Arraylist
access (get) element
change (set) element
remove element
 */
        /*
      primitive -- Wrapper

        char -- Character
        int -- Integer
        double -- Double
        boolean -- Boolean
        short -- Short
        float -- Float
        byte -- Byte
        String is always String
         */


            // ADDING NEW ELEMENT TO ARRAYLIST  arraylistName.add(element)
            MyNewArray.add(97); // it will add the new number to list. no need to know index number
            int x = 11;
            MyNewArray.add(x);// we can add primitives in to an arraylist as well
            System.out.println("MyNewArray = " + MyNewArray);// no need "to.string" or anything to print out


            //ADDING PARAMETER BETWEEN OTHERS NOT AT THE END


            // for adding value as last index we are doing arraylistname.add(choosing (Double e)); but for adding somewhere in arraylist follow next lines
            // ArrayName.add(and choose "int index,Double element") then choose which index you wanna change then comma and add value
            MyNewArray.add(1,5);
            System.out.println("MyDoubleArray = " + MyNewArray); // we changed index one as 5 and now it prints
            MyNewArray.add(0,4);
            System.out.println("MyDoubleArray = " + MyNewArray);//  we changed index 0 as 4.7


            // GETTING AN ELEMENT FROM AN ARRAY              arraylistName.get(index number)
            System.out.println(MyNewArray.get(1));// it will print MyNewArray 's index one
            int o = MyNewArray.get(1); // also i can set it in to a parameter

            // LENGTH (SIZE)   arraylistName.size()           (return as int)
            System.out.println(MyNewArray.size()); // gets us the size of arraylist !!!!not length !!!
            // using in for loop
            for (int i = 0; i <MyNewArray.size() ; i++) {
                System.out.println(MyNewArray.get(i));   // we are using MyNewArray.get(i) NOT MyNewArray.char(i) or NOT MyNewArray[i]
            }

            //////////////////////////////////////////////////////////
            ArrayList<String> StringList = new ArrayList<>();
            StringList.add("Batman");
            StringList.add("Atman");
            StringList.add("Itmen");
            StringList.add("Hitmen");

            // SETTING (CHANGING) AN INDEX WITH DIFFERENT PARAMETER   arraylistName.set(index number, new element )

            StringList.set(2,"Antman");   // now Itman changed as Antman
            StringList.set(StringList.indexOf("Batman"),"Superman"); // by using .set and .indexof method we can reset a value as well



            // GETTING INDEX NUMBER OF AN ELEMENT               arraylistName.indexOf(element)  (return as int)
            System.out.println(StringList.indexOf("Atman")); // prints 1
            int a = StringList.indexOf("Batman"); // we can attend index number as a value as well
            System.out.println(StringList.indexOf("Spiderman")); // prints -1 as an error code because there is no "Spiderman" value


            // CHECKING ARRAYLIST CONTAIN   arraylistName.contains(element) ( return as boolean)
            System.out.println(StringList.contains("Antman"));//prints true
            System.out.println(StringList.contains("Catman")); //prints false



            ArrayList<Double>MyDoubleArray = new ArrayList<>();
            MyDoubleArray.add(1.7);
            MyDoubleArray.add(2.2);
            System.out.println("MyDoubleArray = " + MyDoubleArray);


            //FOR DELETING AN INDEX -----arraylistname.remove

            MyDoubleArray.remove(3);
            System.out.println("MyDoubleArray = " + MyDoubleArray);//it prints [4.7, 1.7, 5.2] because we removed third index (2.2).

            MyDoubleArray.remove(1.7); //also we can give object itself as well. now it prints [4.7, 5.2]
            System.out.println("MyDoubleArray = " + MyDoubleArray);


            //FOR DELETING EVERYTHING IN AN ARRAYLIST ----- arraylistname.clear

            MyDoubleArray.clear();
            System.out.println("MyDoubleArray = " + MyDoubleArray);//it will print [] because we delete everything

            //FOR CHECKING IS THERE ANY VALUE IN AN ARRALIST ----- arrayname.isEmpty()  (answer is true or false)


            System.out.println(MyDoubleArray.isEmpty()); // prints true because we delete everything



            ///COLLECTION UTILS


            //SETTING (ADDING) VALUES AT ONCE  arraylistName.addAll(Arrays.aslist(element1, element 2 , element 3 , ........))
            ArrayList<Integer>NewOne =new ArrayList<>();
            NewOne.addAll(Arrays.asList(11,2,35));

            //SORTING ARRAYLIST FROM SMALL TO BIG            Collections.sort(arraylistName) for sort(choose list <T> list)
            Collections.sort(NewOne); // it will sort arraylist as 2,11,35

            //SORTING ARRAYLIST FROM BIG TO SMALL   Collections.sort(ArrayListName,Collections.reverseOrder())
            Collections.sort(NewOne,Collections.reverseOrder()); // it will sort as 35,11,2

            //REVERSING AN ARRAYLIST
            Collections.reverse(NewOne); // it is also reverse the arraylist as well

            //SWAPPING VALUES    Collections.swap(ArraylistName,index number ,index number)
            Collections.swap(NewOne,0,2); // we swapped index 0  and index 2 values

            //GETTING A MAXIMUM VALUE IN AN ARRAYLIST
            System.out.println(Collections.max(NewOne));//gets 35 as minimum value

            //GETTING A MINIMUM VALUE IN AN ARRAYLIST
            System.out.println(Collections.min(NewOne));//gets 2 as minimum value

            //SHUFFLE ELEMENTS IN AN ARRAYLIST
            Collections.shuffle(NewOne); //It replaces the indexes of elements randomly

        }
        }
