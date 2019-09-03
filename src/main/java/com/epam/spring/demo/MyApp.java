package com.epam.spring.demo;

/**
 * Hello world!
 *
 */
public class MyApp 
{
    public static void main( String[] args )
    {
       Coach theCoach = new TrackCoach();
       System.out.println(theCoach.getDailyWorkout());
    }
}
