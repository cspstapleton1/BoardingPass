package com.company;

import java.util.Random;

public class GetETA {

    public String getArrivalTime(String Departure){

        Random rTime = new Random();
        int randomTime = rTime.nextInt(5) + 1, newETA = 0;
        String[] timeSplit = Departure.split(":", 0);
        newETA = Integer.valueOf(timeSplit[0]) + randomTime;
        if(newETA > 23){
            newETA = newETA - 24;
        }
        timeSplit[0] = String.valueOf(newETA);

        String timeMeld = timeSplit[0] + ":" + timeSplit[1];

        System.out.println(timeMeld);

        return timeMeld;

    }


}
