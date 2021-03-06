 /*   
  * Copyright (C) 2013 Manish Jain <manishjain99@gmail.com> 
  * This file is part of DynamicJavaTuples.
  * 
  * DynamicJavaTuples is free software: you can redistribute it and/or modify
  * it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * (at your option) any later version.
  * 
  * DynamicJavaTuples is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  * 
  * You should have received a copy of the GNU General Public License
  * along with JavaTuple.  If not, see 
  * <http://www.gnu.org/licenses/>.
  */
package org.dynamicjavatuples;

import org.dynamicjavatuples.impl.TupleNumber;

public interface Decuple<A,B,C,D,E,F,G,H,I,J> extends Nonuple<A,B,C,D,E,F,G,H,I> {
	@TupleNumber(id=9)
	J getJ();
}
