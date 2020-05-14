package com.lightbend.akkassembly;

import akka.NotUsed;
import akka.stream.javadsl.Source;

import java.util.Set;

public class PaintShop {
  private final Source<Color, NotUsed> colors;

   Source<Color, NotUsed> getColors() {
    return colors;
  }

  PaintShop(Set<Color> colorSet){
    colors = Source.cycle(colorSet::iterator);
  }
}
