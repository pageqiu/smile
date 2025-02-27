/*
 * Copyright (c) 2010-2021 Haifeng Li. All rights reserved.
 *
 * Smile is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Smile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Smile.  If not, see <https://www.gnu.org/licenses/>.
 */

package smile.feature.imputation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import smile.test.data.*;

/**
 *
 * @author Haifeng Li
 */
public class SimpleImputerTest {

    public SimpleImputerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testUSArrests() throws Exception {
        System.out.println(USArrests.data);
        SimpleImputer imputer = SimpleImputer.fit(USArrests.data);
        System.out.println(imputer);
    }

    @Test
    public void testLongley() throws Exception {
        System.out.println(Longley.data);
        SimpleImputer imputer = SimpleImputer.fit(Longley.data);
        System.out.println(imputer);
    }
}