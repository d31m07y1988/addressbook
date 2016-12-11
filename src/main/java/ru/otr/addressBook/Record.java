package ru.otr.addressBook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramil on 11.12.2016.
 */
public class Record {

    private String name;
    private List<String> phones = new ArrayList<>();

    public Record(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null)
            name="";
        this.name = name.trim();
    }

    public List<String> getPhones() {
        return phones;
    }

    public void addPhone(String phoneNumber) {
        phones.add(phoneNumber);
    }

    @Override
    public String toString() {
        return name + ": phones:" + phones;
    }
}
