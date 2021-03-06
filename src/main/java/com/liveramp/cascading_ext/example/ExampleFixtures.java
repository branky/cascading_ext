/**
 *  Copyright 2012 LiveRamp
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.liveramp.cascading_ext.example;

import cascading.tap.Tap;
import cascading.tuple.Fields;
import cascading.tuple.Tuple;
import com.twitter.maple.tap.MemorySourceTap;

import java.util.Arrays;
import java.util.List;

public class ExampleFixtures {

  private static final List<Tuple> sources1 = Arrays.asList(
      tuple("A", 1l),
      tuple("B", 2l),
      tuple("C", 3l),
      tuple("E", 3l)
  );

  private static final List<Tuple> sources2 = Arrays.asList(
      tuple("A", 4),
      tuple("B", 5),
      tuple("C", 6),
      tuple("D", 6)
  );

  final static Tap SOURCE_TAP_1 = new MemorySourceTap(sources1,
      new Fields("field1", "field2"));
  final static Tap SOURCE_TAP_2 = new MemorySourceTap(sources2,
      new Fields("field3", "field4"));

  private static Tuple tuple(Object... objects) {
    return new Tuple(objects);
  }
}
