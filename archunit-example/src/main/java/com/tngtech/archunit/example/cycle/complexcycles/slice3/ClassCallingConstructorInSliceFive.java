package com.tngtech.archunit.example.cycle.complexcycles.slice3;

import com.tngtech.archunit.example.cycle.complexcycles.slice5.InstantiatedClassInSliceFive;

public class ClassCallingConstructorInSliceFive { 
    public void callSliceFive() {
        new InstantiatedClassInSliceFive();
    }
}
