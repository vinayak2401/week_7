import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        while (true) {
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Search for an element");
            System.out.println("4. Update an element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int element = sc.nextInt();
                    System.out.print("Enter the index to insert at: ");
                    int index = sc.nextInt();
                    if (index < 0 || index > size) {
                        System.out.println("Invalid index!");
                    } else {
                        for (int i = size-1; i >= index; i--) {
                            arr[i+1] = arr[i];
                        }
                        arr[index] = element;
                        size++;
                        System.out.println("Element inserted successfully!");
                    }
                    break;
                case 2:
                    System.out.print("Enter the index to delete from: ");
                    int delIndex = sc.nextInt();
                    if (delIndex < 0 || delIndex >= size) {
                        System.out.println("Invalid index!");
                    } else {
                        for (int i = delIndex; i < size-1; i++) {
                            arr[i] = arr[i+1];
                        }
                        size--;
                        System.out.println("Element deleted successfully!");
                    }
                    break;
                case 3:
                    System.out.print("Enter the element to search for: ");
                    int searchElement = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == searchElement) {
                            System.out.println("Element found at index " + i);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found!");
                    }
                    break;
                
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            
            System.out.print("Current array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

}


// import java.util.Scanner;
// public class Arrayoperations {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int[] arr = {1, 2, 3, 4, 5};
//     int choice=0;
//     while (choice!=5) {
//       System.out.println("Choose an operation:");
//       System.out.println("1. Insertion");
//       System.out.println("2. Deletion");
//       System.out.println("3. Searching");
//       System.out.println("4. Updation");
//       System.out.println("5. Exit");
//       choice = sc.nextInt();
//       switch (choice) {
//         case 1:
//           System.out.println("Enter index to insert:");
//           int index = sc.nextInt();
//           System.out.println("Enter value to insert:");
//           int value = sc.nextInt();
//           for (int i = arr.length-1; i > index; i--) {
//             arr[i] = arr[i-1];
//           }
//           arr[index] = value;
//           System.out.print("Array after insertion:");
//           for(int i=0;i<arr.length;i++)
//             System.out.print(" " + arr[i]);
//           System.out.println();
//           break;
//         case 2:
//           System.out.println("Enter index to delete:");
//           int delIndex = sc.nextInt();
//           for (int i = delIndex; i < arr.length-1; i++) {
//             arr[i] = arr[i+1];
//           }
//           arr[arr.length-1] = 0;
//           System.out.println("Array after deletion:"); 
//           for(int i=0;i<arr.length;i++)
//             System.out.print(" " + arr[i]);
//           System.out.println();
//           break;
//         case 3:
//           System.out.println("Enter value to search:");
//           int searchValue = sc.nextInt();
//           int searchIndex = -1;
//           for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == searchValue) {
//               searchIndex = i;
//               break;
//             }
//           }
//           if(searchIndex==-1)
//             System.out.println("Not Found!!!!");
//           else
//             System.out.println("Index of " + searchValue + " is " + searchIndex);
//           break;
//         case 4:
//           System.out.println("Enter index to update:");
//           int updateIndex = sc.nextInt();
//           System.out.println("Enter new value:");
//           int updateValue = sc.nextInt();
//           arr[updateIndex] = updateValue;
//           System.out.println("Array after updation:");
//           for(int i=0;i<arr.length;i++)
//             System.out.print(" " + arr[i]);
//           System.out.println();
//           break;
//         case 5:
//           System.out.println("Thank you");
//           break;
//         default:
//           System.out.println("Invalid choice");
//       }
//     }
//   }
// }