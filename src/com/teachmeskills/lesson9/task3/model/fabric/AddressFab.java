package com.teachmeskills.lesson9.task3.model.fabric;

import com.teachmeskills.lesson9.task3.model.address.ClientAddress;

public class AddressFab {
    public static ClientAddress createAddress(){
        return new ClientAddress("Belarus", "Minsk", "Pobedy", 220000, 1);
    }
}
