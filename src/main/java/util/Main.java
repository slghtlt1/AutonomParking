package util;
//TODO: Schimb nueme Clasei in Main  gata

import db.OperattiDB;
import db.ValidateDB;
import exception.ExceptionCustom;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Chose one option(1 or 2):");
            int nr = s.nextInt();
            switch (nr) {                          //TODO: Pun functia de user si parola intr-o functie separata si sa fie private
                case 1:
                    verifyLogin();
                    break;

                case 2:
                    verifyRegister();
                    break;
                default:
                    throw new ExceptionCustom("You inserted an incorrect value, please insert 1 or 2");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static void verifyLogin() throws ExceptionCustom, SQLException, ClassNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert user:");
        String user = s.next();
        System.out.println("Insert password");
        String pass = s.next();
        if (ValidateDB.existDB(user) == true && ValidateDB.passCorrectLogin(pass) == true)
            System.out.println("User and passord is correct");
        else
            throw new ExceptionCustom("You did something wrong or you don't have an account");
    }

    private static void verifyRegister() throws SQLException {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert user:");  //TODO: functiile de register le pun intr-o functie separata + private
        String userRegister = s.next();

        System.out.println("Insert password:");
        String passRegister = s.next();

        do {
            System.out.println("Retype password, you need to insert alpha numerics charachters");
            passRegister = s.next();
        } while (ValidateDB.passCorrectRegister(passRegister) == true);
//asta e original si sterge te rog rahatul scris de jos ca sa fie diferit de main
        System.out.println("da");
        System.out.println("Confirm password:");
        String passRegisterConfirm = s.next();

        while (!(passRegister.equals(passRegisterConfirm))) {        //TODO: prima si confirmata le pun intr-o functie si daca e true merg mai departe
            System.out.println("Verify that passwords was the same");
            passRegisterConfirm = s.next();
        }
        OperattiDB.insertData(userRegister, passRegister);
    }
}
