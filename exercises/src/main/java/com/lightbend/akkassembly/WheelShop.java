package com.lightbend.akkassembly;

import akka.NotUsed;
import akka.actor.Cancellable;
import akka.stream.javadsl.Source;

import java.time.Duration;

public class WheelShop {
  private final Source<Wheel, NotUsed> wheels;

   Source<Wheel, NotUsed> getWheels() {
    return wheels;
  }

  WheelShop(){
    wheels = Source.repeat(new Wheel());
  }
}
