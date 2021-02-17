package SecureKeys.test;

import SecureKeys.library.*;

public class TestPassword {

  public static void main(String[] args) {
    String password, key, salt;
    String wrongPassword;
    Boolean checker;

    password = "probandoPAssword123";
    wrongPassword = "estenoesMIContraseña";
    salt = PasswordUtils.generateSalt(512).get();
    key = PasswordUtils.hashPassword(password, salt).get();
    //checker = PasswordUtils.verifyPassword(password, key, salt);
    checker = PasswordUtils.verifyPassword(wrongPassword, key, salt);

    System.out.println("Salt: " + salt);
    System.out.println("Key: " + key);
    System.out.println("Your password is " + checker);
  }
}
