package com.sessions.session11.OtherExamples.ImplementingInterfaces;


/*
  Any class that inherits the PartialImplementation abstract class must implement
  the missing methods from the interface or be declared abstract as well.
 */
public class PartialImplementationSubclass extends PartialImplementation{

    @Override
    public void callback2(int param1, int param2) {

    }
}
