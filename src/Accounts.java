/**
 * Accounts class
 *
 * @author Kerly Titus
 */
public class Accounts {

  private String accountNumber;       /* Unique account number */
  private String accountType;         /* chequing, saving, credit */
  private String firstName;           /* First name of account holder */
  private String lastName;            /* Last name of account holder */
  private double balance;             /* Account balance */

  /**
   * Constructor method of Accounts class
   *
   * @param
   * @return
   */
  Accounts() {
    accountNumber = " ";
    accountType = " ";
    firstName = " ";
    lastName = " ";
    balance = 0.0;
  }

  /**
   * Accessor method of Accounts class
   *
   * @param
   * @return accountNumber
   */
  public String getAccountNumber() {
    return accountNumber;
  }

  /**
   * Mutator method of Accounts class
   *
   * @param accNumber
   * @return
   */
  public void setAccountNumber(String accNumber) {
    accountNumber = accNumber;
  }

  /**
   * Accessor method of Accounts class
   *
   * @param
   * @return accountType
   */
  public String getAccountType() {
    return accountType;
  }

  /**
   * Mutator method of Accounts class
   *
   * @param accType
   * @return
   */
  public void setAccountType(String accType) {
    accountType = accType;
  }

  /**
   * Accessor method of Accounts class
   *
   * @param
   * @return firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Mutator method of Accounts class
   *
   * @param fName
   * @return
   */
  public void setFirstName(String fName) {
    firstName = fName;
  }

  /**
   * Accessor method of Accounts class
   *
   * @param
   * @return lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Mutator method of Accounts class
   *
   * @param lName
   * @return
   */
  public void setLastName(String lName) {
    lastName = lName;
  }

  /**
   * Accessor method of Accounts class
   *
   * @param
   * @return balance
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Mutator method of Accounts class
   *
   * @param bal
   * @return
   */
  public void setBalance(double bal) {
    balance = bal;
  }

  /**
   * Create a String representation based on the Accounts Object
   *
   * @return String representation
   */
  public String toString() {
    return ("\nAccount number " + getAccountNumber() + "Account type " + getAccountType() + "First name " + getFirstName() + "Last Name " + getLastName() + "Balance " + getBalance());
  }

}