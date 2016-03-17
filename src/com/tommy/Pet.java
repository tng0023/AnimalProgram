package com.tommy;

import java.util.*;

public class Pet {

    private String petName;
    private String petType;
    private ArrayList<String> pets;
    private String day;
    private int times;
    private int maxPets;
    private String address;

    public void addName() {
        Scanner name = new Scanner(System.in);
        System.out.println("What's the name of your pet?");
        petName = name.nextLine();
        if (petName == "") {
            System.exit(0);
        }else
           pets.add(petName);
    }
    public void addPetType() {
        Scanner type = new Scanner(System.in);
        System.out.println("What type of pet is it?");
        petType = type.nextLine();
    }

    public void addAddress(){
        Scanner addy = new Scanner(System.in);
        System.out.println("What is the owner's address?");
        address = addy.nextLine();
    }
    public void addDay() {
        Scanner dayOfWeek = new Scanner(System.in);
        System.out.println("Which day do you need to visit " + petName + " ?");
        day = dayOfWeek.nextLine();
    }
    public void addTimes(){
        Scanner time = new Scanner(System.in);
        System.out.println("How many times do you need to visit?");
        times = time.nextInt();
    }


    void addPet(String petName) {
        if (pets == null) {
            pets = new ArrayList<String>();
        }
        pets.add(petName);
    }


    public void writePetInfo() {
        for (String pet : this.pets)
            System.out.println(this.day + " : Visit " + this.petName + " the " + this.petType +
                    " " + this.times + " times" + "." + " Address: " + this.address);
            System.out.println("Pets visited: " + this.pets);
            System.out.println("There are " + getNumberofPets() + " pets to visit.");
            System.out.println("The max number of pets is " + this.maxPets + ".\n");
    }


    public int getNumberofPets(){
        return this.pets.size();
    }

    //Constructor
    public Pet(String petName, String petType, String day, int times, String address, int maxPets) {
        this.petName = petName;
        this.petType = petType;
        this.day = day;
        this.times = times;
        this.address = address;
        this.pets = new ArrayList<String>();
        this.maxPets = maxPets;
    }
}