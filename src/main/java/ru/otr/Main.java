package ru.otr;

import ru.otr.addressBook.Storage;

import java.util.List;

/**
 * Created by Ramil on 11.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {
            Storage storage = new Storage();
            List<String> phonesByName = storage.getPhonesByName(args[0]);
            if (phonesByName == null) {
                System.out.println("Запись не найдена");
            } else {
                int i = 1;
                for (String phone : phonesByName) {
                    System.out.println(i++ + ". " + phone);
                }
            }
        }
    }
}
