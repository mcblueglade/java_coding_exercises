package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {

        boolean fromManchester = false;

        if ( person.getCity().equals("Manchester") ) {
            fromManchester = true;
        }
        return fromManchester;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        
        boolean watchFilm = false;

        if ( person.getAge() >= ageLimit ) {
            watchFilm = true;
        }
        return watchFilm;
    }
}