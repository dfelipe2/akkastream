package com.lightbend.akkassembly;

import akka.actor.Cancellable;
import akka.stream.javadsl.Source;

import java.time.Duration;

public class BodyShop {
  private final Source<UnfinishedCar, Cancellable> cars;

   Source<UnfinishedCar, Cancellable> getCars() {
    return cars;
  }

  BodyShop(Duration buildTime){
    cars = Source.tick(buildTime, buildTime, new UnfinishedCar());
  }
}
