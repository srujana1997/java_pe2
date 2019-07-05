package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
    public class MemberTest {

        public static Member member;
        public static Member.Membervariable membervariable;

        @BeforeClass
        public static void setUp()
        {
            member = new Member();
            membervariable = member.new Membervariable();
        }

        @AfterClass
        public static void tearDown()
        {
            member = null;
            membervariable = null;
        }

        @Test
        public void testForSetMember()
        {
            Member member1 = membervariable.setMember("Haritha", 22, 34);
            assertEquals(member1.name, "Haritha");
            assertEquals(member1.age, 22);
            assertEquals(member1.salary, 34,0);
        }

        @Test
        public void testForSetMemberGivingDoubleValue()
        {
            Member member1 = membervariable.setMember("Pooja", 21, 3.60);
            assertEquals(member1.name, "Pooja");
            assertEquals(member1.age, 21);
            assertEquals(member1.salary, 3,60);
        }

        @Test
        public void testForSetMemberGivingNullValue()
        {
            Member member1 = membervariable.setMember(null, 0, 0.60);
            assertEquals(member1.name, null);
            assertEquals(member1.age, 0);
            assertEquals(member1.salary, 0,60);
        }

}