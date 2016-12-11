package ru.otr.addressBook;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Ramil on 11.12.2016.
 */
public class StorageTest {

    @Test
    public void addRecord() {
        Storage storage = new Storage();

        Record bill = new Record("Bill");
        storage.addRecordToAddressBook(bill);
        int actual = storage.getAddressBook().size();
        assertEquals(4,actual);

        storage.addRecordToAddressBook(null);
        int actual2 = storage.getAddressBook().size();
        assertEquals(4,actual2);
    }

    @Test
    public void getPhones() {
        Storage storage = new Storage();

        List<String> phonesForIvanov = storage.getPhonesByName("Иванов И.И.");
        List<String> expected = Arrays.asList("+8 800 2000 500", "+8 800 200 600");
        assertEquals(expected, phonesForIvanov);

        List<String> phonesForSidorov = storage.getPhonesByName("Сидоров");
        assertEquals(null, phonesForSidorov);

        List<String> phonesForNull = storage.getPhonesByName(null);
        assertEquals(null, phonesForSidorov);
    }
}
