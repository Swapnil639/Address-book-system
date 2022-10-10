package com.bridgelabz;

import org.junit.Test;

import java.util.Arrays;

public class AddressBookClassTest {
    @Test
    public void givenContactDetails() {
        Contacts[] array = {
                new Contacts("S", "Pa", "Atp", "Atp", "Ap", "sw@", "515701", "8919584625"),
                new Contacts("A", "Pa", "M", "M", "M", "Ap@", "574165", "9059463010"),
        };
        AddressBookClass addressBookClass;
        addressBookClass = new AddressBookClass(Arrays.asList(array));
        addressBookClass.writeTheData(AddressBookClass.IOService.FILE_IO);
    }

    @Test
    public void readTheContactDetails() {
        AddressBookClass addressBookClass = new AddressBookClass();
        addressBookClass.readContactDetails(AddressBookClass.IOService.FILE_IO);

    }
}