package com.company;

// Object

class DivingHobby {
    //class fields (properties)
    String Equipment;
    String Accomodations;
    String AfterDiveToDo;

    //class constructor here
    public DivingHobby(String Equipment, String Accomodations, String AfterDiveToDo) {
        //assigning values to the new instance fields
        this.Equipment = Equipment;
        this.Accomodations = Accomodations;
        this.AfterDiveToDo = AfterDiveToDo;
    }

    //class method
    public String toString() {
        return this.Equipment + " you will need " + this.Accomodations + ", " +
                this.AfterDiveToDo + ".";
    }

    //The applications class (Runner)//model to prep data
    class RunnerHobby {
        //instances
    }

    public static void main(String[] args) {
        DivingHobby divingInFL = new DivingHobby("BC", "Hotel", "Whatever");
        DivingHobby divingInCayman = new DivingHobby("Regulator", "Sunset House hotel",
                "Go to the starfish point");

        //Print the description for each instance
        System.out.println(divingInFL.toString());
        System.out.println(divingInCayman);

    }
}


