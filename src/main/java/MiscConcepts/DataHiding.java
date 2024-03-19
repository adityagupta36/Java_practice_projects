package MiscConcepts;

/*
METHOD HIDING --> Security
Getter is used to accessing the private data
and
setter is used to modify the private data only after authentication.
 */
class Bank {

    // Private data (data hiding)
    private long CurBalance = 0;

    // Bank_id is checked for authentication
    long bank_id;
    String name;

    // Getter function to modify private data
    public long get_balance(long Id)
    {// Checking whether the user is authorised or unauthorised then only it will get access
        if (this.bank_id == Id) {
            // Return current balance
            return CurBalance;
        }
        // Unauthorised user
        return -1;
    }
    // Setter function
    public void set_balance(long balance, long Id)
    {
        // Comparing bank_id of user and the given Id
        // then only it will get access
        if (this.bank_id == Id) {
            // Update balance in current ID
            CurBalance = CurBalance + balance;
        }
    }
}
public class DataHiding {
    public static void main(String[] args) {
        Bank _emp = new Bank();
        // Assigning employee object values
        _emp.bank_id = 12345;
        _emp.name = "Roshan";

        _emp.set_balance(10000, 12345);
        // This will no get access as bank_id is given wrong so unauthorised user is not getting access that is data hiding

        long emp_balance = _emp.get_balance(12345);  // As this time it is valid user it will get access

        System.out.println("User Name" + " " + _emp.name);
        System.out.println("Bank_ID" + " " + _emp.bank_id);
        System.out.println("Current Balance" + " " + emp_balance);
    }
}
