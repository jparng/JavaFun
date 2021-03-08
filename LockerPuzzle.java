public class LockerPuzzle {
    public static void main(String [] args){
        //Declare array of the boolean elements
        //Since we are starting from 1-100, and arrays start at [0],
        //create 101 elements
        String[] lockers = new String[101];
        
        closeLockers(lockers);
        changeStatus(lockers);
        displayLockers(lockers);

    } 
    //loop that closes all lockers initially
    public static void closeLockers(String[] lockers){
        for(int i = 0; i < lockers.length; i++){
            lockers[i] = "Closed";
        }
    }
    //Nested loop where if locker is opened, close it and vice versa
    public static void changeStatus(String[] lockers){
       for(int i = 1; i <= lockers.length; i++){
           for(int j = i; j < lockers.length; j += i){
               if(openLocker(lockers[j]))
                 lockers[j] = "Closed";
               else
                 lockers[j] = "Opened";
            }
          
        }
     
    }
    //Method for returning true (locker is opened)
    public static boolean openLocker(String l){
       return  l == "Opened";
    }
    //Display locker is opened or closed.
    public static void displayLockers(String [] lockers){

       for(int i = 1; i < lockers.length; i++){
           if(openLocker(lockers[i])){
            System.out.println("Locker " + i  + " is open ");
           }
           else
            System.out.println("Locker " +  i  + " is closed");
         }
        System.out.println();
    }
}
