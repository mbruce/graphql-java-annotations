/**
 * Copyright 2016 Yurii Rashkovskii
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 */
package graphql.annotations.processor.typeFunctions;


import org.testng.annotations.Test;

import static graphql.Scalars.GraphQLLong;
import static graphql.annotations.processor.typeFunctions.DefaultTypeFunctionTestHelper.testedDefaultTypeFunction;
import static org.testng.Assert.assertEquals;

public class LongFunctionTests {
    @Test
    public void buildType_longType_returnsGraphQLLong() {
        DefaultTypeFunction instance = testedDefaultTypeFunction();
        assertEquals(instance.buildType(long.class, null,null), GraphQLLong);
        assertEquals(instance.buildType(Long.class, null,null), GraphQLLong);
    }
}
