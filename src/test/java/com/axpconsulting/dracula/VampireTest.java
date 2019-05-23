package com.axpconsulting.dracula;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.fest.assertions.Assertions.assertThat;

public class VampireTest {

    @Test
    public void canHunt_givenDayTime_False() {
        Vampire Dracula = new Vampire();

        Calendar calendar = Calendar.getInstance();
        calendar.set(3, 12, 22, 14, 0);
        Date dayTime = calendar.getTime();

        assertThat(Dracula.canHunt(dayTime)).isFalse();
    }

    @Test
    public void canHunt_givenNightTime_True() {
        Vampire Dracula = new Vampire();

        Calendar calendar = Calendar.getInstance();
        calendar.set(3, 12, 22, 4, 0);
        Date dayTime = calendar.getTime();

        assertThat(Dracula.canHunt(dayTime)).isTrue();
    }
}
