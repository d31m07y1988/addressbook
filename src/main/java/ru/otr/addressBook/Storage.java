package ru.otr.addressBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ramil on 11.12.2016.
 */
public class Storage {
    private Map<String, Record> addressBook = new HashMap<>();

    {
        Record record1 = new Record("Иванов И.И.");
        Record record2 = new Record("Петров П.П.");
        Record record3 = new Record("Сидоров С.С.");
        record1.addPhone("+8 800 2000 500");
        record1.addPhone("+8 800 200 600");
        record2.addPhone("+8 800 2000 700");
        record3.addPhone("+8 800 2000 800");
        record3.addPhone("+8 800 2000 900");
        record3.addPhone("+8 800 2000 000");

        addRecordToAddressBook(record1);
        addRecordToAddressBook(record2);
        addRecordToAddressBook(record3);
    }

    //for Test
    public Map<String, Record> getAddressBook() {
        return addressBook;
    }

    public boolean addRecordToAddressBook(Record record) {
        if (record == null) return false;
        if (addressBook.containsKey(record.getName())) {
            System.out.println("Запись под данным именем уже есть. \n Добавление не возможно.");
            return false;
        }
        addressBook.put(record.getName(), record);
        return true;
    }

    public List<String> getPhonesByName(String recordName) {
        if (recordName == null) return null;
        if (!addressBook.containsKey(recordName)) return null;
        return addressBook.get(recordName).getPhones();
    }
}
