package com.axpconsulting.dracula;

import java.util.Calendar;
import java.util.Date;

public class Vampire {
    public boolean canHunt(Date dayTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dayTime);
        return calendar.get(Calendar.HOUR_OF_DAY) > 0 && calendar.get(Calendar.HOUR_OF_DAY) < 6;
    }
}
