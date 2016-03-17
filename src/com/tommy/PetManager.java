package com.tommy;

import java.util.*;

public class PetManager {

    public static void main(String args[]) {
        Pet newPet = new Pet("", "", "", 0, "", 6);

        while(true) {
            newPet.addName();
            newPet.addPetType();
            newPet.addAddress();
            newPet.addDay();
            newPet.addTimes();
            newPet.writePetInfo();
        }
        //newPet
        }

    }
